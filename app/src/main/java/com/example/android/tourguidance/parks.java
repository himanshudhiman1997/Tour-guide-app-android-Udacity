package com.example.android.tourguidance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mr on 20-02-2017.
 */

public class parks extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks);
        ArrayList<Tour> guide = new ArrayList<Tour>();
        guide.add(new Tour(getText(R.string.galileo).toString(),R.mipmap.galileo));
        guide.add(new Tour(getText(R.string.fleming).toString(),R.mipmap.fleming));
        guide.add(new Tour(getText(R.string.edison).toString(),R.mipmap.edison));
        guide.add(new Tour(getText(R.string.babbage).toString(),R.mipmap.babbage));
        guide.add(new Tour(getText(R.string.turing).toString(),R.mipmap.turing));
        guide.add(new Tour(getText(R.string.bloom).toString(),R.mipmap.bloom));
        guide.add(new Tour(getText(R.string.newton).toString(),R.mipmap.newton));
        TourAdapter adapter =new TourAdapter(this,guide,R.color.parks);
        ListView listView = (ListView) findViewById(R.id.activity_parks);
        listView.setAdapter(adapter);
    }
}
