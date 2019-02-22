#!/bin/bash

# ====================================================================================================================
#
# Script Name:      api_proxy_updater.sh
#
# Author:           James Park, Linux Networks Ltd.
# Date:             20/02/19
#
# Description:      The following script checks if the external ip address of it's internet connection has
#                   changed since it's last run.
#                   If the external ip address has changed, the forwarding address on a remote
#                   proxy ($PROXY_SERVER) is updated to point at this new external ip address.
#
# Run Information:  This script is run automatically every 20 minutes from a crontab entry.
#                   It expects a single argument, the hostname or IP address of the remote proxy
#                   server to update.
#
#                   e.g ./api_proxy_updater.sh proxy1
#
# Error Log:        Any errors or output associated with the script can be found in /opt/mh/log/api_proxy_updater.log.
#
# ====================================================================================================================

# Script paths.
BASE_PATH="/opt/mh"
LOG_PATH="${BASE_PATH}/log/api_proxy_updater.log"
PROXY_CONF_PATH="/etc/httpd/conf.d/api_proxy.conf"
HTTPD_PATH="/etc/init.d/httpd"
EXISTING_IP_PATH="${BASE_PATH}/run/existing_ip_addr"

# Variables.
SED_IP_REGEX="[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}.[0-9]\{1,3\}"
PROXY_SERVER=""


# Simple logging function.
function tolog() {
    echo "$(date +"%F-%H:%M:%S") $1" >> ${LOG_PATH}
}


# Only begin if we were passed one argument.
# $1 should be the address of a proxy server.
if [[ $# -eq 1 ]]; then
    PROXY_SERVER=$1

else
    tolog "No proxy hostname supplied."
    tolog "Usage: $0 <proxy hostname>"
    tolog "Exiting.\n"
    exit -1
fi


#
# Script begins.
#
tolog "External IP address updater begin."

# Obtain current external ip address and compare to the current ip address in EXISTING_IP.
current_ip_address=$(curl ifconfig.co 2>/dev/null)

# Check the content curl returned. Does it look like an IP address? Exit if it doesn't.
grep -E "^[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}$" - <<<${current_ip_address} 2>&1 > /dev/null
if [[ $? -ne 0 ]]; then
    tolog "Did not receive an IP address from ifconfig.co. Got:"
    tolog ${current_ip_address}
    tolog "Exiting.\n"
    exit -1
fi


# Is there a difference between our recorded address and the reported address.
diff ${EXISTING_IP_PATH} - <<<${current_ip_address} 2>&1 > /dev/null

# Check the return value of diff.
if [[ "$?" = "1" ]]; then
    tolog "IP address changed. New address is ${current_ip_address}."

    #
    # Use sed over shh to do an inline replacement of the external ip address.
    #
    cmd="sudo sed -E -i \"s/${SED_IP_REGEX}/${current_ip_address}/g\" ${PROXY_CONF_PATH}"
    # Execute, log stderr and stdout.
    ssh ${PROXY_SERVER} ${cmd} 2>&1 >> ${LOG_PATH}
    if [[ $? -eq 0 ]]; then
        tolog "Updated remote proxy address to $current_ip_address OK."
    else
        tolog "Failed to updated remote config."
    fi

    #
    # Reload httpd.
    # Archive the old IP address for prosperity.
    #
    cmd="sudo ${HTTPD_PATH} reload"
    # Execute, log stderr and stdout.
    ssh ${PROXY_SERVER} ${cmd} 2>&1 >> ${LOG_PATH}
    if [[ $? -eq 0 ]]; then
        tolog "Reloaded httpd OK."

        # Move old address to dated file.
        archive_f_name=$(date +"%F-%H-%M-%S")_ip_addr
        cmd="mv ${EXISTING_IP_PATH} ${BASE_PATH}/run/${archive_f_name}"
        ${cmd} && tolog "Archived old ip address to ${archive_f_name}."

        # Write new IP address to existing_ip_address file.
        echo ${current_ip_address} > ${EXISTING_IP_PATH}
    else
        tolog "Failed to reload remote httpd."
    fi

else
    tolog "IP address hasn't changed."
fi

tolog "External IP address updater end."
# Append a blank line to the logfile.
echo "" >> ${LOG_PATH}

exit 0
