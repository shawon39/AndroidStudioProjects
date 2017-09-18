package com.shawon.a6thproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ContextualActionActivity extends AppCompatActivity {

    ImageView imageView;
    ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_action);

        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(actionMode != null){
                    return false;
                }else{
                    actionMode = ContextualActionActivity.this.startActionMode(callback);
                }
                return true;
            }
        });

    }

    private ActionMode.Callback callback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.my_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            mode.setTitle("1 Item Selected!");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            if(item.getItemId()==R.id.delete){
                Toast.makeText(getApplicationContext(),"You really want to Delete ?", Toast.LENGTH_SHORT).show();
                return true;
            }else if(item.getItemId()==R.id.share){
                Toast.makeText(getApplicationContext(),"You really want to Share ?", Toast.LENGTH_SHORT).show();
                return  true;
            }

            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            actionMode = null;
        }
    };
}
