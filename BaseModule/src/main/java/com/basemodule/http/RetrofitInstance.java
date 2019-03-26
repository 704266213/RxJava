package com.basemodule.http;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {


    public <T> T create(Class<T> clazz, ICreateRetrofit createRetrofit) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(createRetrofit.getOkHttpClient())
                .baseUrl(createRetrofit.getBaseUrl())
                .build();
        return retrofit.create(clazz);
    }
}
