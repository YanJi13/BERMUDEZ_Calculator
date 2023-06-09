package com.example.bermudez_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText num1;
private EditText num2;
private Button add;
private Button sub;
private Button mult;
private Button div;
private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.txtNum1);
        num2 = (EditText)findViewById(R.id.txtNum2);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mult = (Button)findViewById(R.id.btnMult);
        div = (Button)findViewById(R.id.btnDiv);
        answer = (TextView) findViewById(R.id.txtResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int sum = myNumber1 + myNumber2;
                answer.setText("Answer is:"+ sum);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int diff = myNumber1 - myNumber2;
                answer.setText("Answer is:"+ diff);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int prod = myNumber1 * myNumber2;
                answer.setText("Answer is:"+ prod);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int myNumber1 = Integer.parseInt(num1.getText().toString());
                int myNumber2 = Integer.parseInt(num2.getText().toString());
                int quo = myNumber1 / myNumber2;
                answer.setText("Answer is:"+ quo);
            }
        });
    }
}