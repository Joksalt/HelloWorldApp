package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private Button btnChangeText;
    private Button btnChangeTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvText = findViewById(R.id.tvText);

        this.btnChangeText = findViewById(R.id.btnChangeText);
        this.btnChangeTextColor = findViewById(R.id.btnChangeTextColor);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvText.setText("Hello and welcome!");
            }
        });

        btnChangeTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvText.setTextColor(Color.RED);
            }
        });
    }
}