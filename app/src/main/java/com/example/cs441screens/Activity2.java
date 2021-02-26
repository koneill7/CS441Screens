package com.example.cs441screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.graphics.Color;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button temp = findViewById(R.id.temp);
        ButtonColor buttonColor = ButtonColor.getInstance();
        if(buttonColor.ColorID == 1){
            temp.setBackgroundColor(Color.BLUE);

        }
        else if (buttonColor.ColorID == 2){
            temp.setBackgroundColor(Color.GREEN);
        }
    }
}