package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_main2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_main2 = findViewById(R.id.tv_main2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str"); // string 형태의 데이터를 받는다

        tv_main2.setText(str);
    }
}