package com.example.cs441screens;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button act_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        act_button = findViewById(R.id.act_button);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

        Button temp = findViewById(R.id.act_button);
        ButtonColor buttonColor = ButtonColor.getInstance();
        if(buttonColor.ColorID == 1){
            temp.setBackgroundColor(Color.BLUE);

        }
        else if (buttonColor.ColorID == 2){
            temp.setBackgroundColor(Color.parseColor("#488214"));
        }
        else if (buttonColor.ColorID == 3){
            temp.setBackgroundColor(Color.parseColor("#CD3333"));
        }
        else if (buttonColor.ColorID == 4){
            temp.setBackgroundColor(Color.parseColor("#E18E2E"));
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void switch_activities(View view){
        Intent act_action = new Intent(this, Activity2.class);
        startActivity(act_action);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void set_blue(View view) {
        ButtonColor buttonColor = ButtonColor.getInstance();
        buttonColor.ColorID = 1;
    }
    public void set_green(View view) {
        ButtonColor buttonColor2 = ButtonColor.getInstance();
        buttonColor2.ColorID = 2;
    }
    public void set_red(View view) {
        ButtonColor buttonColor3 = ButtonColor.getInstance();
        buttonColor3.ColorID = 3;
    }

}