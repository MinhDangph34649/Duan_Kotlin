package com.example.androidjava1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);


        TextView txthienthia = findViewById(R.id.manhinh3clicktext);

        txthienthia.setOnClickListener(View->{
            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intent);
        });

    }
}