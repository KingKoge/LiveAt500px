package com.ssru.mrsmile.liveat500px.manager;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ssru.mrsmile.liveat500px.manager.http.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nuuneoi on 11/16/2014.
 */
public class HttpManger {

    private static HttpManger instance;

    public static HttpManger getInstance() {
        if (instance == null)
            instance = new HttpManger();
        return instance;
    }

    private Context mContext;
    private ApiService service;

    private HttpManger() {
        mContext = Contextor.getInstance().getAppContext();

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://nuuneoi.com/courses/500px/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        service = retrofit.create(ApiService.class);
    }

    public ApiService getService() {
        return service;
    }

}
