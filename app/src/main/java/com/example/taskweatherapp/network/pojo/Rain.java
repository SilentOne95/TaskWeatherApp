package com.example.taskweatherapp.network.pojo;

import com.squareup.moshi.Json;

public class Rain {

    @Json(name = "3h")
    private Double rainVolume; // For last 3h

    public Double getRainVolume() {
        return rainVolume;
    }

    public void setRainVolume(Double rainVolume) {
        this.rainVolume = rainVolume;
    }
}
