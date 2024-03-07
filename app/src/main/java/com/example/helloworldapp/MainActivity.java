package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvText = findViewById(R.id.tvText);
    }

    public void btnChangeTextClick(View view) {
        this.tvText.setText("Hello and welcome!");
    }

    public void btnChangeColor(View view) {
        this.tvText.setTextColor(Color.RED);
    }

    public void btnCrashOnclikc(View view) {
        try {
            throw new Exception("App just crashed...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}