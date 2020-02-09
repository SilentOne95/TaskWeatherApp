package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class WeatherGeneral {

    @Json(name = "id")
    private Integer conditionId;
    @Json(name = "main")
    private String weatherParams;
    @Json(name = "description")
    private String description;
    @Json(name = "icon")
    private String iconId;

    public Integer getConditionId() {
        return conditionId;
    }

    public void setConditionId(Integer conditionId) {
        this.conditionId = conditionId;
    }

    public String getWeatherParams() {
        return weatherParams;
    }

    public void setWeatherParams(String weatherParams) {
        this.weatherParams = weatherParams;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }
}
