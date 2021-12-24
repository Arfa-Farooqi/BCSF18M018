package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc;
    Button dec;
    Button reset;
    TextView text;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc=findViewById(R.id.increase);
        dec=findViewById(R.id.decrease);
        reset=findViewById(R.id.reset);
        text=findViewById(R.id.text);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                text.setText(String.valueOf(counter));
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                text.setText(String.valueOf(counter));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                text.setText(String.valueOf(counter));
            }
        });





    }



}