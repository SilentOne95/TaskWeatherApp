package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

import java.util.List;

public class Weather {

    @Json(name = "cod")
    private String responseCode; // Internal parameter
    @Json(name = "message")
    private Integer message; // Internal parameter
    @Json(name = "cnt")
    private Integer numOfItems;
    @Json(name = "list")
    private List<WeatherList> weatherList = null;
    @Json(name = "city")
    private Location location;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getMessage() {
        return message;
    }

    public void setMessage(Integer message) {
        this.message = message;
    }

    public Integer getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(Integer numOfItems) {
        this.numOfItems = numOfItems;
    }

    public List<WeatherList> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<WeatherList> weatherList) {
        this.weatherList = weatherList;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}