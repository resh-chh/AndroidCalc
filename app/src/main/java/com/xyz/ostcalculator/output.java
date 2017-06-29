package com.xyz.ostcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class output extends AppCompatActivity {

    TextView tvResult;
    Integer value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvResult= (TextView) findViewById(R.id.tvResult);

        Intent intent= getIntent();
        value=intent.getIntExtra("value", 0);
        tvResult.setText(value);
    }
}
