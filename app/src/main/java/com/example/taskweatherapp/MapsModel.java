package com.example.taskweatherapp;

import android.location.Location;

import com.example.taskweatherapp.network.RetrofitClient;
import com.example.taskweatherapp.network.pojo.CurrentWeather;
import com.example.taskweatherapp.network.pojo.FetchedWeatherData;
import com.example.taskweatherapp.network.pojo.Weather;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MapsModel implements MapsContract.Model {

    private final static String UNIT_TYPE_DATA = "metric";
    // TODO: Provide your api key from https://api.openweathermap.org/
    private final static String APP_ID = "";

    private MapsPresenter mPresenter;

    @Override
    public Disposable fetchDataFromServer(MapsPresenter presenter, Location location) {
        mPresenter = presenter;

        return getObservable(location)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> mPresenter.passDataToAdapter(data));
    }

    private Observable<FetchedWeatherData> getObservable(Location location) {
        return Observable.zip(getTodayWeather(location.getLatitude(), location.getLongitude()),
                getForecastWeather(location.getLatitude(), location.getLongitude()),
                FetchedWeatherData::new);
    }

    private Observable<CurrentWeather> getTodayWeather(Double lat, Double lng) {
        return RetrofitClient.getApi()
                .getCurrentWeather(lat, lng, UNIT_TYPE_DATA, APP_ID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private Observable<Weather> getForecastWeather(Double lat, Double lng) {
        return RetrofitClient.getApi()
                .getForecastedWeather(lat, lng, UNIT_TYPE_DATA, APP_ID)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}