package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView2;
    private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.20462 * kg;
                textView2.setText("The Pound Value is" + pound);
                Toast.makeText(MainActivity.this, "The Vale is" + pound, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
