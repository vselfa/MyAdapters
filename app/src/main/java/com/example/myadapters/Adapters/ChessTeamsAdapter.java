package com.example.myadapters.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myadapters.Model.ChessTeam;
import com.example.myadapters.Model.Punts;
import com.example.myadapters.R;
import java.util.ArrayList;

public class ChessTeamsAdapter  extends ArrayAdapter<ChessTeam> {

    private Context mContext;
    private int mResource;
    private Punts punts;

    public ChessTeamsAdapter(Context context, int resource, ArrayList<ChessTeam> objects) {
        super(context, resource, objects);
        mContext =  context;  // Important per accedir a getResources, entre altres coses
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //  Get the team information
        String fotoE = getItem(position).getFotoEquip();
        String nomE = getItem(position).getNomEquip();
        punts = getItem(position).getPunts();

        //Create the person object with the information
        ChessTeam equip = new ChessTeam(fotoE, nomE, punts);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        ImageView fotoEquip = convertView.findViewById(R.id.fotoEquip);
        TextView nomEquip = convertView.findViewById(R.id.nomEquip);
        TextView puntsEquip =  convertView.findViewById(R.id.puntsEquip);
        TextView puntsJugadors =  convertView.findViewById(R.id.puntsJugadors);

        // Transformar el nom de la foto en R.drawable.nom_foto
        // Eliminar corxets del nom de la foto
        int foto = mContext.getResources().getIdentifier( fotoE, "drawable", mContext.getPackageName());
        fotoEquip.setImageResource(foto);
        nomEquip.setText(equip.getNomEquip());
        // Els punts
        puntsEquip.setText(String.valueOf(punts.getPuntsEquip()));
        puntsJugadors.setText(String.valueOf(punts.getPuntsJugadors()));

        return convertView;
    }
}

