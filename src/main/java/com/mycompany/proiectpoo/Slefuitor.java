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

    // Constructor fara argumente
    public Slefuitor() {
        super();
        this.dimensiuneDisc = 0.0f;
    }

    // Constructor cu toate argumentele
    public Slefuitor(String firma, int putere, float greutate, float dimensiuneDisc) {
        super(firma, putere, greutate);
        this.dimensiuneDisc = dimensiuneDisc;
    }

    // Constructor de copiere
    public Slefuitor(Slefuitor slefuitor) {
        super(slefuitor);
        this.dimensiuneDisc = slefuitor.dimensiuneDisc;
    }

    // Metoda toString
    public String toString() {
        return super.toString() + ", Dimensiune disc: " + dimensiuneDisc + " mm";
    }
}
