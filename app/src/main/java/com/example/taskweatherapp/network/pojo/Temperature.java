package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

// Note: In order to get desired unit, specify while sending request
// Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit
public class Temperature {

    @Json(name = "temp")
    private Double temp;
    @Json(name = "feels_like")
    private Double tempFeelsLike;
    @Json(name = "temp_min")
    private Double tempMin;
    @Json(name = "temp_max")
    private Double tempMax;
    @Json(name = "pressure")
    private Integer atmPressureSeaDefault; // hPa
    @Json(name = "sea_level")
    private Integer atmPressureSea; // hPa
    @Json(name = "grnd_level")
    private Integer atmPressureGround; // hPa
    @Json(name = "humidity")
    private Integer humidityPct;
    @Json(name = "temp_kf")
    private Double tempKf; // Internal parameter

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempFeelsLike() {
        return tempFeelsLike;
    }

    public void setTempFeelsLike(Double tempFeelsLike) {
        this.tempFeelsLike = tempFeelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getAtmPressureSeaDefault() {
        return atmPressureSeaDefault;
    }

    public void setAtmPressureSeaDefault(Integer atmPressureSeaDefault) {
        this.atmPressureSeaDefault = atmPressureSeaDefault;
    }

    public Integer getAtmPressureSea() {
        return atmPressureSea;
    }

    public void setAtmPressureSea(Integer atmPressureSea) {
        this.atmPressureSea = atmPressureSea;
    }

    public Integer getAtmPressureGround() {
        return atmPressureGround;
    }

    public void setAtmPressureGround(Integer atmPressureGround) {
        this.atmPressureGround = atmPressureGround;
    }

    public Integer getHumidityPct() {
        return humidityPct;
    }

    public void setHumidityPct(Integer humidityPct) {
        this.humidityPct = humidityPct;
    }

    public Double getTempKf() {
        return tempKf;
    }

    public void setTempKf(Double tempKf) {
        this.tempKf = tempKf;
    }
}
