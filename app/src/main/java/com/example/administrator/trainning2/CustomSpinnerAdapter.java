package com.example.administrator.trainning2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 12/10/2016.
 */
public class CustomSpinnerAdapter extends BaseAdapter {
    Context context;
    int img[];
    String name[];
    LayoutInflater inflater;

    CustomSpinnerAdapter(Context context, int img[]){
        this.img = img;
        this.name =  name;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.custome_spinner,null);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);

        icon.setImageResource(img[i]);

        return view;
    }
}
