package com.mycompany.proiectpoo;


public class Compactor extends SculeElectrice {
    protected double fortaCompactare;
    protected int capacitateRezervor;
    protected double latimeCompactare;
    protected boolean motorizat;
    protected String tipMotor;

    public Compactor() {
        super();
        this.fortaCompactare = 0.0;
        this.capacitateRezervor = 0;
        this.latimeCompactare = 0.0;
        this.motorizat = false;
        this.tipMotor = "Necunoscut";
    }

    public Compactor(String marca, int putere, float greutate, double fortaCompactare, int capacitateRezervor, double latimeCompactare, boolean motorizat, String tipMotor) {
        super(marca, putere, greutate);
        this.fortaCompactare = fortaCompactare;
        this.capacitateRezervor = capacitateRezervor;
        this.latimeCompactare = latimeCompactare;
        this.motorizat = motorizat;
        this.tipMotor = tipMotor;
    }

    public Compactor(Compactor compactor) {
        super(compactor);
        this.fortaCompactare = compactor.fortaCompactare;
        this.capacitateRezervor = compactor.capacitateRezervor;
        this.latimeCompactare = compactor.latimeCompactare;
        this.motorizat = compactor.motorizat;
        this.tipMotor = compactor.tipMotor;
    }

    public double getFortaCompactare() {
        return fortaCompactare;
    }

    public void setFortaCompactare(double fortaCompactare) {
        this.fortaCompactare = fortaCompactare;
    }

    public int getCapacitateRezervor() {
        return capacitateRezervor;
    }

    public void setCapacitateRezervor(int capacitateRezervor) {
        this.capacitateRezervor = capacitateRezervor;
    }

    public double getLatimeCompactare() {
        return latimeCompactare;
    }

    public void setLatimeCompactare(double latimeCompactare) {
        this.latimeCompactare = latimeCompactare;
    }

    public boolean isMotorizat() {
        return motorizat;
    }

    public void setMotorizat(boolean motorizat) {
        this.motorizat = motorizat;
    }

    public String getTipMotor() {
        return tipMotor;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    @Override
    public String toString() {
        return super.toString() + ", FortaCompactare=" + fortaCompactare + " kgf, CapacitateRezervor=" + capacitateRezervor + " L, LatimeCompactare=" + latimeCompactare + " m, Motorizat=" + motorizat + ", TipMotor=" + tipMotor;
    }
}