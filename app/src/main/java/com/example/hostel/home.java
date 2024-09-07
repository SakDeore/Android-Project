package com.example.hostel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

             c1=findViewById(R.id.c1);
             c2=findViewById(R.id.c2);
              c3=findViewById(R.id.c3);
              c4=findViewById(R.id.c4);
              c5=findViewById(R.id.c5);
              c6=findViewById(R.id.c6);
              c7=findViewById(R.id.c7);
              c8=findViewById(R.id.c8);
              c9=findViewById(R.id.c9);
              c10=findViewById(R.id.c10);
              c11=findViewById(R.id.c11);
              c12=findViewById(R.id.c12);

       c1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(home.this, wifi.class);
               startActivity(intent);
           }
       });

       c2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new Intent(home.this, Security.class);
               startActivity(intent);
           }
       });

       c3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(home.this, cctv.class);
               startActivity(intent);
           }
       });

       c4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent= new Intent(home.this, housekeeping.class);
               startActivity(intent);
           }
       });

       c5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(home.this, laundry.class);
               startActivity(intent);
           }
       });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this, pantry.class);
                startActivity(intent);
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this, studyArea.class);
                startActivity(intent);
            }
        });

        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this, entertainment.class);
                startActivity(intent);
            }
        });

        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(home.this, parking.class);
                startActivity(intent);
            }
        });

        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this, meals.class);
                startActivity(intent);
            }
        });

        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this,Dispenser.class);
                startActivity(intent);
            }
        });

        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(home.this, games.class);
                startActivity(intent);
            }
        });




    }
}





