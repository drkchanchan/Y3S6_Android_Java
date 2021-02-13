package com.example.lab3;

public class Dish {

    private String Dish_name;
    private int Dish_image;
    private float Dish_rating;

    public Dish(String dish_name, int dish_image, float dish_rating) {
        Dish_name = dish_name;
        Dish_image = dish_image;
        Dish_rating = dish_rating;
    }

    public String getDish_name() {
        return Dish_name;
    }

    public void setDish_name(String dish_name) {
        Dish_name = dish_name;
    }

    public int getDish_image() {
        return Dish_image;
    }

    public void setDish_image(int dish_image) {
        Dish_image = dish_image;
    }

    public float getDish_rating() {
        return Dish_rating;
    }

    public void setDish_rating(float dish_rating) {
        Dish_rating = dish_rating;
    }
}
