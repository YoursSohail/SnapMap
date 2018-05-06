package com.example.md.snapmap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by MD on 06-05-2018.
 */

public class CustomWindowAdapter implements GoogleMap.InfoWindowAdapter {

    private Activity context;


    public CustomWindowAdapter(Activity context){
        this.context = context;
    }


    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        View view = context.getLayoutInflater().inflate(R.layout.custom_window,null);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvSnippet = view.findViewById(R.id.tvSnippet);

        tvTitle.setText(marker.getTitle());
        tvSnippet.setText(marker.getSnippet());

        return view;
    }
}
