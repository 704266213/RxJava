package com.basemodule.http;

public interface LoadStateCallBack {

    void onBeforeLoad();

    void onLoadSuccess();

    void onLoadError();
}
