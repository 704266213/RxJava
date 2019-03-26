package com.rxjava.model;

import java.util.List;

public class HotFilmModel {

     List<BannerModel> bannerModels= null;
     List<FilmInfoModel> filmModels = null;

    public HotFilmModel() {
    }

    public List<BannerModel> getBannerModels() {
        return bannerModels;
    }

    public void setBannerModels(List<BannerModel> bannerModels) {
        this.bannerModels = bannerModels;
    }

    public List<FilmInfoModel> getFilmModels() {
        return filmModels;
    }

    public void setFilmModels(List<FilmInfoModel> filmModels) {
        this.filmModels = filmModels;
    }
}
