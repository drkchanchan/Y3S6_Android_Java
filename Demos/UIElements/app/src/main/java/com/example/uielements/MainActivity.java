package com.example.uielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView imageV;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageV = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);
    }

    public void action(View view) {
        Toast.makeText(this, toggleButton.getText().toString(), Toast.LENGTH_LONG).show();

        if(toggleButton.isChecked()) {
            imageV.setVisibility(View.VISIBLE);
        }
        else {
            imageV.setVisibility(View.INVISIBLE);
        }
    }
}