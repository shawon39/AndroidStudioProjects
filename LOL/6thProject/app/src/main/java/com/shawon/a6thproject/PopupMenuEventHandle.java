package com.shawon.a6thproject;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.widget.Toast;

public class PopupMenuEventHandle implements PopupMenu.OnMenuItemClickListener {

    Context context;

    public PopupMenuEventHandle(Context context){
        this.context=context;
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        if(item.getItemId()==R.id.id_admin){
            Toast.makeText(context, "Login As Admin",Toast.LENGTH_SHORT).show();
            return true;
        }else if(item.getItemId()==R.id.id_user){
            Toast.makeText(context, "Login As User",Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
