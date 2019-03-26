package com.rxjava.presenter;

import com.basemodule.http.BaseCallBack;
import com.basemodule.http.BaseModel;
import com.basemodule.http.BaseSubscriber;
import com.basemodule.http.BaseSubscription;
import com.basemodule.http.RetrofitInstance;
import com.rxjava.api.ApiService;
import com.rxjava.http.DefaultOkHttpClient;
import com.rxjava.model.UserInfoModel;

import rx.Observable;


public class UserPresenter extends RetrofitInstance {


    private BaseCallBack baseCallBack;

    public UserPresenter(BaseCallBack baseCallBack) {
        this.baseCallBack = baseCallBack;
    }

    public void getUserInfo(String str) {

        ApiService apiService = create(ApiService.class, new DefaultOkHttpClient());
        Observable<BaseModel<UserInfoModel>> observable = apiService.getUserInfo(str);

        BaseSubscription baseSubscription = new BaseSubscription();
        BaseSubscriber baseSubscriber = new BaseSubscriber(baseCallBack);
        baseSubscription.doSubscribe(observable, baseSubscriber);
    }


}
