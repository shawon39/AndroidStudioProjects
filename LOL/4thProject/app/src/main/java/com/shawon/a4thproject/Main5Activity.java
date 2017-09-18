package com.shawon.a4thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView final_result;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setEnabled(false);

    }

    public void selectFruit(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.fruid_apple:

                if (checked) {
                    final_result.setText("You Select Apple");
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;

            case R.id.fruid_orange:

                if (checked) {
                    final_result.setText("You Select Orange");
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;

            case R.id.fruid_mango:

                if (checked) {
                    final_result.setText("You Select Mango");
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;


        }

    }
}
