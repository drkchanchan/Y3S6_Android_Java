package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Explicit Intent Example
    public void openSecondActivity(View view) {
        String username;
        int age = 20;

        Intent intent = new Intent(this, SecondActivity.class);

        EditText nameEdit = findViewById(R.id.insertName);
        username = nameEdit.getText().toString();

        intent.putExtra("name", username);
        intent.putExtra("age", age);

        startActivity(intent);
    }

    //Implicit Intent Example

    public void openGoogle(View view){

        String url = "https://www.google.com";
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW);

        intent.setData(uri);
        startActivity(intent);


    }
}