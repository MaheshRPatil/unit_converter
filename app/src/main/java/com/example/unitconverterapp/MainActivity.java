package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView appname,result;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        appname=findViewById(R.id.appname);
        result=findViewById(R.id.result);
        editText=findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilo_entered=Double.parseDouble(editText.getText().toString());
                ConvertToPounds(kilo_entered);
            }
        });
    }
    public double ConvertToPounds(double kilo){
        double pounds_result=kilo*2.20462;
        return pounds_result;
    }
}