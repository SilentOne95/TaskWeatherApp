package com.example.taskweatherapp;

import androidx.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;

public class MapsPresenter implements MapsContract.Presenter {

    @Nullable
    private MapsContract.View mView;
    private MapsContract.Model mModel;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    MapsPresenter(@Nullable MapsContract.View view, MapsContract.Model model) {
        mView = view;
        mModel = model;
    }

    @Override
    public void requestDataFromServer() {

    }

    @Override
    public void passDataToAdapter() {

    }

    @Override
    public void disposableDispose() {

    }
}
