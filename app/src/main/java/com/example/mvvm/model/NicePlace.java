package com.example.mvvm.model;

public class NicePlace {

    private String title;
    private String imgUrl;

    public NicePlace(String imgUrl, String title) {
        this.title = title;
        this.imgUrl = imgUrl;
    }

    public NicePlace() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
