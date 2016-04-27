package com.ssru.mrsmile.liveat500px;

import android.app.Application;

import com.ssru.mrsmile.liveat500px.manager.Contextor;

/**
 * Created by Suttichai on 4/27/2016.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initInstance();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    private void initInstance() {
        Contextor.getInstance().init(getApplicationContext());
    }
}
