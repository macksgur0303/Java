package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn_move;
    private EditText et_text;
    private String str;
    private ImageView iv_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // 메인 엑티비티가 시작될때
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_text = findViewById(R.id.et_text);


        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_text.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("str", str);
                startActivity(intent); // activity 이동
            }
        });

        iv_toast = findViewById(R.id.iv_toast);
        iv_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "EZPZLS", Toast.LENGTH_SHORT).show();
            }
        });
    }
}