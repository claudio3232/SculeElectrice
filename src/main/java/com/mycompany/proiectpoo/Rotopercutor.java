package com.mycompany.proiectpoo;


public class Rotopercutor extends SculeElectrice {
    private int percutiiPeMinut; // numarul de percutii pe minut

    // Constructor fara argumente
    public Rotopercutor() {
        super();
        this.percutiiPeMinut = 0;
    }

    // Constructor cu toate argumentele
    public Rotopercutor(String firma, int putere, float greutate, int percutiiPeMinut) {
        super(firma, putere, greutate);
        this.percutiiPeMinut = percutiiPeMinut;
    }

    // Constructor de copiere
    public Rotopercutor(Rotopercutor other) {
        super(other);
        this.percutiiPeMinut = other.percutiiPeMinut;
    }

    // Metoda toString rescrisa
    public String toString() {
        return super.toString() + ", Percutii/min=" + percutiiPeMinut;
    }
}

