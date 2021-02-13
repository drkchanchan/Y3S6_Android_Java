package com.example.spinner_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ArrayList<String> listThings = new ArrayList<>();

        listThings.add("item 1");
        listThings.add("item 2");
        listThings.add("item 3");
        listThings.add("item 4");
        listThings.add("item 5");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listThings);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listThings.get(position), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ListView listView = findViewById(R.id.listviewTest);

        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listThings);

        listView.setAdapter(adapter2);

    }
}