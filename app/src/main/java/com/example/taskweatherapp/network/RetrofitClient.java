package com.example.taskweatherapp.network;

import com.squareup.moshi.Moshi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://api.openweathermap.org/";

    private static Api mApi;
    private static Retrofit mRetrofit;

    public static Api getApi() {
        if (mApi == null) {
            mApi = provideRetrofit().create(Api.class);
        }

        return mApi;
    }

    private static Retrofit provideRetrofit() {
        if (mRetrofit == null) {
            synchronized (RetrofitClient.class) {
                if (mRetrofit == null) {
                    mRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(MoshiConverterFactory.create(getMoshi()))
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                }
            }
        }

        return mRetrofit;
    }

    private static Moshi getMoshi() {
        return new Moshi.Builder().build();
    }
}
