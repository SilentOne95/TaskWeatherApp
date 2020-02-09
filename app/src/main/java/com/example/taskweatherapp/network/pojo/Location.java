package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class Location {

    @Json(name = "id")
    private Integer id;
    @Json(name = "name")
    private String cityName;
    @Json(name = "coord")
    private Coordinates coordinates;
    @Json(name = "country")
    private String countryTag;
    @Json(name = "timezone")
    private Integer timezone;
    @Json(name = "sunrise")
    private Integer sunriseTime;
    @Json(name = "sunset")
    private Integer sunsetTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCountryTag() {
        return countryTag;
    }

    public void setCountryTag(String countryTag) {
        this.countryTag = countryTag;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public Integer getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }
}
