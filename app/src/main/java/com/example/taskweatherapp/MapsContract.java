package com.example.taskweatherapp;

import io.reactivex.disposables.Disposable;

public interface MapsContract {

    interface View {
        void initViews();
        void setUpAdapter();
    }

    interface Presenter {
        void requestDataFromServer();
        void passDataToAdapter();
        void disposableDispose();
    }

    interface Model {
        Disposable fetchDataFromServer(MapsPresenter presenter);
    }
}
