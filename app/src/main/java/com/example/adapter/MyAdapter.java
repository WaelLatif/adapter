package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> data;
    int resource;

    public MyAdapter(Context c, int resource, ArrayList<String> data) {
        this.context = c;
        this.data = data;
        this.resource = resource;

    }

    @Override
    public int getCount() {
        return data.size();
    }

    public void addItem(String item) {
        data.add(item);
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(resource,
                    null, false);
        }
        TextView tv = v.findViewById(android.R.id.text1);
        String name = data.get(position);
        tv.setText(name);
        return v;
    }
}
