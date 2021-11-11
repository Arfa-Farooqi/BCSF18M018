package com.example.assignment_3_makhrijal_huruf;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExamPage extends AppCompatActivity implements View.OnClickListener{

    Button halq;
    Button lah;
    Button sha;
    Button tar;
    Button nit;
    Button lis;
    Button gun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page);
        halq=findViewById(R.id.Halqiyah);
        lah=findViewById(R.id.Lahatiyah);
        sha=findViewById(R.id.Shajariyah);
        tar=findViewById(R.id.Tarfiyah);
        nit=findViewById(R.id.Nit);
        lis=findViewById(R.id.Lisaveyah);
        gun=findViewById(R.id.Ghunna);

        halq.setOnClickListener(this);
        lah.setOnClickListener(this);
        sha.setOnClickListener(this);
        tar.setOnClickListener(this);
        nit.setOnClickListener(this);
        lis.setOnClickListener(this);
        gun.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.Halqiyah:
               intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Lahatiyah:
                intent = new Intent(ExamPage.this, Lahatiyah.class);
                startActivity(intent);
                break;
            case R.id.Shajariyah:
                intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Tarfiyah:
                intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Nit:
                intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Lisaveyah:
                intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;
            case R.id.Ghunna:
                intent = new Intent(ExamPage.this, Halqiyah.class);
                startActivity(intent);
                break;

        }


    }
}