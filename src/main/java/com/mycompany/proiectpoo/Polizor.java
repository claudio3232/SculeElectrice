/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author nechi
 */
class Polizor extends SculeElectrice {
    private int turatiiMaxime; // (RPM)

    // Constructor fara argumente
    public Polizor() {
        super();
        this.turatiiMaxime = 0;
    }

    // Constructor cu toate argumentele
    public Polizor(String firma, int putere, float greutate, int turatiiMaxime) {
        super(firma, putere, greutate);
        this.turatiiMaxime = turatiiMaxime;
    }

    // Constructor de copiere
    public Polizor(Polizor polizor) {
        super(polizor);
        this.turatiiMaxime = polizor.turatiiMaxime;
    }

    // Metoda toString
    public String toString() {
        return super.toString() + ", Turatii maxime: " + turatiiMaxime + " RPM";
    }
}