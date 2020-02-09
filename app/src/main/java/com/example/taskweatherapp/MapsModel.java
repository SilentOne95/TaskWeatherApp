package com.example.taskweatherapp;

import com.example.taskweatherapp.network.RetrofitClient;
import com.example.taskweatherapp.network.pojo.Weather;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MapsModel implements MapsContract.Model {

    private final static String CURRENT_WEATHER_NEEDED = "weather";
    private final static String FORECASTED_WEATHER_NEEDED = "forecast";
    private final static String UNIT_TYPE_DATA = "metric";

    private MapsPresenter mPresenter;

    @Override
    public Disposable fetchDataFromServer(MapsPresenter presenter, Double lat, Double lng) {
        mPresenter = presenter;

        return getObservable(lat, lng)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> mPresenter.passDataToAdapter(data));
    }

    private Observable<ArrayList<Weather>> getObservable(Double lat, Double lng) {
        ArrayList<Weather> list = new ArrayList<>();
        return Observable.zip(getTodayWeather(lat, lng), getForecastWeather(lat, lng),
                (weatherToday, weatherForecast) -> {
            list.add(weatherToday);
            list.add(weatherForecast);
            return list;
        });
    }

    private Observable<Weather> getTodayWeather(Double lat, Double lng) {
        return RetrofitClient.getApi()
                .getWeather(CURRENT_WEATHER_NEEDED, lat, lng, UNIT_TYPE_DATA, "3e96c6d9c55636fa61eeeba00428f256")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    private Observable<Weather> getForecastWeather(Double lat, Double lng) {
        return RetrofitClient.getApi()
                .getWeather(FORECASTED_WEATHER_NEEDED, lat, lng, UNIT_TYPE_DATA, "3e96c6d9c55636fa61eeeba00428f256")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}