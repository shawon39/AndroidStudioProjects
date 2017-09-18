package com.shawon.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button button, button2;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        listView = (ListView)findViewById(R.id.lvid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked On 1St Button", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(this);

        final String[] pcs = {"Shawon", "Rabbi", "Jebin", "Jenifa", "Piushi"};

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.lvlayout, R.id.txtid, pcs);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Clicked On"+pcs[position], Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Clicked On 2nd Button", Toast.LENGTH_SHORT).show();
    }

    public void myButton(View v){
        Toast.makeText(getApplicationContext(), "Clicked On 3rd Button", Toast.LENGTH_SHORT).show();
    }
}
