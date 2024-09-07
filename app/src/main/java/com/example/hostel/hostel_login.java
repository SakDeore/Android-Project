package com.example.hostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class hostel_login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel_login);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        b=findViewById(R.id.loginbutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user") && password.getText().toString().equals("pass123"))
                {
                    Intent i= new Intent(hostel_login.this, home.class);
                            startActivity(i);
                    Toast.makeText(hostel_login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(hostel_login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}