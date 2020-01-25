package com.example.myadapters;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HandmadeLayoutActivity extends AppCompatActivity {

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
    }
}
