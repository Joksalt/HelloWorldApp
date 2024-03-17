package com.example.helloworldapp;

import static com.example.helloworldapp.Utils.StringExtensions.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private EditText etUserInput;
    private Button btnCalculate;
    private Spinner spnCalculationTypeSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitViews();

        btnCalculate.setOnClickListener(v -> btnClickCalculate());
    }

    private void InitViews(){
        this.tvResult = findViewById(R.id.tvOutput);
        this.etUserInput = findViewById(R.id.etUserInput);

        this.btnCalculate = findViewById(R.id.btnCalculate);

        this.spnCalculationTypeSelection = findViewById(R.id.spnCalculationType);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.calculation_types,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnCalculationTypeSelection.setAdapter(adapter);
    }

    private void btnClickCalculate(){
        String userInputText =  etUserInput.getText().toString();

        if(userInputText.isEmpty()){
            Toast.makeText(MainActivity.this,"Input must not be empty!", Toast.LENGTH_SHORT).show();
        }
        else {
            String calculationType = spnCalculationTypeSelection.getSelectedItem().toString();

            switch (calculationType){
                case "Words":
                    tvResult.setText(String.format("Word count: %d", CalculateWordCount(userInputText)));
                    break;
                case "Characters":
                    tvResult.setText(String.format("Character count: %d", CalculateCharCount(userInputText)));
                    break;
            }
        }
    }
}