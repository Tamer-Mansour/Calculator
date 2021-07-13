package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Test extends AppCompatActivity {
    EditText etText,etTestc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etText = findViewById(R.id.etText);
        etTestc2 = findViewById(R.id.etTestc2);

        Calculator subtract = new Calculator();

        subtract.setOperandOne(10.5);
        subtract.setOperation("+");
        subtract.setOperandTwo(5.2);

        etText.setText(""+subtract.getResults());


        Calculator2 calc = new Calculator2();

        etText.setText(""+subtract.performOperation());
        calc.performOperation(10.5);
        calc.performOperation("+");
        calc.performOperation(5.2);
        calc.performOperation("*");
        calc.performOperation(10);
        calc.performOperation("=");
        etTestc2.setText(""+calc.getResults());

    }
}