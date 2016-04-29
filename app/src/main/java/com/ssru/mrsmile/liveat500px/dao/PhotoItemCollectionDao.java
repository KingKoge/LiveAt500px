package com.ssru.mrsmile.liveat500px.dao;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoItemCollectionDao {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<PhotoItemDao> data = new ArrayList<>();

    /**
     * @return The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @param success The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * @return The data
     */
    public List<PhotoItemDao> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<PhotoItemDao> data) {
        this.data = data;
    }

}