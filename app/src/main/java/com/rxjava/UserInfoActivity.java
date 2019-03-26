package com.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.basemodule.http.BaseCallBack;
import com.commonmodule.activity.BaseActivity;
import com.rxjava.model.UserInfoModel;
import com.rxjava.presenter.UserPresenter;

public class UserInfoActivity extends BaseActivity implements BaseCallBack<UserInfoModel> {


    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        initView();
    }

    private void initView() {
        userPresenter = new UserPresenter(this);
        userPresenter.getUserInfo("userinfo.json");
    }

    @Override
    public void onSuccess(UserInfoModel entity) {
        Log.e("XLog", "===========HeadUrl========" + entity.getHeadUrl());
        Log.e("XLog", "===========UserName========" + entity.getUserName());
        Log.e("XLog", "===========Sex========" + entity.getSex());
    }

    @Override
    public void onError(String errorInfo) {

    }
}
