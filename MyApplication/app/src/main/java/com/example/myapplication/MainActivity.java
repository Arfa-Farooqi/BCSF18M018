package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String value;
    EditText alphabet;
    Button btn;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alphabet=(EditText) findViewById(R.id.alphabet);
        result=(TextView)findViewById(R.id.result);

        btn=(Button) findViewById(R.id.convert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                value=alphabet.getText().toString();

               value=ConvertAlphabet(value);
                if(value.equals("empty"))
                {
                    Toast.makeText(MainActivity.this,"Invalid Entry",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result.setText(value);
                }
            }
        });
    }


    public String ConvertAlphabet(String s)
    {
        if(s.length()!=1)
        {
            return "empty";
        }
        char r= s.charAt(0);
        String result ;
        if(r>=65 && r<=90)
        {
            r= (char) (r+32);
        }
        else if(r>=97 && r<=122)
        {
            r= (char) (r-32);
        }
        else
        {
            return "empty";
        }
        result=Character.toString(r);
        return result;
    }
}