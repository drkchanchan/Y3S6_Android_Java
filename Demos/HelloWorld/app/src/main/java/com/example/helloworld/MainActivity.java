package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText nameEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.new_layout);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);
        nameEdit = findViewById(R.id.userNameEdit);

        tv.setText(" Welcome to android dev!");

        Button btn = findViewById(R.id.button);

        btn.setText("Tap Me");
    }

    public void displayText(View view) {

        String name = nameEdit.getText().toString();

        tv.setText("Hi, " + name);

        //tv = findViewById(R.id.textView);
        //tv.setText("Button has been tapped!");
    }
}