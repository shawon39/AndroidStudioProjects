package com.shawon.a6thproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateContactActivity extends AppCompatActivity {

    TextView titleText;
    Button updateButton;
    EditText searchName, NewMobile, NewEmail, NewName;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    String search_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_contact);

        searchName = (EditText)findViewById(R.id.name_search);
        NewMobile = (EditText)findViewById(R.id.new_mobile);
        NewEmail = (EditText)findViewById(R.id.new_email);
        NewName = (EditText)findViewById(R.id.new_name);
        titleText = (TextView)findViewById(R.id.title_text);
        updateButton = (Button) findViewById(R.id.update_button);
        NewMobile.setVisibility(View.GONE);
        NewName.setVisibility(View.GONE);
        NewEmail.setVisibility(View.GONE);

    }

    public void searchContact2(View view)
    {
        search_name = searchName.getText().toString();
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        Cursor cursor = userDbHelper.getContact(search_name,sqLiteDatabase);

        if(cursor.moveToFirst())
        {
            String New_Mobile = cursor.getString(0);
            String New_Email = cursor.getString(1);
            String New_Name = search_name;
            NewName.setText(New_Name);
            NewEmail.setText(New_Email);
            NewMobile.setText(New_Mobile);
            NewName.setVisibility(View.VISIBLE);
            NewEmail.setVisibility(View.VISIBLE);
            NewMobile.setVisibility(View.VISIBLE);
            titleText.setVisibility(View.VISIBLE);
            updateButton.setVisibility(View.VISIBLE);
        }

    }

    public void updateContact(View view)
    {
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getWritableDatabase();
        String name,email,mobile;
        name = NewName.getText().toString();
        mobile = NewMobile.getText().toString();
        email = NewEmail.getText().toString();
        int count = userDbHelper.updateInformation(search_name,name,mobile,email,sqLiteDatabase);
        Toast.makeText(getApplicationContext(),count+" Contact Updated!",Toast.LENGTH_SHORT).show();
        finish();
    }

}
