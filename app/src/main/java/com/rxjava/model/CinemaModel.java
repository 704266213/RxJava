package com.rxjava.model;

public class CinemaModel {

    private String cinemaName;
    private String cinemaLocal;
    private String cinemaDistance;
    private float cinemaMinPrice = 0f;

    public CinemaModel() {
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaLocal() {
        return cinemaLocal;
    }

    public void setCinemaLocal(String cinemaLocal) {
        this.cinemaLocal = cinemaLocal;
    }

    public String getCinemaDistance() {
        return cinemaDistance;
    }

    public void setCinemaDistance(String cinemaDistance) {
        this.cinemaDistance = cinemaDistance;
    }

    public float getCinemaMinPrice() {
        return cinemaMinPrice;
    }

    public void setCinemaMinPrice(float cinemaMinPrice) {
        this.cinemaMinPrice = cinemaMinPrice;
    }
}
