package com.shawon.a6thproject;

import android.app.DatePickerDialog;
import android.app.Dialog;
import java.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {

    Button btn;
    TextView textView;
    int year_x, month_x, date_x;
    static final int DILOG_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        date_x = cal.get(Calendar.DAY_OF_MONTH);

        showDialogOnButtonClick();
    }

    public void showDialogOnButtonClick(){
        btn = (Button) findViewById(R.id.buttonT2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DILOG_ID);
            }
        });
    }

    protected Dialog onCreateDialog(int id){

        if(id ==  DILOG_ID){
            return new DatePickerDialog(DatePickerActivity.this, dpickerListner, year_x,month_x,date_x);
        }
        else return null;
    }

    private DatePickerDialog.OnDateSetListener dpickerListner = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            year_x = year;
            month_x = month;
            date_x = dayOfMonth + 1;
            textView = (TextView)findViewById(R.id.textView2);
            textView.setText("Date: "+date_x+" / "+month_x+" / "+year_x);
        }
    };

}


















