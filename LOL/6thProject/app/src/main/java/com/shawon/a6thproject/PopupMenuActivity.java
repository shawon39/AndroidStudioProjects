package com.shawon.a6thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);
    }

    public void showPopUp(View view)
    {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.popup_actions,popupMenu.getMenu());
        PopupMenuEventHandle popupMenuEventHandle = new PopupMenuEventHandle(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popupMenuEventHandle);
        popupMenu.show();
    }
}
