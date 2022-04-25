package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Ed_username,Ed_password;
    String St_username,St_password;
    Button Bt_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ed_username=(EditText) findViewById(R.id.username);
        Ed_password =(EditText) findViewById(R.id.password);

        Bt_submit=(Button) findViewById(R.id.submit);

        Bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                St_username = Ed_username.getText().toString().trim();
                St_password = Ed_password.getText().toString().trim();

                if (St_username=="Admin" & St_password=="Admin123"){
                    Toast.makeText(MainActivity.this, "Admin Login Successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "UserName Or Password Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}