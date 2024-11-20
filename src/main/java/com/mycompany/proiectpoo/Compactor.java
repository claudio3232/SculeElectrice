package com.mycompany.proiectpoo;


public class Compactor extends SculeElectrice {
    private double fortaCompactare; // in kilograme-forta

    // Constructor fara argumente
    public Compactor() {
        super();
        this.fortaCompactare = 0.0f;
    }

    // Constructor cu toate argumentele
    public Compactor(String firma, int putere, float greutate, double fortaCompactare) {
        super(firma, putere, greutate);
        this.fortaCompactare = fortaCompactare;
    }

    // Constructor de copiere
    public Compactor(Compactor other) {
        super(other);
        this.fortaCompactare = other.fortaCompactare;
    }

    // Metoda toString rescrisa
    public String toString() {
        return super.toString() + ", FortaCompactare=" + fortaCompactare + " kgf";
    }
}
