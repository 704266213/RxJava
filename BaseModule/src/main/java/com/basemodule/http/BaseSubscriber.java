package com.basemodule.http;

import android.util.Log;

import rx.Subscriber;

public class BaseSubscriber<T extends BaseModel> extends Subscriber<T> {

    private LoadStateCallBack loadStateCallBack;
    private BaseCallBack baseCallBack;

    public BaseSubscriber(BaseCallBack baseCallBack) {
        this.baseCallBack = baseCallBack;
    }

    public BaseSubscriber(LoadStateCallBack loadStateCallBack, BaseCallBack baseCallBack) {
        this.loadStateCallBack = loadStateCallBack;
        this.baseCallBack = baseCallBack;
    }

    public void onStart() {
        super.onStart();
        Log.e("XLog", "===========onStart========");
        //检查网络状态
//        boolean isNetWorkAvailable = NetWorkManager.isNetWorkAvailable(null);
//        if (isNetWorkAvailable) {
            if (loadStateCallBack != null) {
                loadStateCallBack.onBeforeLoad();
            }
//        } else {
//            onError("网络异常");
//            if (!isUnsubscribed()) {
//                unsubscribe();
//            }
//        }
    }

    @Override
    public void onCompleted() {
        Log.e("XLog", "===========onCompleted========");
    }

    @Override
    public void onError(Throwable e) {
        Log.e("XLog", "===========onError========");
        e.printStackTrace();
        if (loadStateCallBack != null) {
            loadStateCallBack.onLoadError();
        }
        baseCallBack.onError("操作异常");
    }

    @Override
    public void onNext(T resultModel) {
        Log.e("XLog", "===========resultModel========" + resultModel.state);

        if (resultModel.state == 200) {
            if (loadStateCallBack != null) {
                loadStateCallBack.onLoadSuccess();
            }
            baseCallBack.onSuccess(resultModel.result);
        } else {
            onError(resultModel.message);
        }
    }

    private void onError(String errorInfo) {
        if (loadStateCallBack != null) {
            loadStateCallBack.onLoadError();
        }
        baseCallBack.onError(errorInfo);
    }
}
