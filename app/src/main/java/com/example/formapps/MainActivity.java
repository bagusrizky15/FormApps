package com.example.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.idInputNama);
        EditText inputEmail = (EditText) findViewById(R.id.idInputEmail);
        EditText inputPhone = (EditText) findViewById(R.id.idInputPhone);
        EditText inputPassword = (EditText) findViewById(R.id.idInputPassword);

        Button btnSave = (Button) findViewById(R.id.idInputButton);
        btnSave.setOnClickListener(v ->{
          Intent loginIntent = new Intent(MainActivity.this, Dashboard_Activity.class);
          startActivity(loginIntent);
        });

    }
}