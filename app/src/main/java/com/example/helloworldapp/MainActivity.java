package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random random;

    private TextView tvText;
    private EditText etUserInput;
    private Button btnChangeText;
    private Button btnChangeTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();

        this.tvText = findViewById(R.id.tvText);
        this.etUserInput = findViewById(R.id.etUserInput);

        this.btnChangeText = findViewById(R.id.btnChangeText);
        this.btnChangeTextColor = findViewById(R.id.btnChangeTextColor);

        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userInputText =  etUserInput.getText().toString();
                Log.i("information", String.format("This is what getText() gets: %s", userInputText));

                if(userInputText.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter Your name!", Toast.LENGTH_SHORT).show();
                }
                else {
                    tvText.setText(String.format("Hello, %s!", userInputText));
                    etUserInput.setText("");
                }
            }
        });

        btnChangeTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomColor = Color.argb(255,
                        random.nextInt(256),
                        random.nextInt(256),
                        random.nextInt(256));

                tvText.setTextColor(randomColor);

                random.nextInt();
            }
        });
    }
}