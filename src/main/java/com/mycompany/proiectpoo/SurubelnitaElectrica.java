package com.mycompany.proiectpoo;

/**
 * Clasa SurubelnitaElectrica derivata din SculeElectrice.
 */
class SurubelnitaElectrica extends SculeElectrice {
    private int turatiiMaxime; // Turatii maxime în RPM

    // Constructor fara argumente
    public SurubelnitaElectrica() {
        super();
        this.turatiiMaxime = 0;
    }

    // Constructor cu toate argumentele
    public SurubelnitaElectrica(String firma, int putere, float greutate, int turatiiMaxime) {
        super(firma, putere, greutate);
        this.turatiiMaxime = turatiiMaxime;
    }

    // Implementare metoda utilizarePrincipala
    public String utilizarePrincipala() {
        return "Surubelnita electrica este folosita pentru insurubare rapida si eficienta.";
    }

    // Implementare metoda descriereDetaliata
    public String toString() {
        return super.toString() + ", Turatii maxime: " + turatiiMaxime + " RPM";
    }
}
