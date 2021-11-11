package com.example.assignment_3_makhrijal_huruf;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button practiceBtn;
    Button examBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        practiceBtn=findViewById(R.id.practiceBtn);
        examBtn=findViewById(R.id.examBtn);

        practiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PracticePage.class);
                startActivity(intent);
            }
        });
        examBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ExamPage.class);
                startActivity(intent);
            }
        });



    }
}