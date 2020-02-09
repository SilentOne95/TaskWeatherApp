package com.example.taskweatherapp;

import androidx.annotation.Nullable;

import com.example.taskweatherapp.network.pojo.Weather;

import java.util.ArrayList;

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
    public void requestDataFromServer(Double lat, Double lng) {
        Disposable disposable = mModel.fetchDataFromServer(this, lat, lng);
        mCompositeDisposable.add(disposable);
    }

    @Override
    public void passDataToAdapter(ArrayList<Weather> weatherList) {
        if (mView != null) {
            mView.setUpAdapter();
        }
    }

    @Override
    public void disposableDispose() {
        mCompositeDisposable.dispose();
    }
}
