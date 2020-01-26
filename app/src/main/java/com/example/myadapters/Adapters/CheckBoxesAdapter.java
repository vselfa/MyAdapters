package com.example.myadapters.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.myadapters.Activities.CheckBoxesActivity;
import com.example.myadapters.Model.ChessTeam;
import com.example.myadapters.Model.MyCheckBox;
import com.example.myadapters.Model.Punts;
import com.example.myadapters.R;

import java.util.ArrayList;

public class CheckBoxesAdapter extends ArrayAdapter<MyCheckBox> {

    private Context mContext;
    private int mResource;
    private CheckBox cbs;

    public CheckBoxesAdapter(Context context, int resource, ArrayList<MyCheckBox> objects) {
        super(context, resource, objects);
        mContext =  context;  // Important per accedir a getResources, entre altres coses
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //  Get the team information
        String foto = getItem(position).getFoto();
        final String nom = getItem(position).getText();
        cbs = getItem(position).getMyCheckBox();

        Log.d ("cb", "CB text: " + position + " -- " + cbs.getText() );

        //Create the person object with the information
        MyCheckBox myCB = new MyCheckBox(foto, nom, cbs);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        ImageView fotoCB = convertView.findViewById(R.id.image);
        TextView  textCB = convertView.findViewById(R.id.text);
        final CheckBox  cbCB   = convertView.findViewById(R.id.checkbox);

        cbCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final boolean checked = cbCB.isChecked();
                if (checked) displayToast ("Seleccionat l'element: " + nom);
                else displayToast ("Deseleccionat l'element: "+ nom);
            }
        });
        // Transformar el nom de la foto en R.drawable.nom_foto
        int fotoInt = mContext.getResources().getIdentifier( foto, "drawable", mContext.getPackageName());
        fotoCB.setImageResource(fotoInt);
        textCB.setText(myCB.getText());

        return convertView;
    }

    public  void displayToast (String text) {
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText( getContext(), text, duration);
        toast.show();
    }


}
