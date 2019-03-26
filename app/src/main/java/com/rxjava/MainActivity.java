package com.rxjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.basemodule.http.BaseCallBack;
import com.rxjava.model.UserInfoModel;
import com.rxjava.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.userInfo:
                Intent intent = new Intent(this, UserInfoActivity.class);
                startActivity(intent);
                break;
            case R.id.listData:

                break;
            case R.id.baseData:

                break;
        }
    }

}
