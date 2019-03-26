package com.rxjava.api;

import com.basemodule.http.BaseModel;
import com.rxjava.model.CinemaModel;
import com.rxjava.model.HotFilmModel;
import com.rxjava.model.UserInfoModel;

import java.util.List;
import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

public interface ApiService {

    @GET("data/master/WebContent/data/{pageNo}")
    Observable<BaseModel<HotFilmModel>> getFilmListInfo(@Path("pageNo")  String pageNo);

    @GET("data/master/WebContent/data/{userInfo}")
    Observable<BaseModel<UserInfoModel>> getUserInfo(@Path("userInfo") String userInfo);

    @GET("data/master/WebContent/data/{pageNo}")
    Observable<BaseModel<List<CinemaModel>>> getCinemaListInfo(@Path("pageNo") String pageNo);

    @FormUrlEncoded
    @POST("data/master/WebContent/data/{pageNo}")
    Observable<BaseModel<UserInfoModel>>  getInfo(@Path("pageNo") String pageNo, @FieldMap Map<String, String> fieldMap);

}