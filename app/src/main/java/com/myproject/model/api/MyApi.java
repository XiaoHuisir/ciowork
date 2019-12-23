package com.myproject.model.api;



import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface MyApi {



    @GET("index")
    Flowable<String> getIndexData();







}
