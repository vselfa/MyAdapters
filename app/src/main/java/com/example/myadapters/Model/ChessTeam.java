package com.example.myadapters.Model;

public  class ChessTeam {

    String fotoEquip;  // El nom de la foto sense extensió
    String nomEquip;
    Punts punts;

    public ChessTeam(String foto, String nom, Punts punts) {
        this.fotoEquip = foto;
        this.nomEquip = nom;
        this.punts = punts;
    }

    public String getFotoEquip() {
        return fotoEquip;
    }
    public void setFotoEquip(String fotoEquip) {
        this.fotoEquip = fotoEquip;
    }
    public String getNomEquip() {
        return nomEquip;
    }
    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }
    public Punts getPunts() {
        return punts;
    }
    public void setPunts(Punts puntsEquip) {
        this.punts  = puntsEquip;
    }

}
