package com.bwie.wuyining_lianxi01.view;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;



public class MyApption extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
