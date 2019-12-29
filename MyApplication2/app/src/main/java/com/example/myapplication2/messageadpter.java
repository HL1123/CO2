package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class messageadpter extends ArrayAdapter<message> {
    private int resourceId;
    public messageadpter(Context context, int textviewresourced, List<message>objects)
    {
        super(context,textviewresourced,objects);
        resourceId=textviewresourced;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        message message=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        TextView textView1=(TextView) view.findViewById(R.id.text1);
        TextView textView2=(TextView) view.findViewById(R.id.text2);
        textView1.setText(message.getName());
        textView2.setText(message.getDetails());
        return view;
    }
}
