package com.shawon.a6thproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, button5, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.timePicker);
        button2 = (Button) findViewById(R.id.datePicker);
        button3 = (Button) findViewById(R.id.floating_context);
        button4 = (Button) findViewById(R.id.contextual_action);
        button5 = (Button) findViewById(R.id.listViewContextualAction);
        button6 = (Button) findViewById(R.id.popup_Menu);
        button7 = (Button) findViewById(R.id.radioButton);
        button8 = (Button) findViewById(R.id.shared_preferences);
        button9 = (Button) findViewById(R.id.contact_home);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimePickerActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DatePickerActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, floating_contect_menu.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContextualActionActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewContextualActionActivity.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PopupMenuActivity.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuRadioButtonActivity.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SharedPreferencesActivity.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Contact_homeActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ScrollView scrollView;
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        switch (item.getItemId()){

            case R.id.red_color:
                scrollView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                break;
            case R.id.green_color:
                scrollView.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                break;
            case R.id.black:
                scrollView.setBackgroundColor(getResources().getColor(android.R.color.black));
                break;
            case R.id.white:
                scrollView.setBackgroundColor(getResources().getColor(android.R.color.white));
                break;
        }

        return true;
    }
}
