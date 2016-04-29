package com.ssru.mrsmile.liveat500px.manager.http;

import com.ssru.mrsmile.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Suttichai on 4/29/2016.
 */
public interface ApiService {

    @POST("list") // no start '/'
    Call<PhotoItemCollectionDao> loadPhotoList();

}
