package com.example.android_fragment;

public class Product {

    private int imgPro;
    private String namePro;

    public Product(int imgPro, String namePro) {
        this.imgPro = imgPro;
        this.namePro = namePro;
    }

    public int getImgPro() {
        return imgPro;
    }

    public void setImgPro(int imgPro) {
        this.imgPro = imgPro;
    }

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }
}
