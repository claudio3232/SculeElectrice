package com.mycompany.proiectpoo;


public class Rotopercutor extends SculeElectrice {
    protected int percutiiPeMinut;
    protected double energieImpact;
    protected int adancimeMaxima;
    protected boolean functieInversare;
    protected String tipMandrina;

    public Rotopercutor() {
        super();
        this.percutiiPeMinut = 0;
        this.energieImpact = 0.0;
        this.adancimeMaxima = 0;
        this.functieInversare = false;
        this.tipMandrina = "Necunoscut";
    }

    public Rotopercutor(String marca, int putere, float greutate, int percutiiPeMinut, double energieImpact, int adancimeMaxima, boolean functieInversare, String tipMandrina) {
        super(marca, putere, greutate);
        this.percutiiPeMinut = percutiiPeMinut;
        this.energieImpact = energieImpact;
        this.adancimeMaxima = adancimeMaxima;
        this.functieInversare = functieInversare;
        this.tipMandrina = tipMandrina;
    }

    public Rotopercutor(Rotopercutor rotopercutor) {
        super(rotopercutor);
        this.percutiiPeMinut = rotopercutor.percutiiPeMinut;
        this.energieImpact = rotopercutor.energieImpact;
        this.adancimeMaxima = rotopercutor.adancimeMaxima;
        this.functieInversare = rotopercutor.functieInversare;
        this.tipMandrina = rotopercutor.tipMandrina;
    }

    public int getPercutiiPeMinut() {
        return percutiiPeMinut;
    }

    public void setPercutiiPeMinut(int percutiiPeMinut) {
        this.percutiiPeMinut = percutiiPeMinut;
    }

    public double getEnergieImpact() {
        return energieImpact;
    }

    public void setEnergieImpact(double energieImpact) {
        this.energieImpact = energieImpact;
    }

    public int getAdancimeMaxima() {
        return adancimeMaxima;
    }

    public void setAdancimeMaxima(int adancimeMaxima) {
        this.adancimeMaxima = adancimeMaxima;
    }

    public boolean isFunctieInversare() {
        return functieInversare;
    }

    public void setFunctieInversare(boolean functieInversare) {
        this.functieInversare = functieInversare;
    }

    public String getTipMandrina() {
        return tipMandrina;
    }

    public void setTipMandrina(String tipMandrina) {
        this.tipMandrina = tipMandrina;
    }

    @Override
    public String toString() {
        return super.toString() + ", PercutiiPeMinut=" + percutiiPeMinut + ", EnergieImpact=" + energieImpact + " J, AdancimeMaxima=" + adancimeMaxima + " mm, FunctieInversare=" + functieInversare + ", TipMandrina=" + tipMandrina;
    }
}