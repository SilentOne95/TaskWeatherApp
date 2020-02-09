package com.example.taskweatherapp.network;

import com.example.taskweatherapp.network.pojo.Weather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    @GET("data/2.5/{typeOfData}")
    Observable<Weather> getWeather(
            @Path("typeOfData") String typeOfData,
            @Query("lat") Double lat,
            @Query("lon") Double lng,
            @Query("units") String unitsType,
            @Query("appid") String appId);
}
