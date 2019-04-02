package com.e.arithemetic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText first, second;
        Button btnAdd;

        first= findViewById(R.id.first);
        second = findViewById(R.id.second);
        btnAdd = findViewById(R.id.btnadd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, sum;

                a= Integer.parseInt(first.getText().toString());
                b= Integer.parseInt(second.getText().toString());

                sum =a+b;

                Toast toast = Toast.makeText(MainActivity.this , "The sum is = "+sum , Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0,0);
                toast.show();

            }
        });


    }
}
