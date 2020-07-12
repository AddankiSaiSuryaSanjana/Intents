package com.sanjana.intentstypetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et, et2, et3, et4;
    Button btn, btn2, btn3;
    public static final String KEY = "apssdc.in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et_user_input);
        et2 = findViewById(R.id.et_web_input);
        et3 = findViewById(R.id.et_tel_input);
        et4 = findViewById(R.id.et_geo_input);
        btn = findViewById(R.id.webButton);
        btn2 = findViewById(R.id.telButton);
        btn3 = findViewById(R.id.geoButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et2.getText().toString();
                Uri uri = Uri.parse("https://www." + input + ".com");
                Intent myIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(myIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input2 = et3.getText().toString();
                Uri uri2 = Uri.parse("tel:" + input2);
                Intent myIntent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(myIntent2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input3 = et4.getText().toString();
                Uri uri3 = Uri.parse("geo:" + input3);
                Intent myIntent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(myIntent3);
            }
        });
    }

    public void show_secondActivity(View view) {
        String data = et.getText().toString();
        Intent intent_object = new Intent(this, SecondActivity.class);
        intent_object.putExtra(KEY,data);
        startActivity(intent_object);
        
    }
}