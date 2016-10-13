package com.example.administrator.trainning2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/10/2016.
 */
public class CustomListview extends BaseAdapter {
    Context context;
    ArrayList<User> arrUser;
    LayoutInflater inflater;
    CustomListview(Context context, ArrayList<User> users){
        this.arrUser = users;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return arrUser.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public void refresh(ArrayList<User> items)
    {
        this.arrUser = items;
        notifyDataSetChanged();
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.custome_listview,null);
        ImageView icon = (ImageView) view.findViewById(R.id.imgCountry);
        TextView names = (TextView) view.findViewById(R.id.txtName);
        TextView country = (TextView) view.findViewById(R.id.txtCountry);
        icon.setImageResource(arrUser.get(i).getImg());
        names.setText(arrUser.get(i).getName());
        country.setText(arrUser.get(i).country);
        return view;

    }
}
