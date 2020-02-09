package com.example.taskweatherapp.network;

import com.example.taskweatherapp.network.pojo.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("data/2.5/{typeOfData}")
    Call<Weather> getWeather(
            @Path("typeOfData") String typeOfData,
            @Query("lat") int lat,
            @Query("lon") int lng,
            @Query("units") String unitsType,
            @Query("appid") String appId);
}
