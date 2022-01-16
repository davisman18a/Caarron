package com.example.caarron;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class User implements Serializable {
    private int Photo_id;
    private String Brand;
    private String Model;
    private String Year;
    private String Price;


    
    


    public int getPhoto_id() {
        return Photo_id;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getYear() {
        return Year;
    }

    public String getPrice() {
        return Price;
    }

    public User(int photo_id, String brand, String model, String year, String price){

        this.Photo_id = photo_id;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.Price = price;

    }
}
