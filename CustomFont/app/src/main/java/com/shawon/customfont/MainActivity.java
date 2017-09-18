package com.shawon.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.mytext1);
        textView2 = (TextView) findViewById(R.id.mytext2);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(), "font/BenSenHandwriting.ttf");
        textView1.setText("আমি শাওন! আমি অ্যান্ড্রয়েড অ্যাপ ডেভেলপমেন্ট করছি!");
        textView1.setTypeface(typeface1);

        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "font/FFF_Tusj.ttf");
        textView2.setText("I am shawon ! I am doing android app development!");
        textView2.setTypeface(typeface2);

    }
}
