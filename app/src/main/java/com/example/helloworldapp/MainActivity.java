package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

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

    public void buttonChangeTextClick(View view) {
        this.tvText.setText("Hello and welcome!");
    }
}