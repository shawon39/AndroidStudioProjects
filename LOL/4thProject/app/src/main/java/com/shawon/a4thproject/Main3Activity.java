package com.shawon.a4thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Main3Activity extends AppCompatActivity {

    String[] coutry_names;
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.country);
        coutry_names = getResources().getStringArray(R.array.coutry_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, coutry_names);
        autoCompleteTextView.setAdapter(adapter);
    }
}
