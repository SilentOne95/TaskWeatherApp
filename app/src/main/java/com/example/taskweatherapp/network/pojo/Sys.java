package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class Sys {

    @Json(name = "pod")
    private String pod;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }
}
