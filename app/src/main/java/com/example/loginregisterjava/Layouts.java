package com.example.loginregisterjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Layouts extends AppCompatActivity {

    Button btn_ly1,btn_ly2,btn_ly3,btn_ly4,btn_ly5,btn_ly6,btn_ly7,btn_ly8,btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        btn_ly1=(Button)findViewById(R.id.lay_1);
        btn_ly2=(Button)findViewById(R.id.lay_2);
        btn_ly3=(Button)findViewById(R.id.lay_3);
        btn_ly4=(Button)findViewById(R.id.lay_4);
        btn_ly5=(Button)findViewById(R.id.lay_5);
        btn_ly6=(Button)findViewById(R.id.lay_6);
        btn_ly7=(Button)findViewById(R.id.lay_7);
        btn_ly8=(Button)findViewById(R.id.lay_8);
        btn_next=(Button)findViewById(R.id.Next);

        btn_ly1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout1 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout1.class);
                startActivity(intent);

            }
        });

        btn_ly2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout2 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout2.class);
                startActivity(intent);

            }
        });

        btn_ly3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout3 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout3.class);
                startActivity(intent);

            }
        });

        btn_ly4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout4 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout4.class);
                startActivity(intent);

            }
        });

        btn_ly5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout5 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout5.class);
                startActivity(intent);

            }
        });

        btn_ly6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout6 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout6.class);
                startActivity(intent);

            }
        });

        btn_ly7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout7 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout7.class);
                startActivity(intent);

            }
        });

        btn_ly8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Layout8 clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Layout8.class);
                startActivity(intent);

            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Layouts.this, "Clicked Recommendations!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),recommendation.class);
                startActivity(intent);
            }
        });







    }
}

