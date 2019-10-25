package com.example.homework2;

public class FoodItem {
    private int food_id;

    private String food_name;
    private String description;
    private double price;
    private int food_pic;


    public FoodItem(int food_id, String food_name, double price, String description, int imageDrawableId){
        this.food_id = food_id;
        this.food_name = food_name;
        this.price = price;
        this.description = description;
        this.food_pic = imageDrawableId;
    }

    public  int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageDrawableId() {
        return food_pic;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.food_pic = imageDrawableId;
    }
}
