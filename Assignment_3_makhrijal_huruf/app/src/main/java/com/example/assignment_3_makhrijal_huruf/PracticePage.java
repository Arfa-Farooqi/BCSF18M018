package com.example.assignment_3_makhrijal_huruf;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PracticePage extends AppCompatActivity implements View.OnClickListener{

    int[] str={R.string.aa,R.string.ha,R.string.kha,R.string.kaf,R.string.chy,R.string.noon,R.string.ty,R.string.zoy,R.string.meme};
    String [] types={"Halqiyah","Lahatiyah","Shajariyah_Haafiyah","Tarfiyah","Nit_eeyah","Lisaveyah","Ghunna"};
    TextView randomLetter;
    TextView ans;
    TextView showAns;
    int randLetter;
    Button nextBtn;
    Button halqiyah;
    Button lahatiyah;
    Button shajariyah_Haafiyah;
    Button tarfiyah;
    Button nit_eeyah;
    Button lisaveyah;
    Button ghunna;
    boolean isEntered=false;
    int score=0;
    int totalAttempts=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_page);
        score=0;
        totalAttempts=0;
        ans=findViewById(R.id.ans);
        showAns=findViewById(R.id.showAns);
        randomLetter=findViewById(R.id.letter);
        nextBtn=findViewById(R.id.next);
        halqiyah=findViewById(R.id.Halqiyah);
        lahatiyah=findViewById(R.id.Lahatiyah);
        shajariyah_Haafiyah=findViewById(R.id.Shajariyah);
        tarfiyah=findViewById(R.id.Tarfiyah);
        nit_eeyah=findViewById(R.id.Nit);
        lisaveyah=findViewById(R.id.Lisaveyah);
        ghunna=findViewById(R.id.Ghunna);

        randomLetter.setText(str[0]);
        nextBtn.setOnClickListener(this);
        halqiyah.setOnClickListener(this);
        lahatiyah.setOnClickListener(this);
        shajariyah_Haafiyah.setOnClickListener(this);
        tarfiyah.setOnClickListener(this);
        nit_eeyah.setOnClickListener(this);
        lisaveyah.setOnClickListener(this);
        ghunna.setOnClickListener(this);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //for up action
        ActionBar ab = getSupportActionBar();
        //if(ab!=null)
            ab.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        score=0;
        totalAttempts=0;
    }

    @Override
    public void onClick(View view) {
        showAns.setText(CorrectAns());
        switch (view.getId()){
            case R.id.next:
                if(totalAttempts==5)
                {
                    //Toast toast=Toast. makeText(getApplicationContext(),"Score : "+score,Toast. LENGTH_SHORT);
                    //toast.show();

                    Intent intent=new Intent(PracticePage.this,ScorePage.class);
                    intent.putExtra("myScore",String.valueOf(score));
                    startActivity(intent);
                }
                Random rand=new Random();
                randLetter=rand.nextInt(9);
                randomLetter.setText(str[randLetter]);
                ans.setText(R.string.correct_wrong);
                showAns.setText(R.string.ans);
                isEntered=false;
                totalAttempts++;

                break;
            case R.id.Halqiyah:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter<=2)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Lahatiyah:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==3)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Shajariyah:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==4)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Tarfiyah:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==5)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Nit:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==6)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Lisaveyah:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==7)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
            case R.id.Ghunna:
                if(!isEntered)
                {
                    isEntered=true;
                    if(randLetter==8)
                    {
                        ans.setText(R.string.correct);
                        score++;
                    }
                    else
                        ans.setText(R.string.wrong);
                }
                break;
        }



    }
    String CorrectAns()
    {
        if(randLetter<=2)
            return types[0];
        else if(randLetter==3)
            return types[1];
        else if(randLetter==4)
            return types[2];
        else if(randLetter==5)
            return types[3];
        else if(randLetter==6)
            return types[4];
        else if(randLetter==7)
            return types[5];
        else
            return types[6];
    }
}