package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String uName;
    int uAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get reference to the intent

        Intent intent = getIntent();

        uName = intent.getStringExtra("name");
        uAge = intent.getIntExtra("age", -1);

        Toast.makeText(this, uName + ", Age: " + uAge, Toast.LENGTH_LONG).show();
    }
}