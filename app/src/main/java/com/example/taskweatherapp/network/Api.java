package com.example.taskweatherapp.network;

import com.example.taskweatherapp.network.pojo.CurrentWeather;
import com.example.taskweatherapp.network.pojo.Weather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("data/2.5/weather")
    Observable<CurrentWeather> getCurrentWeather(
            @Query("lat") Double lat,
            @Query("lon") Double lng,
            @Query("units") String unitsType,
            @Query("appid") String appId);

    @GET("data/2.5/forecast")
    Observable<Weather> getForecastedWeather(
            @Query("lat") Double lat,
            @Query("lon") Double lng,
            @Query("units") String unitsType,
            @Query("appid") String appId);
}
