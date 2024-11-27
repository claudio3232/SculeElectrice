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
    private int numarPercutii;
     private boolean functiePercutie;
    private int diametruMaximGaurire;
    private String tipMandrina;


    // Constructor fara argumente
    public MasinaGaurit() {
        super();
        this.numarPercutii = 0;
         this.numarPercutii = 0;
        this.functiePercutie = false;
        this.diametruMaximGaurire = 0;
        this.tipMandrina = "Necunoscut";
    }

    // Constructor cu toate argumentele
    public MasinaGaurit(String firma, int putere, float greutate, int numarPercutii, boolean functiePercutie, int diametruMaximGaurire, String tipMandrina) {
        super(firma, putere, greutate);
        this.numarPercutii = numarPercutii;
        this.functiePercutie = functiePercutie;
        this.diametruMaximGaurire = diametruMaximGaurire;
        this.tipMandrina = tipMandrina;
    }

    // Constructor de copiere
    public MasinaGaurit(MasinaGaurit masina) {
        super(masina);
        this.numarPercutii = masina.numarPercutii;
         this.functiePercutie = masina.functiePercutie;
        this.diametruMaximGaurire = masina.diametruMaximGaurire;
        this.tipMandrina = masina.tipMandrina;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + ", Numar percutii: " + numarPercutii + " pe minut"+", Functie percutie: " + functiePercutie +", Diametru maxim gaurire: " + diametruMaximGaurire + " mm" +", Tip mandrina: " + tipMandrina;
    }
}