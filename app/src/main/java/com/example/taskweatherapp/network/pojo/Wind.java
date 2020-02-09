package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

// Note: In order to get desired unit, specify while sending request
// Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour
class Wind {

    @Json(name = "speed")
    private Double speed;
    @Json(name = "deg")
    private Integer direction; // Degrees (meteorological)

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }
}
