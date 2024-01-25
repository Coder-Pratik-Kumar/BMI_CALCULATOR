package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    EditText e1,e2,e3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.txtresult);
        e1=findViewById(R.id.edtweight);
        e2=findViewById(R.id.edtheightft);
        e3=findViewById(R.id.edtheightin);
        b1=findViewById(R.id.btnbmi);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt=  Integer.parseInt(e1.getText().toString());
              int heft=Integer.parseInt(e2.getText().toString());
              int hein=Integer.parseInt(e3.getText().toString());

              int totalinch=heft*12+hein;
              double totalcm=totalinch*2.53;
              double totalm=totalcm/100;

              double bmi=wt/(totalm*totalm);
              if(bmi>25){
                  t1.setText("You are overweighted");
              } else if (bmi<25) {

                  t1.setText("You are underweighted");

              }
              else {
                  t1.setText("You are healthy");
              }
            }
        });
    }
}