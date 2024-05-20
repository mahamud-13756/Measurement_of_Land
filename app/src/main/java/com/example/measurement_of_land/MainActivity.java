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
    Button btnArea, btnShotok, clearFieldsButton;
    TextView tvArea, tvShotok, myDetails;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linkup Backend with UI.
        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);

        tvArea = findViewById(R.id.showArea);
        tvShotok = findViewById(R.id.tvShotok);


        btnArea = findViewById(R.id.calculateArea);
        btnShotok = findViewById(R.id.calculateShotok);

        clearFieldsButton = findViewById(R.id.clearFields);


        myDetails = findViewById(R.id.myDetails);


        //calculation

        String input1 = e1.getText().toString();
        String input2 = e2.getText().toString();
        String input3 = e3.getText().toString();






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





        //calculate Shotok
        btnShotok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String input1 = e1.getText().toString();
                String input2 = e2.getText().toString();
                String input3 = e3.getText().toString();

                try {
                    double a = Float.parseFloat(input1);
                    double b = Float.parseFloat(input2);
                    double c = Float.parseFloat(input3);

                    double s = (a + b + c)/2;

                    double area_of_triangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    double shotok = area_of_triangle/435.6;

                    String formattedArea = String.format("%.5f", shotok);


                    // Display the result in the TextView
                    tvShotok.setText(String.valueOf(formattedArea));
                } catch (NumberFormatException e) {
                    // Handle the case where the input is not a valid floating-point number
                    e.printStackTrace();
                }


            }
        });












        // Clear button operation
        clearFieldsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
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