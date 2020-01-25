package com.example.myadapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArrayAdapter extends android.widget.ArrayAdapter {
    public ArrayAdapter(Context context, List objects) {
        // (context, 0, objects) needed to match the parent constructor!!!
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MyWriter myWriter = (MyWriter) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_my_writer,
                    parent, false);
        }
        // Lookup view for data population
        ImageView writerPhoto = convertView.findViewById(R.id.writerPhoto);
        TextView writerName  = convertView.findViewById(R.id.writerName);
        // Populate the data into the template view using the data object
        writerPhoto.setImageResource(myWriter.getPhoto());
        writerName.setText(myWriter.getName());
        // Return the completed view to render on screen
        return convertView;
    }
}

