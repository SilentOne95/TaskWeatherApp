package com.example.taskweatherapp.network;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("")
    Call<Weather> getWeather();
}
