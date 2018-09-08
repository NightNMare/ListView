package com.example.dlarb.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<Data> items = new ArrayList<>();
    Context mContext;

    public CustomAdapter(ArrayList<Data> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);

        ImageView numname = v.findViewById(R.id.name);
        TextView bgTitle = v.findViewById(R.id.big_title);
        TextView smTitle = v.findViewById(R.id.small_title);

        Data data = items.get(position);

        numname.setImageResource(data.getNumname());
        bgTitle.setText (data.getBigtitle());
        smTitle.setText(data.getSmalltitle());
        return v;
    }
}