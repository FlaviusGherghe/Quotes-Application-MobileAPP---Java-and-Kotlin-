package com.example.aplicatiecitate.categorii;

public class CategoriiList {

    private final  String categorieNume;
    private  final int categorieImg;

    public CategoriiList(String categorieNume, int categorieImg) {
        this.categorieNume = categorieNume;
        this.categorieImg = categorieImg;
    }

    public String getCategorieNume() {
        return categorieNume;
    }

    public int getCategorieImg() {
        return categorieImg;
    }
}
