package com.example.taskweatherapp;

import com.example.taskweatherapp.network.pojo.Weather;

import java.util.ArrayList;

import io.reactivex.disposables.Disposable;

public interface MapsContract {

    interface View {
        void initViews();
        void setUpPresenter();
        void setUpAdapter();
    }

    interface Presenter {
        void requestDataFromServer(Double lat, Double lng);
        void passDataToAdapter(ArrayList<Weather> weatherList);
        void disposableDispose();
    }

    interface Model {
        Disposable fetchDataFromServer(MapsPresenter presenter, Double lat, Double lng);
    }
}
