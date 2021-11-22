dirpackage com.example.customlayoutpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.toastBtn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        LayoutInflater inflater=getLayoutInflater();
        View toastLayout=inflater.inflate(R.layout.toast_layout,findViewById(R.id.toastLayout));

        Toast toast=new Toast(MainActivity.this);
        toast.setView(toastLayout);
        toast.setDuration(Toast.LENGTH_SHORT);


        //Toast toast= Toast.makeText(MainActivity.this,"This is toast",Toast.LENGTH_SHORT);
        toast.show();

    }
}