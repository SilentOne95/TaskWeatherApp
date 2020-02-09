package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class Clouds {

    @Json(name = "all")
    private Integer CloudinessPct;

    public Integer getCloudinessPct() {
        return CloudinessPct;
    }

    public void setCloudinessPct(Integer CloudinessPct) {
        this.CloudinessPct = CloudinessPct;
    }
}
