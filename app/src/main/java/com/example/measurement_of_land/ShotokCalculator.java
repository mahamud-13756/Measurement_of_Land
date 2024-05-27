package com.example.measurement_of_land;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShotokCalculator extends AppCompatActivity {

    EditText etST1;

    TextView showAreaInKatha, showAreaInShotok;

    Button calculateShotok, calculateKatha, clearFieldsInShotok;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotok_calculator);


        etST1 = findViewById(R.id.etST1);

        showAreaInShotok =findViewById(R.id.showAreaInShotok);
        showAreaInKatha =findViewById(R.id.showAreaInKatha);

        calculateShotok =findViewById(R.id.calculateShotok);
        calculateKatha =findViewById(R.id.calculateKatha);
        clearFieldsInShotok =findViewById(R.id.clearFieldsInShotok);




        String inputArea = etST1.getText().toString();




        // Shotok calculate kora hoyeche aikhane
        calculateShotok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from UI and store local variable.
                //calAreaToShotok();
                String inputArea = etST1.getText().toString();


                try {
                    double a = Float.parseFloat(inputArea);

                    double store = a/435.6;

                    String ShotokArea = String.format("%.5f", store);



                    // Display the result in the TextView
                    showAreaInShotok.setText(String.valueOf(ShotokArea));
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid floating-point number
                    e.printStackTrace();
                }
            }
        });







        //

        calculateKatha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from UI and store local variable.
                String inputArea = etST1.getText().toString();


                try {
                    double a = Float.parseFloat(inputArea);

                    double store = a/720.0;

                    String KathaArea = String.format("%.5f", store);


                    // Display the result in the TextView
                    showAreaInKatha.setText(String.valueOf(KathaArea));
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid floating-point number
                    e.printStackTrace();
                }
            }
        });





        //Clear Button Operation

        clearFieldsInShotok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etST1.setText("");
            }
        });









    }



}