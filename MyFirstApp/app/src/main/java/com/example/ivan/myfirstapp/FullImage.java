package com.example.ivan.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FullImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        ImageView imageView = findViewById(R.id.content);
        if (id == 0){
            imageView.setImageResource(R.drawable.flag_russia);
        }
        else {
            imageView.setImageResource(R.drawable.flag_spain);
        }
    }

    public static void show(Context context, int id){
        Intent intent = new Intent(context, FullImage.class);
        intent.putExtra("id", id);
        context.startActivity(intent);
    }
}
