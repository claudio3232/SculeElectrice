package com.mycompany.proiectpoo;

public class GeneratorElectric extends SculeElectrice 
{
    protected float capacitate; 
    protected int timpFunctionareMax; 
    protected float nivelZgomot; 
    protected String tipCombustibil; 
    protected int numarPrize; 

 
    public GeneratorElectric() 
    {
        super();
        this.capacitate = 0.0f;
        this.timpFunctionareMax = 0;
        this.nivelZgomot = 0.0f;
        this.tipCombustibil = "";
        this.numarPrize = 0;
    }
    
    public GeneratorElectric(String firma, int putere, float greutate, float capacitate, int timpFunctionareMax,float nivelZgomot, String tipCombustibil, int numarPrize) 
    {
        super(firma, putere, greutate);
        this.capacitate = capacitate;
        this.timpFunctionareMax = timpFunctionareMax;
        this.nivelZgomot = nivelZgomot;
        this.tipCombustibil = tipCombustibil;
        this.numarPrize = numarPrize;
    }
    public GeneratorElectric(GeneratorElectric generator) 
    {
        super(generator);
        this.capacitate = generator.capacitate;
        this.timpFunctionareMax = generator.timpFunctionareMax;
        this.nivelZgomot = generator.nivelZgomot;
        this.tipCombustibil = generator.tipCombustibil;
        this.numarPrize = generator.numarPrize;
    }

    
    public float getNivelZgomot() 
    {
        return nivelZgomot;
    }
    public void setNivelZgomot(float nivelZgomot) 
    {
        this.nivelZgomot = nivelZgomot;
    }

    public String getTipCombustibil() 
    {
        return tipCombustibil;
    }
    public void setTipCombustibil(String tipCombustibil) 
    {
        this.tipCombustibil = tipCombustibil;
    }

    public int getNumarPrize() 
    {
        return numarPrize;
    }
    public void setNumarPrize(int numarPrize)
    {
        this.numarPrize = numarPrize;
    }
    
    @Override
    public String toString() {
        return "GeneratorElectric{" +
                "capacitate=" + capacitate +
                ", timpFunctionareMax=" + timpFunctionareMax +
                ", nivelZgomot=" + nivelZgomot +
                ", tipCombustibil='" + tipCombustibil + '\'' +
                ", numarPrize=" + numarPrize +
                ", " + super.toString() +
                '}';
    }
}
