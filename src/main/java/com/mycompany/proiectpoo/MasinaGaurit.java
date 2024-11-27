/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author Ballo
 */

public class MasinaGaurit extends SculeElectrice {
    private long numarPercutii; // numarul de percutii pe minut

    // Constructor fara argumente
    public MasinaGaurit() {
        super();
        this.numarPercutii = 0;
    }

    // Constructor cu toate argumentele
    public MasinaGaurit(String firma, int putere, float greutate, long numarPercutii) {
        super(firma, putere, greutate);
        this.numarPercutii = numarPercutii;
    }

    // Constructor de copiere
    public MasinaGaurit(MasinaGaurit masina) {
        super(masina);
        this.numarPercutii = masina.numarPercutii;
    }

    // Metoda toString
    public String toString() {
        return super.toString() + ", Numar percutii: " + numarPercutii + " pe minut";
    }
}

