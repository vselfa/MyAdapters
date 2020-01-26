package com.example.myadapters.Activities;

import android.content.Context;
import android.os.Bundle;

import com.example.myadapters.Adapters.CheckBoxesAdapter;
import com.example.myadapters.Adapters.ChessTeamsAdapter;
import com.example.myadapters.Model.MyCheckBox;
import com.example.myadapters.Model.ChessTeam;
import com.example.myadapters.Model.Punts;

import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myadapters.R;

import java.util.ArrayList;

public class CheckBoxesActivity extends MainMenu {

    // La llista de les CheckBoxes
    ArrayList<MyCheckBox> checkBoxList =  new ArrayList<>();

    public Context getContext() {
        return this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chec_boxes);
        // Toolbar i menu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // La vista on mostrar la llista d'equips
        final ListView mListView =  findViewById(R.id.listView);
        // El contingut dels CheckBoxes
        CheckBox cbAux1 = new CheckBox(  getContext() );
        CheckBox cbAux2 = new CheckBox(  getContext() );
        MyCheckBox cb1 = new MyCheckBox("ic_book", "PMDM", cbAux1 );
        MyCheckBox cb2 = new MyCheckBox("ic_book", "AD", cbAux2 );

        // La llista de CheckBoxes
        checkBoxList.add(cb1); checkBoxList.add(cb2);
        // El adapter: EquipListAdapter adapter;
        CheckBoxesAdapter adapter = new CheckBoxesAdapter(getContext(),
                R.layout.checkboxes_layout, checkBoxList );
        // Cridem a l'adapter
        mListView.setAdapter(adapter);
    }

}
