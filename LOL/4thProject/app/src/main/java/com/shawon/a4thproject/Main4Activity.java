package com.shawon.a4thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final_text = (TextView)findViewById(R.id.finalResult);
        final_text.setEnabled(false);

    }

    public void selectItem(View view) {

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.fruit_apple:
                if (checked) {
                    selection.add("Apple");
                } else {
                    selection.remove("Apple");
                }
                break;

            case R.id.fruit_orange:
                if (checked) {
                    selection.add("Orange");
                } else {
                    selection.remove("Orange");
                }
                break;

            case R.id.fruit_mango:
                if (checked) {
                    selection.add("Mango");
                } else {
                    selection.remove("Mango");
                }
                break;

            case R.id.fruit_grapes:
                if (checked) {
                    selection.add("Grapes");
                } else {
                    selection.remove("Grapes");
                }
                break;
        }

    }

    public void finalSelection(View view) {

        String final_fruit_selection = "";
        int count =0;
        for(String Selection : selection){
            final_fruit_selection = final_fruit_selection + Selection + "\n";
            count++;
        }

        final_text.setText("You Hava Selected "+count+" Items! Here Is The list.....\n"+final_fruit_selection);
        final_text.setEnabled(true);

    }

}
