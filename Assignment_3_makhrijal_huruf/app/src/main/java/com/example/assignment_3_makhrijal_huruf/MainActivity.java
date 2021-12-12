package com.example.assignment_3_makhrijal_huruf;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button practiceBtn;
    Button examBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //practiceBtn=findViewById(R.id.practiceBtn);
        examBtn=findViewById(R.id.examBtn);

        //practiceBtn.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
                //Intent intent=new Intent(MainActivity.this,PracticePage.class);
                //startActivity(intent);
            //}
        //});
        examBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PracticePage.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_practice:
                //TextView textView = findViewById(R.id.textView);
                //textView.setText("Action task was clicked");

                Intent intent=new Intent(MainActivity.this,ExamPage.class);
                startActivity(intent);
                break;
            case R.id.action_settings:
                //Intent intent = new Intent(this, MainActivity.class);
                //startActivity(intent);
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_favorite:
                Toast.makeText(getApplicationContext(), "Fav", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}