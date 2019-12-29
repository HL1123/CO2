package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.myapplication2.R.menu.mian;

public class MainActivity extends AppCompatActivity {

    static public List<message> messageList=new ArrayList<>();
    static public int count;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mian,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case  R.id.item1:
                Toast.makeText(this,"请发送消息",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,SendActivity.class);
                startActivity(intent);
                break;
             default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(count!=0) {
            Intent intent = getIntent();
            String name = intent.getStringExtra("e_name");
            String message = intent.getStringExtra("e_message");
            message message1 = new message(name, message);
            initmessage(message1);
        }
        count++;
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        re_adpter adpter=new re_adpter(messageList);
        recyclerView.setAdapter(adpter);
    }
    private void initmessage(message x)
    {
          messageList.add(x);
//        for(i=0;i<messageList.size();i++)
//        {
//
//        }
    }

}
