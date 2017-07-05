package com.example.android.tourguidance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mr on 19-02-2017.
 */

public class menu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        TextView hotels = (TextView) findViewById(R.id.option1);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelIntent = new Intent(menu.this,hotels.class);
                startActivity(hotelIntent);
            }
        });
        TextView parks = (TextView) findViewById(R.id.option3);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(menu.this,parks.class);
                startActivity(parksIntent);
            }
        });
        TextView colleges = (TextView) findViewById(R.id.option2);
        colleges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collegesIntent = new Intent(menu.this,colleges.class);
                startActivity(collegesIntent);
            }
        });
        TextView hospitals = (TextView) findViewById(R.id.option4);
        hospitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hospitalsIntent = new Intent(menu.this,hospitals.class);
                startActivity(hospitalsIntent);
            }
        });
    }
}
