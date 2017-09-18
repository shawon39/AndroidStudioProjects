package com.shawon.a6thproject;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {

    EditText editText;
    SeekBar seekBar;
    float font_size;
    String font_color;
    String text_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        editText = (EditText) findViewById(R.id.message);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        SharedPreferences sharedPreferences = SharedPreferencesActivity.this.getSharedPreferences(getString(R.string.pref_file),
                MODE_PRIVATE);
        text_info = sharedPreferences.getString(getString(R.string.TEXT_info),"");
        editText.setText(text_info);
        font_size = sharedPreferences.getFloat(getString(R.string.FONT_size),25);
        font_color = sharedPreferences.getString(getString(R.string.FONT_color),"");
        editText.setTextSize(TypedValue.COMPLEX_UNIT_PX,font_size);

        if(font_size == 25){
            seekBar.setProgress(0);
        }
        else{
            seekBar.setProgress((int)font_size);
        }

        if(font_color.equals("RED")){
            editText.setTextColor(Color.parseColor("#ff0000"));
        }
        else if(font_color.equals("BLUE")){
            editText.setTextColor(Color.parseColor("#0000ff"));
        }
        else if(font_color.equals("GREEN")){
            editText.setTextColor(Color.parseColor("#008000"));
        }

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                editText.setTextSize(TypedValue.COMPLEX_UNIT_PX,progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                font_size = editText.getTextSize();
            }
        });

    }

    public void changeColor(View view){

        switch (view.getId()){
            case R.id.red_color:
                editText.setTextColor(Color.parseColor("#ff0000"));
                font_color="RED";
                break;

            case R.id.blue_color:
                editText.setTextColor(Color.parseColor("#0000ff"));
                font_color="BLUE";
                break;

            case R.id.green_color:
                editText.setTextColor(Color.parseColor("#008000"));
                font_color="GREEN";
                break;
        }
    }

    public void saveSettings(View view){
        SharedPreferences sharedPreferences = SharedPreferencesActivity.this.getSharedPreferences(getString(R.string.pref_file),
                MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(getString(R.string.FONT_size),font_size);
        editor.putString(getString(R.string.FONT_color),font_color);
        editor.putString(getString(R.string.TEXT_info),editText.getText().toString());
        editor.commit();
        Toast.makeText(getApplicationContext(),"Saved!",Toast.LENGTH_LONG).show();
    }
    public void clearSettings(View view){
        SharedPreferences sharedPreferences = SharedPreferencesActivity.this.getSharedPreferences(getString(R.string.pref_file),
                MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
        Toast.makeText(getApplicationContext(),"Cleared!",Toast.LENGTH_LONG).show();
    }
}
