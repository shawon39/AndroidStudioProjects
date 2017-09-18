package com.shawon.myfirstapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.mybutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Second Activity !!", Toast.LENGTH_SHORT).show();

                AlertDialog.Builder mybuilder = new AlertDialog.Builder(MainActivity.this);
                mybuilder.setTitle("Attention");
                mybuilder.setMessage("Do You know that you are going to a 18+ site! Please leave if you are under than 18!");
                mybuilder.setIcon(R.drawable.alearticon);

                mybuilder.setPositiveButton("Yes, Go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "Going to 18+ site!", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(i);
                    }
                });

                mybuilder.setNegativeButton("No! I won't go", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "I aren't going there. It's Disgusting", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog alertDialog = mybuilder.create();
                mybuilder.show();


            }
        });


    }
}