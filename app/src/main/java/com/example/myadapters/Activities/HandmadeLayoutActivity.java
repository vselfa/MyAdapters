package com.example.myadapters.Activities;

import android.os.Bundle;

import com.example.myadapters.R;

import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HandmadeLayoutActivity extends MainMenu {

    private String[] llibres = {"El ninot de neu",
            "Senyoria", "Els assassins de l'emperador"};
    private ListView myBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handmade_layout);
        // Toolbar with menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // The Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>
            (this, R.layout.activity_my_book, R.id.bookName,  llibres );
        // The View
        myBooks = findViewById(R.id.lstOptions);
        myBooks.setAdapter(adapter);
        // The listener
        myBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String bookName = llibres[position];
                Toast.makeText(HandmadeLayoutActivity.this, " Selected book name: "
                        + bookName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
