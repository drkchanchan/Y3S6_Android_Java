package com.example.pricecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Main Activity";

    TextView totalAmount;
    EditText toFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, " on create method");
    }

    public void displayTotal(View v) {
        // 1.get amount from user input
        // 2. add HST to the amount
        // 3. display total in bottom textView

        totalAmount = (TextView)findViewById((R.id.constraintTotal));
        toFind = (EditText)findViewById(R.id.constraintAmount);

        String foo = toFind.getText().toString();
        Double amount = Double.parseDouble(foo) * 1.13;

        totalAmount.setText(amount.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, " on start method");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, " on resume method");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, " on pause method");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, " on stop method");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, " on destroy method");

    }
}