package com.shawon.a6thproject;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class TimePickerActivity extends AppCompatActivity {

    Button button_stpd;
    TextView textView;
    static final int DIALOG_ID = 0;
    int hour_x;
    int minute_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        showTimePickerDialog();
    }

    public void showTimePickerDialog(){
        button_stpd = (Button) findViewById(R.id.buttonT);
        button_stpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }

    protected Dialog onCreateDialog(int id){

        if ((id==DIALOG_ID)){
            return new TimePickerDialog(TimePickerActivity.this, kTimePickerListener, hour_x, minute_x, false);
        }
        else return null;

    }

    protected TimePickerDialog.OnTimeSetListener kTimePickerListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            hour_x = hourOfDay;
            minute_x = minute;
            textView = (TextView)findViewById(R.id.textView);
            //Toast.makeText(TimePickerActivity.this, hour_x + " : "+minute_x, Toast.LENGTH_SHORT).show();
            if(hour_x>12){
                hour_x = hour_x -12;
                textView.setText("Time: "+hour_x + " : "+minute_x+ " pm");
            }
            else textView.setText("Time: "+hour_x + " : "+minute_x+ " am");
        }
    };

}







