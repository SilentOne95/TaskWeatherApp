package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class Coordinates {

    @Json(name = "lat")
    private Double lat;
    @Json(name = "lon")
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
