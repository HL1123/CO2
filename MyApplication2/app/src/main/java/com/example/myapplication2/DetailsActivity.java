package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        text1=(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.text2);
        Intent intent=getIntent();
        String name= intent.getStringExtra("e_name");
        String mess=intent.getStringExtra("e_mess");
        text1.setText("发件人：\n\n"+name);
        text2.setText("内容：\n\n\n"+mess);
    }
}
