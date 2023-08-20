package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String SB4 = "SB4";

        Log.e("MainActivity : ", SB4);

        int a = 10;

        Log.e("MainActivity", String.valueOf(a));
    }
}