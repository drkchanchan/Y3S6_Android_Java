package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Dish> listDishes;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        listDishes = getData();

        Log.d("MainActivity", ""+listDishes.size());
        Context context = getApplicationContext();

        adapter = new MyAdapter(listDishes, context);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    public List<Dish> getData() {

        List<Dish> dishes = new ArrayList<>();

        Dish d1 = new Dish("Skewers", R.drawable.skewers, (float) 4.5);
        dishes.add(d1);

        Dish d2 = new Dish("Burger", R.drawable.burger, (float) 3);
        dishes.add(d2);

        Dish d3 = new Dish("Fried Rice", R.drawable.fried_rice, (float) 3.5);
        dishes.add(d3);

        Dish d4 = new Dish("Curry", R.drawable.curry, (float) 4.5);
        dishes.add(d4);

        Dish d5 = new Dish("Shawarma", R.drawable.shawarma, (float) 4);
        dishes.add(d5);

        Dish d6 = new Dish("Fried Chicken", R.drawable.fried_chicken, (float) 3.8);
        dishes.add(d6);

        Dish d7 = new Dish("Chicken Tikka Masala", R.drawable.tikka_masala,(float) 4.3);
        dishes.add(d7);

        Dish d8 = new Dish("Beef Noodle Soup", R.drawable.pho,(float) 5);
        dishes.add(d8);

        return dishes;
    }
}