package com.example.myadapters.Activities;

import android.content.Context;
import android.os.Bundle;

import com.example.myadapters.Adapters.ArrayAdapter;
import com.example.myadapters.Adapters.ChessTeamsAdapter;
import com.example.myadapters.Model.ChessTeam;
import com.example.myadapters.Model.Punts;
import com.example.myadapters.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChessTeamsActivity extends AppCompatActivity {

    // Per poder ordenar claus repetides: Build.Gradle module
    // implementation 'com.google.guava:guava:14.0.1'
    private Multimap<Punts, String> treeMultiMap = HashMultimap.create();
    // La llista dels equips
    ArrayList<ChessTeam> chessTeamList =  new ArrayList<>();

    public Context getContext() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess_teams);
        // Toolbar i menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // La vista on mostrar la llista d'equips
        final ListView mListView =  findViewById(R.id.listView);
        // Les dades a representar
        // Els punts
        Punts puntsEquip1 = new Punts (100, 200);
        Punts puntsEquip2 = new Punts (500, 100);
        Punts puntsEquip3 = new Punts (100, 300);
        // Els equips
        ChessTeam equip1 = new ChessTeam("equip1", "equip1", puntsEquip1);
        ChessTeam equip2 = new ChessTeam("equip2", "equip3", puntsEquip2);
        ChessTeam equip3 = new ChessTeam("equip3", "equip3", puntsEquip3);

        chessTeamList.add(equip1); chessTeamList.add(equip2); chessTeamList.add(equip3);
        // El adapter: EquipListAdapter adapter;
        ChessTeamsAdapter adapter = new ChessTeamsAdapter(getContext(),
                R.layout.chess_team_layout, chessTeamList );
         // Cridem a l'adapter
        mListView.setAdapter(adapter);
    }

}
