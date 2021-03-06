package com.example.myadapters.Activities;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myadapters.Adapters.SimpleAdapterActivity;
import com.example.myadapters.R;

public class MainMenu extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent=null;

        if (id == R.id.home) {
            intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.simplestAdapter) {
            intent = new Intent(this, FirstAdapterActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.handmadeAdapter) {
            intent = new Intent(this, HandmadeLayoutActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.simpleAdapter) {
            intent = new Intent(this, SimpleAdapterActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.arrayAdapter) {
            intent = new Intent(this, ArrayAdapterActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.fruitsAdapter) {
            intent = new Intent(this, FruitsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.chessTeamsAdapter) {
            intent = new Intent(this, ChessTeamsActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        if (id == R.id.checkboxAdapter) {
            intent = new Intent(this, CheckBoxesActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }
        startActivity(intent); //Starting the new activity
        return true;
    }
}
