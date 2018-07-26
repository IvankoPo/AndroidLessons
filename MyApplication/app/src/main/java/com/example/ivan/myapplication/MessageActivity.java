package com.example.ivan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = findViewById(R.id.messageView);
        textView.setText(message);
    }

    public static void show(Context context, String message){
        Intent intent = new Intent(context, MessageActivity.class);
        intent.putExtra("message", message);
        context.startActivity(intent);
    }
}
