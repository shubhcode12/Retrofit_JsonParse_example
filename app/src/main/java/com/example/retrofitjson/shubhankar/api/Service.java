package com.example.retrofitjson.shubhankar.api;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by shubhankar mahajan
 */

public interface Service {

    @GET("/bins/n5ck3")
    Call<JsonArray> readTeamArray();

}
