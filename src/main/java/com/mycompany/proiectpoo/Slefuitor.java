/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author nechi
 */

class Slefuitor extends SculeElectrice {
    private float dimensiuneDisc; // in mm
    private boolean esteProfesional;
    private boolean vitezaVariabila;
    private String tipSuprafata; // Tipul suprafetei (lemn, metal, piatra)
    private int garantie; // Perioada garantie in luni
    
    // Constructor fara argumente
    public Slefuitor() {
        super();
        this.dimensiuneDisc = 0.0f;
        this.esteProfesional = false;
        this.vitezaVariabila = false;
        this.tipSuprafata = "Necunoscut";
        this.garantie = 0;
    }

    // Constructor cu toate argumentele
    public Slefuitor(String firma, int putere, float greutate, float dimensiuneDisc, boolean esteProfesional, boolean vitezaVariabila, String tipSuprafata, int garantie) {
        super(firma, putere, greutate);
        this.dimensiuneDisc = dimensiuneDisc;
        this.esteProfesional = esteProfesional;
        this.vitezaVariabila = vitezaVariabila;
        this.tipSuprafata = tipSuprafata;
        this.garantie = garantie;
    }

    // Constructor de copiere
    public Slefuitor(Slefuitor slefuitor) {
        super(slefuitor);
        this.dimensiuneDisc = slefuitor.dimensiuneDisc;
        this.esteProfesional = slefuitor.esteProfesional;
        this.vitezaVariabila = slefuitor.vitezaVariabila;
        this.tipSuprafata = slefuitor.tipSuprafata;
        this.garantie = slefuitor.garantie;
    }

    // Implementarea metodei abstracte
    public String specificatii() {
        return "Slefuitor cu dimensiunea discului de " + dimensiuneDisc + " mm, " +
               "uz profesional: " + (esteProfesional ? "Da" : "Nu") + ", " +
               "viteza variabilă: " + (vitezaVariabila ? "Da" : "Nu") + ", " +
               "destinat pentru suprafata: " + tipSuprafata + ", " +
               "garantie: " + garantie + " luni.";
    }

    // Metoda toString
    public String toString() {
        return super.toString() + ", Dimensiunea discului: " + dimensiuneDisc + " mm, " + 
                "Este profesional: " + (esteProfesional ? "Da" : "Nu") + ", "
                + "Viteza variabila: " + (vitezaVariabila ? "Da" : "Nu") + ", "
                + "Tip suprafata: " + tipSuprafata + ", " +
                "Perioada de garantie: " + garantie + " luni";
    }

    // Getteri si Setteri
    public float getDimensiuneDisc() {
        return dimensiuneDisc;
    }

    public void setDimensiuneDisc(float dimensiuneDisc) {
        this.dimensiuneDisc = dimensiuneDisc;
    }

    public boolean isEsteProfesional() {
        return esteProfesional;
    }

    public void setEsteProfesional(boolean esteProfesional) {
        this.esteProfesional = esteProfesional;
    }

    public boolean isVitezaVariabila() {
        return vitezaVariabila;
    }

    public void setVitezaVariabila(boolean vitezaVariabila) {
        this.vitezaVariabila = vitezaVariabila;
    }

    public String getTipSuprafata() {
        return tipSuprafata;
    }

    public void setTipSuprafata(String tipSuprafata) {
        this.tipSuprafata = tipSuprafata;
    }

    public int getGarantie() {
        return garantie;
    }

    public void setGarantie(int garantie) {
        this.garantie = garantie;
    }
}

