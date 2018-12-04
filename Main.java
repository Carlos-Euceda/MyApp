package com.example.xafo.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {

    private EditText alt;
    private EditText peso;
    private EditText bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alt = (EditText) findViewById(R.id.altura);
        peso =(EditText) findViewById(R.id.Peso);
        bmi = (EditText) findViewById(R.id.BMI);

        Button but = (Button)findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               calculate();
           }
        });

    }


    public void calculate(){

        double al = Double.valueOf(alt.getText().toString());
        double pe = Double.valueOf(peso.getText().toString());

        double calc = (pe * 0.454)/(al*al);
        String Retorna = String.valueOf(calc);
        bmi.setText(Retorna);

    }
}