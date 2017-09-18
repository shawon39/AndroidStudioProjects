package com.shawon.a6thproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DataListActivity extends AppCompatActivity {

    ListView listView;
    SQLiteDatabase sqLiteDatabase;
    UserDbHelper userDbHelper;
    Cursor cursor;
    ListDataAdapter listDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_list);

        listView = (ListView)findViewById(R.id.list_view18);
        listDataAdapter = new ListDataAdapter(getApplicationContext(),R.layout.row_layout18);
        listView.setAdapter(listDataAdapter);
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        cursor = userDbHelper.getInformations(sqLiteDatabase);

        if(cursor.moveToFirst()){
            do{
                String name, mobile, email;
                name = cursor.getString(0);
                mobile = cursor.getString(1);
                email = cursor.getString(2);
                SqDataProvider sqdataProvider = new SqDataProvider(name,mobile,email);
                listDataAdapter.add(sqdataProvider);
            }while (cursor.moveToNext());
        }
    }
}
