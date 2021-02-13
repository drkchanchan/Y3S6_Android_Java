package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View v) {

        firstName = findViewById(R.id.fNameInput);
        lastName = findViewById(R.id.lNameInput);
        message = findViewById(R.id.toModify);

        if (firstName.getText().toString().isEmpty() && lastName.getText().toString().isEmpty()) {
            message.setText("Hi there!");
        }
        else {
            String foo = String.format("Hi %s %s", firstName.getText(), lastName.getText());
            message.setText(foo);
        }
    }

}