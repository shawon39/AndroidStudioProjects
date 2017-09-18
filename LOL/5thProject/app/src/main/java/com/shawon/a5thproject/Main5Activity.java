package com.shawon.a5thproject;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    private static final String TAG = "Main5Activity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mDisplayDate = (TextView) findViewById(R.id.timePicker);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(Main5Activity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth, mDateListener,
                        year, month, day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        mDateListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month +1;
                Log.d(TAG, "onDateSet: mm/dd/yyyy" + month + "/" + dayOfMonth + "/" + year);

                String date = month + "/" + dayOfMonth + "/" + year;
                mDisplayDate.setText(date);

            }
        };

    }
}
