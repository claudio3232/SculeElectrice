package com.mycompany.proiectpoo;

/**
 * Clasa FierastrauPendular derivata din SculeElectrice.
 */
class FierastrauPendular extends SculeElectrice {
    private int vitezaTaiere; // Viteza de taiere in RPM

    // Constructor fara argumente
    public FierastrauPendular() {
        super();
        this.vitezaTaiere = 0;
    }

    // Constructor cu toate argumentele
    public FierastrauPendular(String firma, int putere, float greutate, int vitezaTaiere) {
        super(firma, putere, greutate);
        this.vitezaTaiere = vitezaTaiere;
    }

    // Implementare metoda utilizarePrincipala
    public String utilizarePrincipala() {
        return "Fierastrau pendular este utilizat pentru taierea precisa a lemnului si metalului.";
    }

    // Implementare metoda descriereDetaliata
    public String toString() {
        return super.toString() + ", Viteza taiere: " + vitezaTaiere + " RPM";
    }
}
