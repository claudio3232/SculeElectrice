/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author nechi
 */
class SculeElectrice {
    protected String firma;
    protected int putere;  // in wati
    protected float greutate; // in kilograme

    // Constructor fara argumente
    public SculeElectrice() {
        this.firma = "Necunoscut";
        this.putere = 0;
        this.greutate = 0.0f;
    }

    // Constructor cu toate argumentele
    public SculeElectrice(String firma, int putere, float greutate) {
        this.firma = firma;
        this.putere = putere;
        this.greutate = greutate;
    }

    // Constructor de copiere
    public SculeElectrice(SculeElectrice scula) {
        this.firma = scula.firma;
        this.putere = scula.putere;
        this.greutate = scula.greutate;
    }

    // Metoda toString
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [Firma: " + firma + ", Putere: " + putere + "W, Greutate: " + greutate + " kg]";
    }
}