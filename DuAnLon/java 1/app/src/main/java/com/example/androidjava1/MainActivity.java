package com.example.androidjava1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button txtnick;
    TextView txtname;
    int position = 1;// int thì chỉ có thể là số nguyên, không có trường hợp null
    Integer index = 1;//


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        txtnick = findViewById(R.id.Button1);
        txtname = findViewById(R.id.txtname);

        txtnick.setOnClickListener(View -> {
          Intent intent = new Intent(MainActivity.this,MainActivity2.class);
          startActivity(intent);

        });


    }


}