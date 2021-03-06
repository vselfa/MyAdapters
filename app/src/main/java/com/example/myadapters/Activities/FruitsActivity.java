package com.example.myadapters.Activities;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.widget.ListView;

import com.example.myadapters.Adapters.FruitsAdapter;
import com.example.myadapters.Model.MyFruit;
import com.example.myadapters.R;

import java.util.ArrayList;

public class FruitsActivity extends MainMenu {

    // Example of using an ArrayAdapter class
    private String[] fruitsName  = {"Mango","Banana", "Water melon", "Grapes", "Kiwi"};
    private String[] fruitsDescription  = {"Mango", "Plàtan", "Meló d'Alger", "Raïm", "Kiwi"};
    private int[]    fruitsPhoto = {R.drawable.mango, R.drawable.banana, R.drawable.water_melon, R.drawable.grapes, R.drawable.kiwi};
    private ListView myFruitsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        // Toolbar with menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Construct the data source
        ArrayList<MyFruit> myFruits = new ArrayList<>();
        for (int i=0; i<fruitsName.length; i++) {
            // Create a writer object
            MyFruit aux = new MyFruit(fruitsName[i], fruitsDescription[i], fruitsPhoto[i]);
            Log.d ("description" ,"Description aux: " + aux.getDescription() );
            // Add to the ArrayList
            myFruits.add(aux);
            // The objects of the view
            myFruitsListView = findViewById(R.id.lstFruits);
            // Create the adapter to convert the array to views
            FruitsAdapter adapter = new FruitsAdapter(this, myFruits);
            // Attach the adapter to a ListView
            myFruitsListView.setAdapter(adapter);
        }
    }
}
