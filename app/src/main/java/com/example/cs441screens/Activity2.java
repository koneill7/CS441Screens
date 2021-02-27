package com.example.cs441screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button submit = findViewById(R.id.submit_caffeine);
        final EditText[] userText = new EditText[1];

        final TextView[] caffeineText = new TextView[1];

        ButtonColor buttonColor = ButtonColor.getInstance();
        if(buttonColor.ColorID == 1){
            submit.setBackgroundColor(Color.BLUE);

        }
        else if (buttonColor.ColorID == 2){
            submit.setBackgroundColor(Color.GREEN);
        }
        submit.setOnClickListener(new View.OnClickListener(){
            int store = 0;
            int last;
            int accum;
            @Override
            public void onClick(View view){
                userText[0] = (EditText)findViewById(R.id.user_input);
                last = store;
                store = Integer.parseInt(userText[0].getText().toString());
                accum = last + store;
                caffeineText[0] = (TextView)findViewById(R.id.caffeine_text);
                caffeineText[0].setText("Your current amount of caffeine: " + accum);
            }
        });
    }
}