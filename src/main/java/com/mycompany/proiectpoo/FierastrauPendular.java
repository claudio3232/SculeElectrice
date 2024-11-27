package com.mycompany.proiectpoo;

/**
 * Clasa FierastrauPendular derivată din SculeElectrice.
 */
public class FierastrauPendular extends SculeElectrice {
    protected int vitezaTaiere;         // Viteza de tăiere (RPM)
    protected boolean vitezaReglabila; // Viteza este reglabilă?
    protected boolean laserghidaj;     // Are ghidaj cu laser?
    protected int nivelZgomot;         // Nivelul de zgomot (dB)
    protected String tipTaiere;        // Tipul de tăiere suportat

    // Constructor fără argumente
    public FierastrauPendular() {
        super();
        this.vitezaTaiere = 0;
        this.vitezaReglabila = false;
        this.laserghidaj = false;
        this.nivelZgomot = 0;
        this.tipTaiere = "";
    }

    // Constructor cu toate argumentele
    public FierastrauPendular(String firma, int putere, float greutate, int vitezaTaiere, boolean vitezaReglabila, 
                              boolean laserghidaj, int nivelZgomot, String tipTaiere) {
        super(firma, putere, greutate);
        this.vitezaTaiere = vitezaTaiere;
        this.vitezaReglabila = vitezaReglabila;
        this.laserghidaj = laserghidaj;
        this.nivelZgomot = nivelZgomot;
        this.tipTaiere = tipTaiere;
    }

    // Constructor de copiere
    public FierastrauPendular(FierastrauPendular fierastrau) {
        super(fierastrau);
        this.vitezaTaiere = fierastrau.vitezaTaiere;
        this.vitezaReglabila = fierastrau.vitezaReglabila;
        this.laserghidaj = fierastrau.laserghidaj;
        this.nivelZgomot = fierastrau.nivelZgomot;
        this.tipTaiere = fierastrau.tipTaiere;
    }

    // Getter și setter pentru fiecare atribut
    public int getVitezaTaiere() {
        return vitezaTaiere;
    }

    public void setVitezaTaiere(int vitezaTaiere) {
        this.vitezaTaiere = vitezaTaiere;
    }

    public boolean isVitezaReglabila() {
        return vitezaReglabila;
    }

    public void setVitezaReglabila(boolean vitezaReglabila) {
        this.vitezaReglabila = vitezaReglabila;
    }

    public boolean isLaserghidaj() {
        return laserghidaj;
    }

    public void setLaserghidaj(boolean laserghidaj) {
        this.laserghidaj = laserghidaj;
    }

    public int getNivelZgomot() {
        return nivelZgomot;
    }

    public void setNivelZgomot(int nivelZgomot) {
        this.nivelZgomot = nivelZgomot;
    }

    public String getTipTaiere() {
        return tipTaiere;
    }

    public void setTipTaiere(String tipTaiere) {
        this.tipTaiere = tipTaiere;
    }
  
    
    @Override
    public String toString() {
        return super.toString() + ", Viteza taiere: " + vitezaTaiere + " RPM, " + 
                "viteza reglabila: " + (vitezaReglabila ? "Da" : "Nu") + ", " +
                "laserghidaj: " + (laserghidaj ? "Da" : "Nu") + ", " +
                "nivel zgomot: " + nivelZgomot + " dB, " +
                "tip taiere: " + tipTaiere;
    }
}
