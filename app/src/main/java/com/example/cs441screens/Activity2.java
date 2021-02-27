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
        EditText edit = findViewById(R.id.user_input);
        View view = this.getWindow().getDecorView();
        final EditText[] userText = new EditText[1];

        final TextView[] caffeineText = new TextView[1];

        ButtonColor buttonColor = ButtonColor.getInstance();
        if(buttonColor.ColorID == 1){
            submit.setBackgroundColor(Color.BLUE);
            edit.setBackgroundColor(Color.parseColor("#D3F0F2"));
            view.setBackgroundColor(Color.parseColor("#E6F2FF"));

        }
        else if (buttonColor.ColorID == 2){
            submit.setBackgroundColor(Color.parseColor("#488214"));
            edit.setBackgroundColor(Color.parseColor("#CFDBC5"));
            view.setBackgroundColor(Color.parseColor("#E6FFE6"));
        }
        else if (buttonColor.ColorID == 3){
            submit.setBackgroundColor(Color.parseColor("#CD3333"));
            edit.setBackgroundColor(Color.parseColor("#EEB4B4"));
            view.setBackgroundColor(Color.parseColor("#FFCCCC"));
        }
        submit.setOnClickListener(new View.OnClickListener(){
            int store = 0;
            int last = 0;
            @Override
            public void onClick(View view){
                userText[0] = (EditText)findViewById(R.id.user_input);
                store = Integer.parseInt(userText[0].getText().toString());
                last += store;
                caffeineText[0] = (TextView)findViewById(R.id.caffeine_text);
                caffeineText[0].setText("Current total amount of caffeine: " + last);
            }
        });
    }
}