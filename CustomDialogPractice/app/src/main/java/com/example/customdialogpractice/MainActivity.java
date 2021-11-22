package com.example.customdialogpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn;
    String [] Colors={"Red","Green","Blue"};
    ArrayList<Integer> selectedItems=new ArrayList();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.textMsg);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showDialog(view);
                //showDialogClr(view);
                showDialogClrChoice(view);
            }
        });


    }
    public void showDialogClrChoice(View view)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Set Color").setMultiChoiceItems(Colors, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b)
                {
                    selectedItems.add(i);
                }
                else if(selectedItems.contains(i))
                {
                    selectedItems.remove(Integer.valueOf(i));

                }
            }
        }).setCancelable(false);
        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String msg="";
                for(int x=0;x<selectedItems.size();x++)
                {
                    msg=msg+"\n"+(x+1)+" : "+Colors[selectedItems.get(x)];
                    Toast.makeText(MainActivity.this,"Total "+selectedItems.size()+" Items Selected.\n"+msg,Toast.LENGTH_SHORT).show();

                }
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"No Option Selected",Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }
    public void showDialogClr(View view)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Set Color").setItems(Colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast toast= Toast.makeText(MainActivity.this,Colors[i],Toast.LENGTH_SHORT);
                toast.show();
            }
        }).setCancelable(false);
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }
    public void showDialog(View view)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("This is message");
        builder.setTitle("Title");
        builder.setCancelable(false);
        builder.setPositiveButton("Positive Btn", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                text.setText("Positive btn");
                Toast toast= Toast.makeText(MainActivity.this,"Positive Btn",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });
        builder.setNegativeButton("Negative Btn", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                text.setText("Negative btn");
                Toast toast= Toast.makeText(MainActivity.this,"Negative Btn",Toast.LENGTH_SHORT);
                toast.show();
               // dialogInterface.cancel();
                dialogInterface.dismiss();

            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}