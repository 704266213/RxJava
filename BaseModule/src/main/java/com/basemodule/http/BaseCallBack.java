package com.basemodule.http;

public interface BaseCallBack<T> {

    void onSuccess(T entity);

    void onError(String errorInfo);

}
