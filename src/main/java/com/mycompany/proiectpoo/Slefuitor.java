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
    private boolean esteProfesional; // Indica daca slefuitorul este destinat uzului profesional
    private boolean vitezaVariabila; // Indica daca slefuitorul are viteza variabila
    
    // Constructor fara argumente
    public Slefuitor() {
        super();
        this.dimensiuneDisc = 0.0f;
        this.esteProfesional = false;
        this.vitezaVariabila = false;
    }

    // Constructor cu toate argumentele
    public Slefuitor(String firma, int putere, float greutate, float dimensiuneDisc,  boolean esteProfesional, boolean vitezaVariabila) {
        super(firma, putere, greutate);
        this.dimensiuneDisc = dimensiuneDisc;
        this.esteProfesional = esteProfesional;
        this.vitezaVariabila = vitezaVariabila;
    }

    // Constructor de copiere
    public Slefuitor(Slefuitor slefuitor) {
        super(slefuitor);
        this.dimensiuneDisc = slefuitor.dimensiuneDisc;
        this.esteProfesional = slefuitor.esteProfesional;
        this.vitezaVariabila = slefuitor.vitezaVariabila;
    }
    
    // Implementarea metodei abstracte
    @Override
    public String specificatii() {
        return "Slefuitor cu dimensiunea discului de " + dimensiuneDisc + " mm, " +
               "uz profesional: " + (esteProfesional ? "Da" : "Nu") + ", " +
               "viteza variabilă: " + (vitezaVariabila ? "Da" : "Nu") + ".";
    }
    
    // Metoda toString
    public String toString() {
        return super.toString() + ", Dimensiunea discului: " + dimensiuneDisc + " mm, " + 
                "Este profesional: " + (esteProfesional ? "Da" : "Nu") + ", "
                + "Viteza variabila: " + (vitezaVariabila ? "Da" : "Nu");
    }
}
