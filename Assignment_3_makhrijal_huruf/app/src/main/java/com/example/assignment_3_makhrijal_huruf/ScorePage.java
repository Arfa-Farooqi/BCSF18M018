package com.example.assignment_3_makhrijal_huruf;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {

    TextView score;
    Button shareBtn;
    String displayScore;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        score=findViewById(R.id.score);
        shareBtn=findViewById(R.id.shareBtn);


        Intent intent=getIntent();
        displayScore=intent.getStringExtra("myScore")+" / 20 ";
        score.setText(displayScore);
        message="My score in Makhārij al-ḥurūf Exam is "+displayScore;
        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.setType("text/plain");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });



    }
}