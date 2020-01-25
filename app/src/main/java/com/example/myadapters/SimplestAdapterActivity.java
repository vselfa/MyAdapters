package com.example.myadapters;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SimplestAdapterActivity extends MainMenu {

    // Data Source
    final String[] lstInfo = new String[] {"Elem 1","Elem 2","Elem 3"};
    // The View object
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplest_adapter);
        // Toolbar with menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // The Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lstInfo);
        // The View
        myListView = findViewById (R.id.lstOptions);
        myListView.setAdapter(adapter);
        // The listener
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String text = (String) (myListView.getItemAtPosition(position));
                Toast.makeText(SimplestAdapterActivity.this, "Item selected: "
                                + position + " Text: " + text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
