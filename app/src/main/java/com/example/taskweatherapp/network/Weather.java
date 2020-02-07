package com.example.taskweatherapp.network;

import com.squareup.moshi.Json;

import java.util.List;

public class Weather {

    @Json(name = "cod")
    private String responseCode; // Internal parameter
    @Json(name = "message")
    private Integer message; // Internal parameter
    @Json(name = "cnt")
    private Integer numOfItems;
    @Json(name = "list")
    private List<WeatherList> weatherList = null;
    @Json(name = "city")
    private Location location;

    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public Integer getMessage() {
        return message;
    }
    public void setMessage(Integer message) {
        this.message = message;
    }
    public Integer getNumOfItems() {
        return numOfItems;
    }
    public void setNumOfItems(Integer numOfItems) {
        this.numOfItems = numOfItems;
    }
    public List<WeatherList> getWeatherList() {
        return weatherList;
    }
    public void setWeatherList(List<WeatherList> weatherList) {
        this.weatherList = weatherList;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}

class Location {

    @Json(name = "id")
    private Integer id;
    @Json(name = "name")
    private String cityName;
    @Json(name = "coord")
    private Coordinates coordinates;
    @Json(name = "country")
    private String countryTag;
    @Json(name = "timezone")
    private Integer timezone;
    @Json(name = "sunrise")
    private Integer sunriseTime;
    @Json(name = "sunset")
    private Integer sunsetTime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public String getCountryTag() {
        return countryTag;
    }
    public void setCountryTag(String countryTag) {
        this.countryTag = countryTag;
    }
    public Integer getTimezone() {
        return timezone;
    }
    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }
    public Integer getSunriseTime() {
        return sunriseTime;
    }
    public void setSunriseTime(Integer sunriseTime) {
        this.sunriseTime = sunriseTime;
    }
    public Integer getSunsetTime() {
        return sunsetTime;
    }
    public void setSunsetTime(Integer sunsetTime) {
        this.sunsetTime = sunsetTime;
    }
}

class Coordinates {

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

class WeatherList {

    @Json(name = "dt")
    private Integer forecastedTimeUnix;
    @Json(name = "main")
    private WeatherGeneral weatherGeneral;
    @Json(name = "weather")
    private List<Temperature> temperatureList = null;
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
    public WeatherGeneral getWeatherGeneral() {
        return weatherGeneral;
    }
    public void setWeatherGeneral(WeatherGeneral weatherGeneral) {
        this.weatherGeneral = weatherGeneral;
    }
    public List<Temperature> getTemperatureList() {
        return temperatureList;
    }
    public void setTemperatureList(List<Temperature> temperatureList) {
        this.temperatureList = temperatureList;
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

class Temperature {

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
    private Integer tempKf; // Internal parameter

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
    public Integer getTempKf() {
        return tempKf;
    }
    public void setTempKf(Integer tempKf) {
        this.tempKf = tempKf;
    }
}

class WeatherGeneral {

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

class Clouds {

    @Json(name = "all")
    private Integer CloudinessPct;

    public Integer getCloudinessPct() {
        return CloudinessPct;
    }
    public void setCloudinessPct(Integer CloudinessPct) {
        this.CloudinessPct = CloudinessPct;
    }
}

class Wind {

    @Json(name = "speed")
    private Double speed; // Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
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

class Rain {

    @Json(name = "3h")
    private Double rainVolume; // For last 3h

    public Double getRainVolume() {
        return rainVolume;
    }
    public void setRainVolume(Double rainVolume) {
        this.rainVolume = rainVolume;
    }
}

class Sys {

    @Json(name = "pod")
    private String pod;

    public String getPod() {
        return pod;
    }
    public void setPod(String pod) {
        this.pod = pod;
    }
}