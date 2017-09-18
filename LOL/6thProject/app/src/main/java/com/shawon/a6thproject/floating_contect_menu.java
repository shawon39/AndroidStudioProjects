package com.shawon.a6thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class floating_contect_menu extends AppCompatActivity {

    ListView listView;
    String[] human_name;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_contect_menu);

        listView = (ListView) findViewById(R.id.list_view);
        registerForContextMenu(listView);
        human_name = getResources().getStringArray(R.array.human_names);

        for(String item : human_name)
        {
            arrayList.add(item);
        }

        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row_layout,R.id.rowItem,arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId())
        {
            case R.id.delete:
                arrayList.remove(info.position);
                adapter.notifyDataSetChanged();
                Toast.makeText(floating_contect_menu.this, "Item is deleted!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.my_contextual_menu, menu);
    }
}
