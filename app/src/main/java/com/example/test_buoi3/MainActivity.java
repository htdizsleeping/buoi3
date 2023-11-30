package com.example.test_buoi3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText editTextFahrenheit, editTextCelsius;
    private Button buttonConvertToCelsius, buttonConvertToFahrenheit, buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFahrenheit = findViewById(R.id.editTextFahrenheit);
        editTextCelsius = findViewById(R.id.editTextCelsius);
        buttonConvertToCelsius = findViewById(R.id.buttonConvertToCelsius);
        buttonConvertToFahrenheit = findViewById(R.id.buttonConvertToFahrenheit);
        buttonClear = findViewById(R.id.buttonClear);

        buttonConvertToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double fahrenheit = Double.parseDouble(editTextFahrenheit.getText().toString());
                double celsius = (fahrenheit - 32) * 5 / 9;
                editTextCelsius.setText(String.valueOf(celsius));
            }
        });

        buttonConvertToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double celsius = Double.parseDouble(editTextCelsius.getText().toString());
                double fahrenheit = (celsius * 9 / 5) + 32;
                editTextFahrenheit.setText(String.valueOf(fahrenheit));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextFahrenheit.setText("");
                editTextCelsius.setText("");
            }
        });
    }
}