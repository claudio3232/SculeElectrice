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
    private boolean arePornireLina;
    float diametrulDiscului;
    private String tipDisc; //(diamantat, metalic)
    private String tipAlimentare; //(electric, pe baterie)
    
    // Constructor fara argumente
    public Polizor() {
        super();
        this.turatiiMaxime = 0;
        this.arePornireLina = false;
        this.diametrulDiscului = 0.0f;
        this.tipDisc = "Necunoscut";
        this.tipAlimentare = "Necunoscut";
    }

    // Constructor cu toate argumentele
public Polizor(String firma, int putere, float greutate, int turatiiMaxime, boolean arePornireLina, float diametrulDiscului, String tipDisc, String tipAlimentare) {
    super(firma, putere, greutate);
    this.turatiiMaxime = turatiiMaxime;
    this.arePornireLina = arePornireLina;
    this.diametrulDiscului = diametrulDiscului;
    this.tipDisc = tipDisc;
    this.tipAlimentare = tipAlimentare;
}

    // Constructor de copiere
    public Polizor(Polizor polizor) {
        super(polizor);
        this.turatiiMaxime = polizor.turatiiMaxime;
        this.arePornireLina = polizor.arePornireLina;
        this.diametrulDiscului = polizor.diametrulDiscului;
        this.tipDisc = polizor.tipDisc;
        this.tipAlimentare = polizor.tipAlimentare;
    }
    
    // Metoda toString
    public String toString() {
        return super.toString() + ", Turatii maxime: " + turatiiMaxime + " RPM, Pornire lina: " 
                + (arePornireLina ? "Da" : "Nu") + ", Diametrul discului: " + diametrulDiscului + " cm, Tip disc: " 
                + tipDisc + ", Tip alimentare: " + tipAlimentare;
    }

    // Getteri si Setteri
    public int getTuratiiMaxime() {
        return turatiiMaxime;
    }

    public void setTuratiiMaxime(int turatiiMaxime) {
        this.turatiiMaxime = turatiiMaxime;
    }

    public boolean isArePornireLina() {
        return arePornireLina;
    }

    public void setArePornireLina(boolean arePornireLina) {
        this.arePornireLina = arePornireLina;
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
