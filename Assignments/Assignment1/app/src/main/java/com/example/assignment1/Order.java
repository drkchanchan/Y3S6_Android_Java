package com.example.assignment1;

import java.util.List;

public class Order {

    private List <food> foodArray;
    private List <drink> drinkArray;

    public Order() {}

    public List<food> getFoodArray() {
        return foodArray;
    }

    public void setFoodArray(List<food> foodArray) {
        this.foodArray = foodArray;
    }

    public List<drink> getDrinkArray() {
        return drinkArray;
    }

    public void setDrinkArray(List<drink> drinkArray) {
        this.drinkArray = drinkArray;
    }
}
