package com.example.assignment1;

public class drink {

    private String drinkName;
    private double drinkPrice;
    private boolean isSelected;

    public drink(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.isSelected = false;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
