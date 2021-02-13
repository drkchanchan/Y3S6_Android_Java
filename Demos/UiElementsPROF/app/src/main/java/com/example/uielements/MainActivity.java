package com.example.uielements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView imageV;
    ToggleButton toggleButton;
    String optionRadioButton;
    boolean green = false;
    boolean red = false;
    boolean blue = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageV = findViewById(R.id.imageView);
        toggleButton = findViewById(R.id.toggleButton);
    }

    public void action(View view) {

        Toast.makeText(this, toggleButton.getText().toString() , Toast.LENGTH_LONG).show();

        if(toggleButton.isChecked()){
            imageV.setVisibility(View.VISIBLE);
        }else{
            imageV.setVisibility(View.INVISIBLE);
        }

    }

    public void radioButtonChecked(View view) {

        RadioButton radioButton = (RadioButton)view;

      int id =   view.getId();
      switch (id){

          case R.id.rad_yes :
              if(radioButton.isChecked()){
                  optionRadioButton = "Yes";
              }
              break;
          case R.id.rad_no :
              if(radioButton.isChecked()){
                  optionRadioButton = " No";
              }
              break;
          case R.id.rad_maybe :
              if(radioButton.isChecked()){
                  optionRadioButton = " Maybe";
              }
      }

      Toast.makeText(this, optionRadioButton , Toast.LENGTH_LONG).show();
    }

    public void checkBoxSelected(View view) {


        CheckBox checkBox = (CheckBox) view;
        int id = checkBox.getId();

            switch (id){
                case R.id.cb_green :
                    if(checkBox.isChecked()) {
                     // green is selected
                        green = true;
                    }else {
                      // green is not selected
                        green = false;
                    }
                   break;
                case R.id.cb_red :
                    if(checkBox.isChecked()) {
                        // green is selected
                        red = true;
                    }else {
                        // green is not selected
                        red = false;
                    }
                    break;

            }


          displaySelection();

        }


       void  displaySelection(){

      String select = "";

      if(green){
          select += " Green ";
      }
      if(red){
          select += "  red " ;
      }
      Toast.makeText(this, select, Toast.LENGTH_LONG).show();
    }
}