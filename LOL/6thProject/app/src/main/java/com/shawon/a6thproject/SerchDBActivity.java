package com.shawon.a6thproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SerchDBActivity extends AppCompatActivity {

    TextView DisplayEmail, DisplayMobile;
    EditText searchName;
    UserDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    String search_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serch_db);

        searchName = (EditText) findViewById(R.id.editText);
        DisplayEmail = (TextView)findViewById(R.id.displayEmail);
        DisplayMobile = (TextView)findViewById(R.id.displayMobile);
        DisplayEmail.setVisibility(View.GONE);
        DisplayMobile.setVisibility(View.GONE);

    }

    public void searchContact (View view)
    {
        search_name = searchName.getText().toString();
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        Cursor cursor = userDbHelper.getContact(search_name,sqLiteDatabase);

        if(cursor.moveToFirst())
        {
            String MOBILE = cursor.getString(0);
            String EMAIL = cursor.getString(1);
            DisplayEmail.setText(EMAIL);
            DisplayMobile.setText(MOBILE);
            DisplayEmail.setVisibility(View.VISIBLE);
            DisplayMobile.setVisibility(View.VISIBLE);

        }
        else{
            DisplayEmail.setText("Sorrrrrry :(");
            DisplayMobile.setText("Data Not Found !");
            DisplayEmail.setVisibility(View.VISIBLE);
            DisplayMobile.setVisibility(View.VISIBLE);
        }
    }

    public void deleteContact(View view)
    {
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        userDbHelper.deleteInformation(search_name,sqLiteDatabase);
        Toast.makeText(getApplicationContext(),"Contact Deleted!",Toast.LENGTH_SHORT).show();
    }

}
