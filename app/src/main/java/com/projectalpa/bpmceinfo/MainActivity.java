package com.projectalpa.bpmceinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Login=findViewById(R.id.login);
        Login.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);
        });
    }
}