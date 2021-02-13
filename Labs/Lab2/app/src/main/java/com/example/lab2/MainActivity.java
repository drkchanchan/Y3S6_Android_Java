package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView toDisplay;
    String pizzaSize;
    String orderType;
    String toppingDetails;

    boolean pepperoni = false;
    boolean greenpepper = false;
    boolean onion = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toDisplay = findViewById(R.id.finalResult);
    }

    public void radioOptions(View v) {

        RadioButton radButton = (RadioButton) v;

        int id = v.getId();
        switch(id) {

            case R.id.largeRadio :
                if(radButton.isChecked()){
                    pizzaSize = "Large";
                }
                break;

            case R.id.mediumRadio :
                if(radButton.isChecked()){
                    pizzaSize = "Medium";
                }
                break;

            case R.id.smallRadio :
                if(radButton.isChecked()){
                    pizzaSize = "Small";
                }
                break;


            case R.id.deliveryRadio :
                if(radButton.isChecked()){
                    orderType = "Order type Delivery";
                }
                break;

            case R.id.pickupRadio :
                if(radButton.isChecked()){
                    orderType = "Order type PickUp";
                }
        }
    }

    public void checkboxTopping(View v) {
        CheckBox checkedToppings = (CheckBox) v;

        int id = checkedToppings.getId();

        switch (id){
            case R.id.pepperoni_Topping :
                if(checkedToppings.isChecked()){
                    pepperoni = true;
                }
                else{
                    pepperoni = false;
                }
                break;
            case R.id.greenpepper_Topping :
                if(checkedToppings.isChecked()){
                    greenpepper = true;
                }
                else{
                    greenpepper = false;
                }
                break;
            case R.id.onion_Topping :
                if(checkedToppings.isChecked()){
                    onion = true;
                }
                else{
                    onion = false;
                }
                break;
        }

        if (pepperoni){
            toppingDetails = "Pepperoni";

            if (greenpepper && onion){
                toppingDetails += " ,Green Peppers and Onions";
            }

            else if (greenpepper && !onion){
                toppingDetails += " and Green Peppers";
            }

            else if (!greenpepper && onion){
                toppingDetails += " and Onions";
            }
        }
        else if (greenpepper){
            toppingDetails = "Green Peppers";

            if (onion){
                toppingDetails += " and Onions";
            }
        }
        else if (onion){
            toppingDetails = "Onions";
        }
    }


    public void displayOrder(View v) {
        toDisplay = (TextView)findViewById(R.id.finalResult);

        if(pizzaSize == null){
            toDisplay.setText("Please select a Pizza Size!");
        }
        else if(orderType == null){
            toDisplay.setText("Please select a Order Type!");
        }
        else{
            if(!pepperoni && !greenpepper && !onion){
                toDisplay.setText(pizzaSize + " cheese pizza\n" + orderType);
            }
            else{
                toDisplay.setText(pizzaSize + " pizza with " + toppingDetails + "\n" +
                        orderType);
            }

        }
    }
}