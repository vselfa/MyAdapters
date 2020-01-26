package com.example.myadapters.Model;

import java.util.Comparator;

public  class ChessTeam implements Comparator<Punts>, Comparable<Punts> {

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

    @Override
    public int compareTo(Punts d) {
        return (this.punts.getPuntsEquip()).compareTo(d.getPuntsEquip());
    }

    @Override
    public int compare(Punts p, Punts p1) {
        return p.getPuntsEquip() - p1.getPuntsEquip();
    }

}
