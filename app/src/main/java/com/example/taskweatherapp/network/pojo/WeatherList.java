package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

import java.util.List;

public class WeatherList {

    @Json(name = "dt")
    private Integer forecastedTimeUnix;
    @Json(name = "main")
    private Temperature temperature;
    @Json(name = "weather")
    private List<WeatherGeneral> weatherGeneralList = null;
    @Json(name = "clouds")
    private Clouds clouds;
    @Json(name = "wind")
    private Wind wind;
    @Json(name = "rain")
    private Rain rain;
    @Json(name = "sys")
    private Sys sys;
    @Json(name = "dt_txt")
    private String forecastedTimeIso;

    public Integer getForecastedTimeUnix() {
        return forecastedTimeUnix;
    }

    public void setForecastedTimeUnix(Integer forecastedTimeUnix) {
        this.forecastedTimeUnix = forecastedTimeUnix;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public List<WeatherGeneral> getWeatherGeneralList() {
        return weatherGeneralList;
    }

    public void setWeatherGeneralList(List<WeatherGeneral> weatherGeneralList) {
        this.weatherGeneralList = weatherGeneralList;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getForecastedTimeIso() {
        return forecastedTimeIso;
    }

    public void setForecastedTimeIso(String forecastedTimeIso) {
        this.forecastedTimeIso = forecastedTimeIso;
    }
}
