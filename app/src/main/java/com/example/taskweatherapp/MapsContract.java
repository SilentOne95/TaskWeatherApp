package com.example.taskweatherapp;

import android.location.Location;

import com.example.taskweatherapp.network.pojo.FetchedWeatherData;

import io.reactivex.disposables.Disposable;

public interface MapsContract {

    interface View {
        void initViews();
        void setUpPresenter();
        void setUpAdapter(FetchedWeatherData weatherData);
    }

    interface Presenter {
        void requestDataFromServer(Location location);
        void passDataToAdapter(FetchedWeatherData weatherData);
        void disposableDispose();
    }

    interface Model {
        Disposable fetchDataFromServer(MapsPresenter presenter, Location location);
    }
}
