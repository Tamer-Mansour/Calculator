package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Test extends AppCompatActivity {
    EditText etText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = findViewById(R.id.etText);


        Calculator2 calc = new Calculator2();

        calc.performOperation(10.5);
        calc.performOperation("+");
        calc.performOperation(5.2);
        calc.performOperation("*");
        calc.performOperation(10);
        calc.performOperation("=");
        etText.setText("The Cal II : "+calc.getResults());

    }
}