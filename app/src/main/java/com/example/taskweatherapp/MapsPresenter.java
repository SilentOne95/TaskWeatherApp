package com.example.taskweatherapp;

import android.location.Location;

import androidx.annotation.Nullable;

import com.example.taskweatherapp.network.pojo.FetchedWeatherData;

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
        if (mView != null) {
            mView.setUpAdapter(weatherData);
        }
    }

    @Override
    public void disposableDispose() {
        mCompositeDisposable.dispose();
    }
}
