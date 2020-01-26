package com.example.myadapters.Adapters;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myadapters.Model.MyFruit;
import com.example.myadapters.R;

import java.util.List;

public class FruitsAdapter extends android.widget.ArrayAdapter {

    public FruitsAdapter(Context context, List objects) {
        // (context, 0, objects) needed to match the parent constructor!!!
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MyFruit myFruit = (MyFruit) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_my_fruit,
                    parent, false);
        }
        // Lookup view for data population
        ImageView fruitPhoto = convertView.findViewById(R.id.fruitPhoto);
        TextView fruitName  = convertView.findViewById(R.id.fruitName);
        TextView fruitDescription  = convertView.findViewById(R.id.fruitDescription);

        Log.d ("description" , "Description : " + fruitDescription.getText().toString());

        // Populate the data into the template view using the data object
        fruitPhoto.setImageResource(myFruit.getPhoto());
        fruitName.setText(myFruit.getName());
        fruitDescription.setText(myFruit.getDescription());
        // Return the completed view to render on screen
        return convertView;
    }
}

