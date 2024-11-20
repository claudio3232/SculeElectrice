/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author Ballo
 */

public class PolizorUnghiular extends SculeElectrice {
    private String tipManer; // Tipul manerului (ergonomic, fix, pivotant)

    // Constructor fara argumente
    public PolizorUnghiular() {
        super();
        this.tipManer = "Necunoscut";
    }

    // Constructor cu toate argumentele
    public PolizorUnghiular(String firma, int putere, float greutate, String tipManer) {
        super(firma, putere, greutate);
        this.tipManer = tipManer;
    }

    // Constructor de copiere
    public PolizorUnghiular(PolizorUnghiular polizor) {
        super(polizor);
        this.tipManer = polizor.tipManer;
    }

    // Metoda toString
    public String toString() {
        return super.toString() + ", Tip maner: " + tipManer;
    }
}
