package com.example.ivan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnActivity).setOnClickListener(view -> {
            EditText editText  = findViewById(R.id.MessageV);
            String m = editText.getText().toString();
            MessageActivity.show(this, m);
        });

        findViewById(R.id.btnEmail).setOnClickListener(view -> {
            String addresses[] = {"vano99pl@mail.ru"};
            String subject = "my app";
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, addresses);
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });


    }
}
