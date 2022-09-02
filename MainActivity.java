package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText op1;
    private EditText op2;
    private Button sumBtn;
    private Button subBtn;
    private Button multiBtn;
    private Button divideBtn;
    private float x;
    private float y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        sumBtn = findViewById(R.id.sumBtn);
        subBtn = findViewById(R.id.subBtn);
        multiBtn = findViewById(R.id.multiBtn);
        divideBtn = findViewById(R.id.divideBtn);

        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    x = Float.parseFloat(op1.getText().toString());
                    y = Float.parseFloat(op2.getText().toString());
                    Intent i = new Intent( MainActivity.this, ResultActivity.class);
                    i.putExtra("Result",x + y);
                    startActivity(i);
                }catch (Exception e){
                   Toast.makeText(getApplicationContext(), getResources().getString((R.string.InputError)),
                           Toast.LENGTH_LONG).show();
                   return;
                }

            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    x = Float.parseFloat(op1.getText().toString());
                    y = Float.parseFloat(op2.getText().toString());
                    Intent i = new Intent( MainActivity.this, ResultActivity.class);
                    i.putExtra("Result",x - y);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), getResources().getString((R.string.InputError)),
                            Toast.LENGTH_LONG).show();
                    return;
                }

            }
        });
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    x = Float.parseFloat(op1.getText().toString());
                    y = Float.parseFloat(op2.getText().toString());
                    Intent i = new Intent( MainActivity.this, ResultActivity.class);
                    i.putExtra("Result",x * y);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), getResources().getString((R.string.InputError)),
                            Toast.LENGTH_LONG).show();
                    return;
                }

            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    x = Float.parseFloat(op1.getText().toString());
                    y = Float.parseFloat(op2.getText().toString());
                    Intent i = new Intent( MainActivity.this, ResultActivity.class);
                    i.putExtra("Result",x / y);
                    startActivity(i);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), getResources().getString((R.string.InputError)),
                            Toast.LENGTH_LONG).show();
                    return;
                }

            }
        });
    }
}