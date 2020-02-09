package com.example.taskweatherapp.network;

import com.squareup.moshi.Moshi;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
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
                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
                interceptor.level(HttpLoggingInterceptor.Level.BASIC);
                OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

                if (mRetrofit == null) {
                    mRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(MoshiConverterFactory.create(getMoshi()))
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(client)
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
