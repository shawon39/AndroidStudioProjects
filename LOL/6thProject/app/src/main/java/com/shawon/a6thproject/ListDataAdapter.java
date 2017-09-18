package com.shawon.a6thproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListDataAdapter extends ArrayAdapter {

    List list = new ArrayList();

    public ListDataAdapter( Context context, int resource) {
        super(context, resource);
    }

    static class LayoutHandler{
        TextView NAME,MOBILE,EMAIL;
    }

    @Override
    public void add( Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row = convertView;
        LayoutHandler layoutHandler;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout18,parent,false);
            layoutHandler = new LayoutHandler();
            layoutHandler.NAME = (TextView) row.findViewById(R.id.text_user_name);
            layoutHandler.MOBILE = (TextView)row.findViewById(R.id.text_user_mobile);
            layoutHandler.EMAIL = (TextView)row.findViewById(R.id.text_user_email);
            row.setTag(layoutHandler);
        }
        else{
            layoutHandler = (LayoutHandler) row.getTag();
        }
        SqDataProvider sqDataProvider = (SqDataProvider) this.getItem(position);
        layoutHandler.NAME.setText(sqDataProvider.getName());
        layoutHandler.MOBILE.setText(sqDataProvider.getMobile());
        layoutHandler.EMAIL.setText(sqDataProvider.getEmail());
        return row;
    }
}
