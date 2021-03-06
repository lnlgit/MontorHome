package com.lnl.montorhome;

import android.app.Fragment;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by James Park
 * email: jim@linuxnetworks.co.uk
 * Date: 6/3/2559.
 */
public class SchematicFragment extends Fragment {
    String TAG = "SchematicFrag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        // Create new GLView instance for this Fragment
        GLSurfaceView glview = new MyGLSurfaceView(this.getActivity());
        return glview;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }
}
