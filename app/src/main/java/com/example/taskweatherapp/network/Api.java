package com.example.taskweatherapp.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("data/2.5/forecast")
    Call<Weather> getWeather(
            @Query("lat") int lat,
            @Query("lon") int lng,
            @Query("units") String unitsType,
            @Query("appid") String appId);
}
