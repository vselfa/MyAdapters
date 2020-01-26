package com.example.myadapters.Activities;

import android.os.Bundle;

import com.example.myadapters.R;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
