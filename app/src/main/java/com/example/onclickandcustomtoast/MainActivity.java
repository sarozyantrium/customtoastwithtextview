package com.example.onclickandcustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.et_phone);




    }

    public void clickme(View view)
    {
        LayoutInflater lf =getLayoutInflater();
        View layouts =lf.inflate(R.layout.custom_toast_design,(ViewGroup) findViewById(R.id.custom_layout));
        Toast t=new Toast(getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(layouts);
        t.show();
        t.setGravity(Gravity.CENTER,0,0);

        String s=et.getText().toString();
        textview=(TextView)layouts.findViewById(R.id.txtview);
        textview.setText(s);





    }
}