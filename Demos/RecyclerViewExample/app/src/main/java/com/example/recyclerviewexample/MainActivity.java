package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Product> list = getData();
        MyAdapter adapter = new MyAdapter(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    public List<Product> getData() {

        List<Product> products = new ArrayList<>();

        Product p1 = new Product("Android", R.drawable.android_background);
        products.add(p1);
        Product p2 = new Product("Android", R.drawable.iphone_background);
        products.add(p2);

        return products;
    }
}