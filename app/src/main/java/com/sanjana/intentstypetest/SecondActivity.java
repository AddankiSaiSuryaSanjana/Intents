package com.sanjana.intentstypetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        label = findViewById(R.id.tv_result);
        Intent i = getIntent();
        String d = i.getStringExtra(MainActivity.KEY);
        label.setText(d);
    }
}