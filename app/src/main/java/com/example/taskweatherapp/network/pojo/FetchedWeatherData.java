package com.example.taskweatherapp.network.pojo;

public class FetchedWeatherData {

    private CurrentWeather currentWeather;
    private Weather weather;

    public FetchedWeatherData(CurrentWeather currentWeather, Weather weather) {
        this.currentWeather = currentWeather;
        this.weather = weather;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
