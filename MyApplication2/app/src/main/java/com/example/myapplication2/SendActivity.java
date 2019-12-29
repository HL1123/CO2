package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendactivity);
        editText1=(EditText) findViewById(R.id.edit1);
        editText2=(EditText) findViewById(R.id.edit2);
        Button button=(Button) findViewById(R.id.send);
//        Intent intent=getIntent();
//        String name= intent.getStringExtra("e_name");
//        String mess=intent.getStringExtra("e_mess");
//        editText1.setText(name);
//        editText2.setText(mess);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText1.getText().toString();
                String message=editText2.getText().toString();
                Intent intent=new Intent(SendActivity.this,MainActivity.class);
                intent.putExtra("e_name",name);
                intent.putExtra("e_message",message);
                startActivity(intent);
            }
        });
    }
}
