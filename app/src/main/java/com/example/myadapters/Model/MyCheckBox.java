package com.example.myadapters.Model;

import android.widget.CheckBox;

public class MyCheckBox {

    String foto;  // El nom de la foto sense extensió
    String text;
    CheckBox myCheckBox;

    public MyCheckBox(String foto, String text, CheckBox myCheckBox) {
        this.foto = foto;
        this.text = text;
        this.myCheckBox = myCheckBox;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CheckBox getMyCheckBox() {
        return myCheckBox;
    }

    public void setMyCheckBox(CheckBox myCheckBox) {
        this.myCheckBox = myCheckBox;
    }
}
