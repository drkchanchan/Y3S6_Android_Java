package com.example.assignment1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    Order newOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        newOrder = generateData();



        setContentView(R.layout.activity_order);
    }

    private Order generateData() {

        Order order = new Order();

        food f1 = new food("Fish", 12);
        order.getFoodArray().add(f1);

        food f2 = new food("Chicken", 11);
        order.getFoodArray().add(f2);

        food f3 = new food("Roasted Veggies", 10);
        order.getFoodArray().add(f3);

        food f4 = new food("Grilled Steak", 15);
        order.getFoodArray().add(f4);

        drink d1 = new drink("tea", 1.7);
        order.getDrinkArray().add(d1);

        drink d2 = new drink("Coffee", 1.8);
        order.getDrinkArray().add(d2);

        drink d3 = new drink("Orange Juice", 2);
        order.getDrinkArray().add(d3);

        drink d4 = new drink("Apple Juice", 3);
        order.getDrinkArray().add(d4);

        return order;
    }
}
