package com.shawon.a6thproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Contact_homeActivity extends AppCompatActivity {

    Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_home);

        button = (Button)findViewById(R.id.addContact);
        button2 = (Button)findViewById(R.id.viewContact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contact_homeActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Contact_homeActivity.this, DataListActivity.class);
                startActivity(intent);
            }
        });
    }
}
