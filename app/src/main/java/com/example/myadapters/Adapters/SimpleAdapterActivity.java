package com.example.myadapters.Adapters;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.myadapters.Activities.MainMenu;
import com.example.myadapters.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends MainMenu {
    // Writers
    private String[] writerNames = {"Jaume Cabré", "John Grisman", "Santiago Posteguillo"};
    private int[] writerPhotos = {R.drawable.jaume_cabre, R.drawable.john_grisham, R.drawable.santiago_posteguillo};
    // Books
    private String[] books = {"Senyoria", "Càmara de gas", "Els assassins de l'emperador"};
    private int[] bookPhotos = {R.drawable.senyoria, R.drawable.camara_de_gas, R.drawable.assassins_emperador};
    // View objects
    private ListView myWriters;
    TextView textWriters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        // Toolbar with menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // The Data resource
        List<Map<String ,Object>> data = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String ,Object> datum = new HashMap<>();
            datum.put("photo", writerPhotos[i]);
            datum.put("name", writerNames[i]);
            data.add(datum);
        }
        // The View
        textWriters = findViewById(R.id.textWriters);
        textWriters.setText(R.string.simple_adapter);
        myWriters = findViewById(R.id.lstWriters);
        // The Adapter
        SimpleAdapter simpleAdapter =
                new SimpleAdapter(this,  data, R.layout.activity_my_writer,
                    new String[] {"photo","name"}, new int[] {R.id.writerPhoto, R.id.writerName});
        myWriters.setAdapter(simpleAdapter);

        myWriters.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                buildDialog (writerNames[position], "Llibre: "
                        + books[position], position );
            }
        });
    }

    // Out of onCreate
    public void buildDialog (String title, String message, int position) {
        final ImageView image = new ImageView(this);
        image.setImageResource(writerPhotos[position]);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);     builder.setMessage(message);
        builder.setPositiveButton("OK", null); builder.setView(image);
        builder.create();         builder.show();
    }
}
