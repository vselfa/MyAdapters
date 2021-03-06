package com.example.myadapters.Activities;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myadapters.R;

public class FirstAdapterActivity extends MainMenu {

    // Data Source
    final String[] lstInfo = new String[] {"Elem 1","Elem 2","Elem 3"};
    // The View object
    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_adapter);
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
                Toast.makeText(FirstAdapterActivity.this, "Item selected: "
                                + position + " Text: " + text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
