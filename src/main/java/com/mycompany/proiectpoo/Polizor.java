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
    private String tipDisc; // Tipul discului (ex. diamantat, metalic)
    private String tipAlimentare; // Tipul de alimentare (electric, pe baterie)
    
    // Constructor fara argumente
    public Polizor() {
        super();
        this.turatiiMaxime = 0;
        this.putereaMotorului = 0;
        this.diametrulDiscului = 0.0f;
        this.tipDisc = "Necunoscut";
        this.tipAlimentare = "Necunoscut";
    }

    // Constructor cu toate argumentele
    public Polizor(String firma, int putere, float greutate, int turatiiMaxime, int putereaMotorului, float diametrulDiscului, String tipDisc, String tipAlimentare) {
        super(firma, putere, greutate);
        this.turatiiMaxime = turatiiMaxime;
        this.putereaMotorului = putereaMotorului;
        this.diametrulDiscului = diametrulDiscului;
        this.tipDisc = tipDisc;
        this.tipAlimentare = tipAlimentare;
    }

    // Constructor de copiere
    public Polizor(Polizor polizor) {
        super(polizor);
        this.turatiiMaxime = polizor.turatiiMaxime;
        this.putereaMotorului = polizor.putereaMotorului;
        this.diametrulDiscului = polizor.diametrulDiscului;
        this.tipDisc = polizor.tipDisc;
        this.tipAlimentare = polizor.tipAlimentare;
    }
    
    // Metoda toString
    public String toString() {
        return super.toString() + ", Turatii maxime: " + turatiiMaxime + " RPM, Puterea motorului: " 
                + putereaMotorului + " W, Diametrul discului: " + diametrulDiscului + " cm, Tip disc: " 
                + tipDisc + ", Tip alimentare: " + tipAlimentare;
    }

    // Getteri si Setteri
    public int getTuratiiMaxime() {
        return turatiiMaxime;
    }

    public void setTuratiiMaxime(int turatiiMaxime) {
        this.turatiiMaxime = turatiiMaxime;
    }

    public int getPutereaMotorului() {
        return putereaMotorului;
    }

    public void setPutereaMotorului(int putereaMotorului) {
        this.putereaMotorului = putereaMotorului;
    }

    public float getDiametrulDiscului() {
        return diametrulDiscului;
    }

    public void setDiametrulDiscului(float diametrulDiscului) {
        this.diametrulDiscului = diametrulDiscului;
    }

    public String getTipDisc() {
        return tipDisc;
    }

    public void setTipDisc(String tipDisc) {
        this.tipDisc = tipDisc;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }

    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }
}
