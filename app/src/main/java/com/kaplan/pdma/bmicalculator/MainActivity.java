package com.kaplan.pdma.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        final EditText editTextWeight = (EditText) findViewById(R.id.editTextWeight);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(editTextHeight.getText().toString());
                double weight = Double.parseDouble(editTextWeight.getText().toString());
                double bmi = weight/(height*height);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("bmi", bmi); //pass data by using a key-value pair
                startActivity(intent);
            }
        });
    }
}
