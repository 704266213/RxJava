package com.basemodule.http;

import okhttp3.OkHttpClient;

public interface ICreateRetrofit {

    OkHttpClient getOkHttpClient();

    String getBaseUrl();
}
