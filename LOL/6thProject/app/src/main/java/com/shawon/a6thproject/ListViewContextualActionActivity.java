package com.shawon.a6thproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ListViewContextualActionActivity extends AppCompatActivity {

    ListView listView;
    String[] human_name;
    ArrayAdapter<String> adapter;
    List data_provider = new ArrayList();
    List selection = new ArrayList();
    int count = 0;
    int length = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_contextual_action);

        listView = (ListView) findViewById(R.id.list_view);
        textView = (TextView) findViewById(R.id.textView5);
        human_name = getResources().getStringArray(R.array.human_names);
        length = human_name.length;

        for(String item : human_name)
        {
            data_provider.add(item);
        }

        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.row_layout,R.id.rowItem,data_provider);
        listView.setAdapter(adapter);

        listView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

                if(checked)
                {
                    selection.add(data_provider.get(position));
                    count++;
                    listView.getChildAt(position).setBackgroundColor(Color.RED);
                    mode.setTitle(count+" Selected");
                }
                else{
                    selection.remove(data_provider.get(position));
                    count--;
                    listView.getChildAt(position).setBackgroundColor(Color.WHITE);
                    mode.setTitle(count+" Selected");
                }

            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater menuInflater = getMenuInflater();
                menuInflater.inflate(R.menu.my_menu,menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

                if(item.getItemId()==R.id.delete){
                    for(Object Item : selection){
                        String ITEM = Item.toString();
                        data_provider.remove(ITEM);
                    }

                    for(int j=0; j<length; j++){
                        listView.getChildAt(j).setBackgroundColor(Color.WHITE);
                    }
                    length = length - count;

                    adapter.notifyDataSetChanged();
                    mode.finish();
                    return true;
                }
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                count = 0;
                selection.clear();
            }
        });
    }
}
