package com.example.taskweatherapp;

import io.reactivex.disposables.Disposable;

public class MapsModel implements MapsContract.Model {

    private MapsPresenter mPresenter;

    @Override
    public Disposable fetchDataFromServer(MapsPresenter presenter) {
        return null;
    }
}
