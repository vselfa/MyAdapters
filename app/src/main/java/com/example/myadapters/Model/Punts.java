package com.example.myadapters.Model;

public class Punts {

    Integer puntsEquip;
    Integer puntsJugadors;

    public Punts() {};

    public Punts (Integer pE, Integer pJ) {
        this.puntsEquip = pE;
        this.puntsJugadors = pJ;
    }

    public Integer getPuntsEquip() {
        return puntsEquip;
    }
    public void setPuntsEquip(Integer puntsEquip) {
        this.puntsEquip = puntsEquip;
    }
    public Integer getPuntsJugadors() {
        return puntsJugadors;
    }
    public void setPuntsJugadors(Integer puntsJugadors) {
        this.puntsJugadors = puntsJugadors;
    }

}

