package com.xyz.ostcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEqual;
    Integer value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst= (EditText) findViewById(R.id.etFirst);
        etSecond= (EditText) findViewById(R.id.etSecond);
        btnAdd= (Button) findViewById(R.id.btnAdd);
        btnSub= (Button) findViewById(R.id.btnSub);
        btnMul= (Button) findViewById(R.id.btnMul);
        btnDiv= (Button) findViewById(R.id.btnDiv);
        btnEqual= (Button) findViewById(R.id.btnEqual);
        btnEqual.setEnabled(false);
        final int fno, sno;
//        if(etFirst.getText().length()!=0&&etSecond.getText().length()!=0) {
//            fno = Integer.parseInt(etFirst.getText().toString());
//            sno = Integer.parseInt(etSecond.getText().toString());
//        }
//        else{
//            etFirst.requestFocus();
//            Toast.makeText(getApplicationContext(), "Enter a no", Toast.LENGTH_SHORT).show();
//        }
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etFirst.getText().length()!=0&&etSecond.getText().length()!=0) {
                    fno = Integer.parseInt(etFirst.getText().toString());
                    sno = Integer.parseInt(etSecond.getText().toString());
                    value=fno+sno;
                    Intent i=new Intent(MainActivity.this,output.class);
                    i.putExtra("value", value);
                    startActivity(i);

                    btnEqual.setEnabled(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please Enter numbers", Toast.LENGTH_SHORT).show();
                    etFirst.requestFocus();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(fno!=0&&sno!=0){
                    value=fno-sno;
                    Intent i=new Intent(MainActivity.this,output.class);
                    i.putExtra("value", value);
                    startActivity(i);

                    btnEqual.setEnabled(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please Enter numbers", Toast.LENGTH_SHORT).show();
                    etFirst.requestFocus();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(fno!=0&&sno!=0){
                    value=fno*sno;
                    Intent i=new Intent(MainActivity.this,output.class);
                    i.putExtra("value", value);
                    startActivity(i);

                    btnEqual.setEnabled(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please Enter numbers", Toast.LENGTH_SHORT).show();
                    etFirst.requestFocus();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(fno!=0&&sno!=0){
                    value=fno/sno;
                    Intent i=new Intent(MainActivity.this,output.class);
                    i.putExtra("value", value);
                    startActivity(i);

                    btnEqual.setEnabled(true);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please Enter numbers", Toast.LENGTH_SHORT).show();
                    etFirst.requestFocus();
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,output.class);
                i.putExtra("value", value);
                startActivity(i);

            }
        });

    }
}
