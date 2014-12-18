package com.example.yannhubert.firstopenglesapp;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by yannhubert on 18/12/2014.
 */
class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(2);


        // Set the Renderer for drawing on the GLSurfaceView
        // setRenderer(new MyRenderer());
        mRenderer = new MyGLRenderer();
        setRenderer(mRenderer);

        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}