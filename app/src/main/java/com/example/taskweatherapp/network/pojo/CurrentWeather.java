package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

import java.util.List;

public class CurrentWeather {

    @Json(name = "coord")
    private Coordinates coordinates;
    @Json(name = "weather")
    private List<WeatherGeneral> weatherGeneralList = null;
    @Json(name = "base")
    private String base; // Internal parameter
    @Json(name = "main")
    private Temperature temperature;
    @Json(name = "visibility")
    private Integer visibilityDistance; // Meters
    @Json(name = "wind")
    private Wind wind;
    @Json(name = "clouds")
    private Clouds clouds;
    @Json(name = "dt")
    private Integer calculatedTimeUnix;
    @Json(name = "sys")
    private Sys currentSys;
    @Json(name = "timezone")
    private Integer timezone;
    @Json(name = "id")
    private Integer cityId;
    @Json(name = "name")
    private String cityName;
    @Json(name = "cod")
    private Integer cod; // Internal parameter

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<WeatherGeneral> getWeatherGeneralList() {
        return weatherGeneralList;
    }

    public void setWeatherGeneralList(List<WeatherGeneral> weatherGeneralList) {
        this.weatherGeneralList = weatherGeneralList;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Integer getVisibilityDistance() {
        return visibilityDistance;
    }

    public void setVisibilityDistance(Integer visibilityDistance) {
        this.visibilityDistance = visibilityDistance;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getCalculatedTimeUnix() {
        return calculatedTimeUnix;
    }

    public void setCalculatedTimeUnix(Integer calculatedTimeUnix) {
        this.calculatedTimeUnix = calculatedTimeUnix;
    }

    public Sys getCurrentSys() {
        return currentSys;
    }

    public void setCurrentSys(Sys currentSys) {
        this.currentSys = currentSys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}