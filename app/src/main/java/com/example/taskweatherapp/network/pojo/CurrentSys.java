package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class CurrentSys {

    @Json(name = "type")
    private Integer type; // Internal parameter
    @Json(name = "id")
    private Integer id; // Internal parameter
    @Json(name = "country")
    private String countryTag;
    @Json(name = "sunrise")
    private Integer sunrise;
    @Json(name = "sunset")
    private Integer sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryTag() {
        return countryTag;
    }

    public void setCountryTag(String countryTag) {
        this.countryTag = countryTag;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

}
