    package com.mycompany.proiectpoo;

public class AparatDeSudura extends SculeElectrice 
{
    protected String tipElectrod; 
    protected float grosimeMaxiMaterial; 
    protected int garantieAni; 
    protected String tipCurent; 
    protected float eficientaEnergetica; 

    public AparatDeSudura() 
    {
        super();
        this.tipElectrod = "";
        this.grosimeMaxiMaterial = 0.0f;
        this.garantieAni = 0;
        this.tipCurent = "";
        this.eficientaEnergetica = 0.0f;
    }
    
    public AparatDeSudura(String firma, int putere, float greutate, String tipElectrod, float grosimeMaxiMaterial,int garantieAni, String tipCurent, float eficientaEnergetica) {
        super(firma, putere, greutate);
        this.tipElectrod = tipElectrod;
        this.grosimeMaxiMaterial = grosimeMaxiMaterial;
        this.garantieAni = garantieAni;
        this.tipCurent = tipCurent;
        this.eficientaEnergetica = eficientaEnergetica;
    }


    public AparatDeSudura(AparatDeSudura aparat) 
    {
        super(aparat);
        this.tipElectrod = aparat.tipElectrod;
        this.grosimeMaxiMaterial = aparat.grosimeMaxiMaterial;
        this.garantieAni = aparat.garantieAni;
        this.tipCurent = aparat.tipCurent;
        this.eficientaEnergetica = aparat.eficientaEnergetica;
    }

 
    public int getGarantieAni() 
    {
        return garantieAni;
    }
    public void setGarantieAni(int garantieAni) 
    {
        this.garantieAni = garantieAni;
    }
    
    public String getTipCurent()
    {
        return tipCurent;
    }
    public void setTipCurent(String tipCurent) 
    {
        this.tipCurent = tipCurent;
    }

    public float getEficientaEnergetica() 
    {
        return eficientaEnergetica;
    }
    public void setEficientaEnergetica(float eficientaEnergetica) 
    {
        this.eficientaEnergetica = eficientaEnergetica;
    }

    @Override
    public String toString() {
        return "AparatDeSudura{" +
                "tipElectrod='" + tipElectrod + '\'' +
                ", grosimeMaxiMaterial=" + grosimeMaxiMaterial +
                ", garantieAni=" + garantieAni +
                ", tipCurent='" + tipCurent + '\'' +
                ", eficientaEnergetica=" + eficientaEnergetica +
                ", " + super.toString() +
                '}';
    }
}
