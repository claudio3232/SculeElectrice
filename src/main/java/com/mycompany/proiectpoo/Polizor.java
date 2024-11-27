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
    int putereaMotorului; // Puterea motorului in wati
    float diametrulDiscului; // Diametrul discului in centimetri
    
    // Constructor fara argumente
    public Polizor() {
        super();
        this.turatiiMaxime = 0;
        this.putereaMotorului = 0;
        this.diametrulDiscului = 0.0f;
    }

    // Constructor cu toate argumentele
    public Polizor(String firma, int putere, float greutate, int turatiiMaxime, int putereaMotorului, float diametrulDiscului) {
        super(firma, putere, greutate);
        this.turatiiMaxime = turatiiMaxime;
        this.putereaMotorului = putereaMotorului;
        this.diametrulDiscului = diametrulDiscului;
    }

    // Constructor de copiere
    public Polizor(Polizor polizor) {
        super(polizor);
        this.turatiiMaxime = polizor.turatiiMaxime;
        this.putereaMotorului = polizor.putereaMotorului;
        this.diametrulDiscului = polizor.diametrulDiscului;
    }

    // Implementare metoda abstracta
    @Override
    public String specificatii() {
        return "Polizor cu turatii maxime de " + turatiiMaxime + " RPM si diametru disc de " + diametrulDiscului + " cm.";
    }
    
    // Metoda toString
    public String toString() {
        return super.toString() + ", Turatii maxime: " + turatiiMaxime + " RPM, Puterea motorului: " 
                + putereaMotorului + " W, Diametrul discului: " + diametrulDiscului + " cm";
    }
}