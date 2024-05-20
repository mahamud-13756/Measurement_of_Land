package com.example.measurement_of_land;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home_page extends AppCompatActivity {
    RelativeLayout goTriangleCalculationPage, goShotokCalculationPage,rectangleCalculationPage,polygonCalculationPage;
    //EditText shotokCalPage;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page); // Make sure you have a corresponding home_page.xml layout file

        goShotokCalculationPage = findViewById(R.id.shotoCal);
        goTriangleCalculationPage = findViewById(R.id.tri);






        goShotokCalculationPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_page.this, ShotokCalculator.class));
            }
        });


        goTriangleCalculationPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_page.this, MainActivity.class));
            }
        });


    }
}
