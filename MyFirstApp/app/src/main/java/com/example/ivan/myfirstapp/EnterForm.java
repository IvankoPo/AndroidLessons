package com.example.ivan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EnterForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_form);
        findViewById(R.id.btnGet).setOnClickListener(view -> {
            EditText editText = (EditText)findViewById(R.id.textName);
            String result = editText.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("name", result);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}
