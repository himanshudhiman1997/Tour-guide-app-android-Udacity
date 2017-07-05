package com.example.android.tourguidance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mr on 20-02-2017.
 */

public class colleges extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colleges);
        ArrayList<Tour> guide = new ArrayList<Tour>();
        guide.add(new Tour(getText(R.string.chitkara).toString(),R.mipmap.chitkara));
        guide.add(new Tour(getText(R.string.sviet).toString(),R.mipmap.sviet));
        guide.add(new Tour(getText(R.string.gyan).toString(),R.mipmap.giansagar));
        guide.add(new Tour(getText(R.string.thapar).toString(),R.mipmap.thapar));
        guide.add(new Tour(getText(R.string.punjabi).toString(),R.mipmap.punjabi));
        guide.add(new Tour(getText(R.string.chandigarh).toString(),R.mipmap.chandigarh));
        guide.add(new Tour(getText(R.string.skiet).toString(),R.mipmap.skiet));
        TourAdapter adapter = new TourAdapter(this,guide,R.color.colleges);
        ListView listView = (ListView) findViewById(R.id.activity_colleges);
        listView.setAdapter(adapter);
    }
}
