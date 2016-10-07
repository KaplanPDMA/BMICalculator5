package com.kaplan.pdma.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //retrieve data based on name and type
        double bmi = getIntent().getDoubleExtra("bmi", 0);

        TextView textViewBMI = (TextView) findViewById(R.id.textViewBMI);
        DecimalFormat df = new DecimalFormat("#.00");
        textViewBMI.setText(df.format(bmi));

        TextView textViewCategory = (TextView) findViewById(R.id.textViewCategory);
        String category;
        if(bmi > 30) {
            category = "Obese";
        } else if (bmi >= 25) {
            category = "Overweight";
        } else if (bmi >= 18.5) {
            category = "Normal";
        } else {
            category = "Underweight";
        }
        textViewCategory.setText(category);

    }
}
