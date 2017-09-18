package com.shawon.a6thproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddContactActivity extends AppCompatActivity {

    EditText ContactName, ContactMobile, ContactEmail;
    Context context = this;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        ContactName = (EditText)findViewById(R.id.contactName);
        ContactMobile = (EditText)findViewById(R.id.contactMobile);
        ContactEmail = (EditText)findViewById(R.id.contactEmail);
    }

    public void addContact(View view){
        String name = ContactName.getText().toString();
        String mobile = ContactMobile.getText().toString();
        String email = ContactEmail.getText().toString();
        userDbHelper = new UserDbHelper(context);
        sqLiteDatabase = userDbHelper.getWritableDatabase();
        userDbHelper.addInformations(name,mobile,email,sqLiteDatabase);
        Toast.makeText(getApplicationContext(), "Data Saved",Toast.LENGTH_SHORT).show();
        userDbHelper.close();
    }
}
