package com.example.measurement_of_land;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3;
    Button btnArea;
    TextView tvArea, myDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linkup Backend with UI.
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);

        tvArea = findViewById(R.id.showArea);

        btnArea = findViewById(R.id.calculateArea);

        myDetails = findViewById(R.id.myDetails);

        // Click event
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from UI and store local variable.
                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                String input3 = e3.getText().toString();

                try {
                    double a = Float.parseFloat(input1);
                    double b = Float.parseFloat(input2);
                    double c = Float.parseFloat(input3);

                    double s = (a + b + c)/2;

                    double area_of_triangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                    String formattedArea = String.format("%.5f", area_of_triangle);


                    // Display the result in the TextView
                    tvArea.setText(String.valueOf(formattedArea));
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid floating-point number
                    e.printStackTrace();
                }
            }
        });


        myDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDetailsPage();
            }
        });











    }



    public void myDetailsPage() {
        // Create an Intent to open the NewActivity
        Intent intent = new Intent(this, MyDetailsActivity.class);
        startActivity(intent);
    }

}