package com.example.myapplication2;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class re_adpter extends RecyclerView.Adapter<re_adpter.ViewHolder> {
    private List<message> messageList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        View messageView;
        TextView textView1;
        TextView textView2;
        public ViewHolder(View view)
        {
            super(view);
            messageView=view;
            textView1=(TextView)view.findViewById(R.id.text1);
            textView2=(TextView)view.findViewById(R.id.text2);

        }

    }
    public re_adpter(List<message> messageList1)
    {
        messageList=messageList1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.message_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.messageView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                int position=holder.getAdapterPosition();
                message message=messageList.get(position);
                return false;
            }
//            public
        });
        holder.textView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position=holder.getAdapterPosition();
                message data=messageList.get(position);
                String name=data.getName();
                String mess=data.getDetails();
                Intent intent=new Intent(v.getContext(),DetailsActivity.class);
                intent.putExtra("e_name",name);
                intent.putExtra("e_mess",mess);
                v.getContext().startActivity(intent);
                return false;
            }
        });
        holder.textView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int position=holder.getAdapterPosition();
                message data=messageList.get(position);
                String name=data.getName();
                String mess=data.getDetails();
                Intent intent=new Intent(v.getContext(),DetailsActivity.class);
                intent.putExtra("e_name",name);
                intent.putExtra("e_mess",mess);
                v.getContext().startActivity(intent);
                return false;
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        message message=messageList.get(position);
        holder.textView1.setText(message.getName());
        holder.textView2.setText(message.getDetails());
        int po=holder.getAdapterPosition();
        if((po % 2) == 0) {
            holder.messageView.setBackgroundColor(Color.WHITE);
        } else {
            holder.messageView.setBackgroundColor(Color.YELLOW);
        }
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }
}
