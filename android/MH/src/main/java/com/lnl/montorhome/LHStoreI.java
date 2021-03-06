package com.lnl.montorhome;

/**
 * Created by James Park
 * email: jim@linuxnetworks.co.uk
 * Date: 8/2/2559.
 */
public class LHStoreI extends BaseShape {


    float lineCoords[] =  {
            -0.008108f, -0.143632f, 0.3f,
            -0.005671f, -0.143798f, 0.3f,
            -0.003334f, -0.14428f, 0.3f,
            -0.001118f, -0.145058f, 0.3f,
            0.000956f, -0.14611f, 0.3f,
            0.002866f, -0.147414f, 0.3f,
            0.004591f, -0.148948f, 0.3f,
            0.006109f, -0.150691f, 0.3f,
            0.007399f, -0.152621f, 0.3f,
            0.008439f, -0.154717f, 0.3f,
            0.009209f, -0.156957f, 0.3f,
            0.009686f, -0.159319f, 0.3f,
            0.009850f, -0.161782f, 0.3f,
            -0.007180f, -0.143681f, 0.3f,
            -0.209369f, -0.143681f, 0.3f,
            -0.211299f, -0.143976f, 0.3f,
            -0.213080f, -0.144384f, 0.3f,
            -0.214712f, -0.144913f, 0.3f,
            -0.216197f, -0.145573f, 0.3f,
            -0.217535f, -0.146374f, 0.3f,
            -0.218728f, -0.147324f, 0.3f,
            -0.219777f, -0.148432f, 0.3f,
            -0.220683f, -0.149709f, 0.3f,
            -0.221447f, -0.151162f, 0.3f,
            -0.222071f, -0.152802f, 0.3f,
            -0.222555f, -0.154638f, 0.3f,
            -0.222900f, -0.156678f, 0.3f,
            -0.222900f, -0.15733f, 0.3f,
            -0.222900f, -0.159173f, 0.3f,
            -0.222900f, -0.162037f, 0.3f,
            -0.222900f, -0.165752f, 0.3f,
            -0.222900f, -0.170147f, 0.3f,
            -0.222900f, -0.175053f, 0.3f,
            -0.222900f, -0.180299f, 0.3f,
            -0.222900f, -0.185715f, 0.3f,
            -0.222900f, -0.191131f, 0.3f,
            -0.222900f, -0.196377f, 0.3f,
            -0.222900f, -0.201283f, 0.3f,
            -0.222900f, -0.205678f, 0.3f,
            -0.222627f, -0.207549f, 0.3f,
            -0.222153f, -0.209406f, 0.3f,
            -0.221480f, -0.211226f, 0.3f,
            -0.220606f, -0.212985f, 0.3f,
            -0.219534f, -0.214659f, 0.3f,
            -0.218262f, -0.216224f, 0.3f,
            -0.216791f, -0.217656f, 0.3f,
            -0.215122f, -0.218932f, 0.3f,
            -0.213254f, -0.220027f, 0.3f,
            -0.211189f, -0.220918f, 0.3f,
            -0.208927f, -0.22158f, 0.3f,
            -0.206467f, -0.221991f, 0.3f,
            -0.203794f, -0.221991f, 0.3f,
            -0.196239f, -0.221991f, 0.3f,
            -0.184501f, -0.221991f, 0.3f,
            -0.169277f, -0.221991f, 0.3f,
            -0.151263f, -0.221991f, 0.3f,
            -0.131157f, -0.221991f, 0.3f,
            -0.109656f, -0.221991f, 0.3f,
            -0.087459f, -0.221991f, 0.3f,
            -0.065261f, -0.221991f, 0.3f,
            -0.043760f, -0.221991f, 0.3f,
            -0.023654f, -0.221991f, 0.3f,
            -0.005640f, -0.221991f, 0.3f,
            -0.003044f, -0.221491f, 0.3f,
            -0.000746f, -0.220888f, 0.3f,
            0.001272f, -0.220166f, 0.3f,
            0.003027f, -0.219308f, 0.3f,
            0.004538f, -0.218296f, 0.3f,
            0.005824f, -0.217116f, 0.3f,
            0.006903f, -0.215749f, 0.3f,
            0.007792f, -0.214179f, 0.3f,
            0.008511f, -0.21239f, 0.3f,
            0.009077f, -0.210365f, 0.3f,
            0.009509f, -0.208087f, 0.3f,
            0.009825f, -0.20554f, 0.3f,
            0.009825f, -0.204943f, 0.3f,
            0.009825f, -0.203256f, 0.3f,
            0.009825f, -0.200634f, 0.3f,
            0.009825f, -0.197233f, 0.3f,
            0.009825f, -0.193209f, 0.3f,
            0.009825f, -0.188719f, 0.3f,
            0.009825f, -0.183916f, 0.3f,
            0.009825f, -0.178958f, 0.3f,
            0.009825f, -0.174f, 0.3f,
            0.009825f, -0.169197f, 0.3f,
            0.009825f, -0.164706f, 0.3f,
            0.009825f, -0.160683f, 0.3f,

    };

    short drawOrder[] = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                            51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                            61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                            71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                            81, 82, 83, 84, 85, 86,
                        };


    public LHStoreI(){
        this.initVertexBuff(lineCoords);
        this.initListBuff(drawOrder);
    }
}
