package com.puppu.liveat500px.manager.http;

import com.puppu.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by puppu on 14-Mar-16.
 */
public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();
}
