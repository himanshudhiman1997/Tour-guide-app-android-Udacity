package com.example.android.tourguidance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by mr on 20-02-2017.
 */

public class hospitals extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospitals);
        ArrayList<Tour> guide = new ArrayList<Tour>();
        guide.add(new Tour(getText(R.string.anand).toString(),R.mipmap.anand));
        guide.add(new Tour(getText(R.string.apollo).toString(),R.mipmap.apollo));
        guide.add(new Tour(getText(R.string.babycare).toString(),R.mipmap.babycare));
        guide.add(new Tour(getText(R.string.fortis).toString(),R.mipmap.fortis));
        guide.add(new Tour(getText(R.string.manipal).toString(),R.mipmap.manipal));
        guide.add(new Tour(getText(R.string.max).toString(),R.mipmap.max));
        guide.add(new Tour(getText(R.string.moorfields).toString(),R.mipmap.moorfields));
        guide.add(new Tour(getText(R.string.columbia).toString(),R.mipmap.columbia));
        TourAdapter adapter =new TourAdapter(this,guide,R.color.hospitals);
        ListView listView = (ListView) findViewById(R.id.activity_hospitals);
        listView.setAdapter(adapter);
    }
}
