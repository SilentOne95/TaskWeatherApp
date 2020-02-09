package com.example.taskweatherapp;

import android.location.Location;

import androidx.annotation.Nullable;

import com.example.taskweatherapp.network.pojo.FetchedWeatherData;
import com.example.taskweatherapp.network.pojo.Weather;
import com.example.taskweatherapp.network.pojo.WeatherList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class MapsPresenter implements MapsContract.Presenter {

    @Nullable
    private MapsContract.View mView;
    private MapsContract.Model mModel;

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    MapsPresenter(@Nullable MapsContract.View view, MapsContract.Model model) {
        mView = view;
        mModel = model;
    }

    @Override
    public void requestDataFromServer(Location location) {
        Disposable disposable = mModel.fetchDataFromServer(this, location);
        mCompositeDisposable.add(disposable);
    }

    @Override
    public void passDataToAdapter(FetchedWeatherData weatherData) {
        Weather weather = weatherData.getWeather();
        // Filter data to leave only the one which is going to be displayed
        weather.setWeatherList(filter(weatherData));

        if (mView != null) {
            mView.setUpAdapter(weatherData);
        }
    }

    @Override
    public void disposableDispose() {
        mCompositeDisposable.dispose();
    }

    private List<WeatherList> filter(FetchedWeatherData weatherData) {
        List<WeatherList> filteredItemList = new ArrayList<>();

        for (WeatherList listItem : weatherData.getWeather().getWeatherList()) {
            // Check if forecast is for afternoon
            if (listItem.getForecastedTimeIso().contains("12:00")) {
                Date date = new Date(listItem.getForecastedTimeUnix() * 1000L);
                String weatherDayOfWeek = new SimpleDateFormat("dd", Locale.getDefault()).format(date.getTime());
                // Check if forecast is not for the same day
                if (getDayOfWeek() < Integer.parseInt(weatherDayOfWeek)) {
                    filteredItemList.add(listItem);
                }
            }
        }
        return filteredItemList;

    }

    private int getDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        return Integer.parseInt(new SimpleDateFormat("dd", Locale.getDefault()).format(date.getTime()));
    }
}
