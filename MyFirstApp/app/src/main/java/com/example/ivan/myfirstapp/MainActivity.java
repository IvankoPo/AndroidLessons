package com.example.ivan.myfirstapp;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.spain).setOnClickListener(view -> {
            FullImage.show(this, 1);
        });

        findViewById(R.id.russia).setOnClickListener(view -> {
            FullImage.show(this, 0);
        });

        findViewById(R.id.btn).setOnClickListener(view -> {
            Intent intent = new Intent(this, EnterForm.class);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView textView = findViewById(R.id.name);
        textView.setText(data.getStringExtra("name"));
    }
}
