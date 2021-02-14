package com.example.assignment1;

public class food {

    private String foodName;
    private double foodPrice;
    private boolean isSelected;

    public food(String foodName, double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.isSelected = false;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
