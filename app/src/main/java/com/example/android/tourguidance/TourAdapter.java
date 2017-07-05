package com.example.android.tourguidance;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mr on 20-02-2017.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    private int tColorResourceId;
    private static final String LOG_TAG =TourAdapter.class.getSimpleName();
    public TourAdapter(Activity context, ArrayList<Tour> guide,int colorResourceId)
    {
        super(context,0,guide);
        tColorResourceId=colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Tour currentTour = getItem(position);
        TextView textName = (TextView) listItemView.findViewById(R.id.name_id);
        textName.setText(String.valueOf(currentTour.getTextName()));
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_id);
        if (currentTour.hasImage()) {
            imageView.setImageResource(currentTour.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(),tColorResourceId);
        textContainer.setBackgroundColor(color);
        listItemView.setOnClickListener( new  View.OnClickListener()
        {
            @Override
                public void onClick(View v)
            {

            }
        });
            return listItemView;
    }
}

