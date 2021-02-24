package com.example.loginregisterjava;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn_front,btn_back,btn_center,btn_es,btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_front=(Button)findViewById(R.id.buttonfront);
        btn_back=(Button)findViewById(R.id.buttonback);
        btn_center=(Button)findViewById(R.id.buttoncenter);
        btn_es=(Button)findViewById(R.id.buttonperimeter);
        btn_next=(Button)findViewById(R.id.buttonNext);

        btn_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Front clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),FrontItems.class);
                startActivity(intent);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Back clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),BackItems.class);
                startActivity(intent);
            }
        });

        btn_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Center clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),CenterItems.class);
                startActivity(intent);
            }
        });

        btn_es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Entire Store clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),EntireStoreItems.class);
                startActivity(intent);

            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Choose Layouts clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layouts.class);
                startActivity(intent);
            }
        });





    }
}