package com.example.assignment_3_makhrijal_huruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrontPage extends AppCompatActivity {
    TextView repoBtn;
    Button nextBtn;
    String link="https://github.com/Arfa-Farooqi/BCSF18M018";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        repoBtn=findViewById(R.id.repoLink);
        nextBtn=findViewById(R.id.next);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FrontPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        repoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage(link);
            }
        });

    }

    void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
       // if (intent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent);
        }
    }


}