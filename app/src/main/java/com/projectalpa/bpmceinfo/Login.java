package com.projectalpa.bpmceinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button Login=findViewById(R.id.Home);
        Login.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this,Home.class);
            startActivity(intent);
        });
    }
}