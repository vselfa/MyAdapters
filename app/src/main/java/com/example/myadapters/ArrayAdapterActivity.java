package com.example.myadapters;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapterActivity extends MainMenu {

    // Example of using an ArrayAdapter class
    private String[] writersName={"Jaume Cabré", "John Grisman", "Santiago Posteguillo"};
    private int[] writersPhoto={R.drawable.jaume_cabre,R.drawable.john_grisham,
            R.drawable.santiago_posteguillo};
    private String[] books = {"Senyoria", "Càmara de gas", "Els assassins de l'emperador"};
    private int[] photosBooks = {R.drawable.senyoria, R.drawable.camara_de_gas,
            R.drawable.assassins_emperador};
    private ListView myWritersListView;
    private TextView title;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The same view like the previous Activity
        setContentView(R.layout.activity_simple_adapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Construct the data source
        ArrayList<MyWriter> myWriters = new ArrayList<>();
        for (int i=0; i<3; i++) {
            // Create a writer object
            MyWriter aux = new MyWriter(writersName[i], writersPhoto[i]);
            // Add to the ArrayList
            myWriters.add(aux);
            // The objects of the view
            myWritersListView = findViewById(R.id.lstWriters);
            title = findViewById(R.id.textWriters);
            title.setText("Array Adapter");
            // Create the adapter to convert the array to views
            ArrayAdapter adapter = new ArrayAdapter(this, myWriters);
            // Attach the adapter to a ListView
            myWritersListView.setAdapter(adapter);
            // The listener
            myWritersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    buildDialog (writersName[position]," Nom del llibre: "
                            +books [position], position );
                }
            });
        }
    }

    // Out of onCreate
    public void buildDialog (String title, String message, int position) {
        final ImageView image = new ImageView(this);
        image.setImageResource(photosBooks[position]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);     builder.setMessage(message);
        builder.setPositiveButton("OK", null); builder.setView(image);
        builder.create();         builder.show();
    }
}
