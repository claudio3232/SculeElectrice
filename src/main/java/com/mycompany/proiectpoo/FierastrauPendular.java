package com.mycompany.proiectpoo;

/**
 * Clasa FierastrauPendular derivata din SculeElectrice.
 */
class FierastrauPendular extends SculeElectrice {
    protected int vitezaTaiere; 
    protected boolean vitezaReglabila;
    protected boolean laserghidaj;

    // Constructor fara argumente
    public FierastrauPendular() {
        super();
        this.vitezaTaiere = 0;
        this.vitezaReglabila = false;
        this.laserghidaj = false;
    }

    // Constructor cu toate argumentele
    public FierastrauPendular(String firma, int putere, float greutate, int vitezaTaiere, boolean vitezaReglabila ,boolean laserghida ) {
        super(firma, putere, greutate);
        this.vitezaTaiere = vitezaTaiere;
        this.vitezaReglabila = vitezaReglabila;
        this.laserghidaj = laserghidaj;
    }

        public FierastrauPendular(FierastrauPendular fierastrau) {
        super(fierastrau);
        this.vitezaTaiere = fierastrau.vitezaTaiere;
        this.vitezaReglabila = fierastrau.vitezaReglabila;
        this.laserghidaj = fierastrau.laserghidaj;
    }


    // Implementare metoda descriereDetaliata
    public String toString() {
        return super.toString() + ", Viteza taiere: " + vitezaTaiere + " RPM, " + 
                "viteza reglabila: " + (vitezaReglabila ? "Da" : "Nu") + ", " +
                "laserghidaj: " + (laserghidaj ? "Da" : "Nu");
    }
}