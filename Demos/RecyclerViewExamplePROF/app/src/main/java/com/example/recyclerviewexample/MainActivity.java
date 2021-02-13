package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Product> list = getData();

        Log.d("MainActivity" , ""+list.size());
        MyAdapter adapter = new MyAdapter(list);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(adapter);


    }

 public List<Product> getData(){

        List<Product> products = new ArrayList<>();

        Product p1 = new Product(" Android" , R.mipmap.android);

        products.add(p1);
     Product p2 = new Product(" iPhone" , R.mipmap.iphone);

     products.add(p2);
     Product p3 = new Product(" tablet" , R.mipmap.tablet);

     products.add(p3);
     return products;


 }
}