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
    private String tipManer;
    private int diametruDisc;
    private int turatieMaxima;
    private boolean protectieSupraIncalzire;


    // Constructor fara argumente
    public PolizorUnghiular() {
        super();
        this.tipManer = "Necunoscut";
        this.diametruDisc = 0;
        this.turatieMaxima = 0;
        this.protectieSupraIncalzire = false;
    }

    // Constructor cu toate argumentele
    public PolizorUnghiular(String firma, int putere, float greutate, String tipManer,int diametruDisc, int turatieMaxima, boolean protectieSupraIncalzire) {
        super(firma, putere, greutate);
        this.tipManer = tipManer;
         this.diametruDisc = diametruDisc;
        this.turatieMaxima = turatieMaxima;
        this.protectieSupraIncalzire = protectieSupraIncalzire;
    }

    // Constructor de copiere
    public PolizorUnghiular(PolizorUnghiular polizor) {
        super(polizor);
        this.tipManer = polizor.tipManer;
         this.diametruDisc = polizor.diametruDisc;
        this.turatieMaxima = polizor.turatieMaxima;
        this.protectieSupraIncalzire = polizor.protectieSupraIncalzire;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + ", Tip maner: " + tipManer+", Diametru disc: " + diametruDisc + " mm" +", Turatie maxima: " + turatieMaxima + " RPM" +", Protectie la supraîncălzire: " + protectieSupraIncalzire;
    }
}
