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

        Calculator subtract = new Calculator(10.5,5.2,'+');

//        subtract.performOperation();
//        subtract.getResults();
        etText.setText(""+subtract.performOperation());
    }
}