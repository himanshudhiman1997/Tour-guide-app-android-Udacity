package com.example.android.tourguidance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mr on 20-02-2017.
 */
public class hotels extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels);
        ArrayList<Tour> guide = new ArrayList<Tour>();
        guide.add(new Tour(getText(R.string.crown).toString(),R.mipmap.crown));
        guide.add(new Tour(getText(R.string.jw).toString(),R.mipmap.jwmarriott));
        guide.add(new Tour(getText(R.string.taj).toString(),R.mipmap.taj));
        guide.add(new Tour(getText(R.string.eagle).toString(),R.mipmap.eagle));
        guide.add(new Tour(getText(R.string.westin).toString(),R.mipmap.westin));
        guide.add(new Tour(getText(R.string.simran).toString(),R.mipmap.simran));
        TourAdapter adapter = new TourAdapter(this,guide,R.color.hotels);
        ListView listView = (ListView) findViewById(R.id.activity_hotels);
        listView.setAdapter(adapter);
    }
}
