package com.shawon.userinterface;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    public final static String MESSAGE_KEY = "com.shawon.userinterface.message_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(message);
        setContentView(textView);
    }
}
