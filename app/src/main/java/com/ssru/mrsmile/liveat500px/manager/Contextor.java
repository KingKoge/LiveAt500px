package com.ssru.mrsmile.liveat500px.manager;

import android.content.Context;

/**
 * Created by Suttichai on 4/27/2016.
 */
public class Contextor {

    private static Contextor contextor;
    private static Context appContext;

    private Contextor(){

    }

    public static Contextor getInstance() {
        if (contextor == null) {
            contextor = new Contextor();

        }
        return contextor;
    }

    public void init(Context appContext){
        this.appContext = appContext;
    }
    public Context getAppContext(){
        return appContext;
    }

}
