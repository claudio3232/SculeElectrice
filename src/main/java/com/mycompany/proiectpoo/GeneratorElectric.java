package com.mycompany.proiectpoo;

public class GeneratorElectric extends SculeElectrice 
{
    protected float capacitate; //capacitate in litrii 
    protected int timpFunctionareMax;
    
    //const. fara argumente
    public GeneratorElectric() 
    {
        super();
        this.capacitate = 0.0f;
        this.timpFunctionareMax=0;
    }

   //const. cu toti parametrii 
    public GeneratorElectric(String firma, int putere, float greutate, int capacitate) 
    {
        super(firma, putere, greutate);
        this.capacitate = capacitate;
        this.timpFunctionareMax=timpFunctionareMax;
    }

    //const. copiere
    public GeneratorElectric(GeneratorElectric generator) 
    {
        super(generator);
        this.capacitate = generator.capacitate;
    }

     //getter, setter
    public float getCapacitate() 
    {
        return capacitate;
    }

    public void setCapacitate(float capacitate) 
    {
        this.capacitate = capacitate;
    }
    
    public int getTimpFunctionareMax() 
    {
        return timpFunctionareMax ;
    }
    
    public void setTimpFunctionareMax(int timpFunctionareMax)
    {
        this.timpFunctionareMax=timpFunctionareMax;
    }
    
    //met. toString
    @Override
    public String toString() 
    {
        return "GeneratorElectric{" +
                "capacitate=" + capacitate +
                 ", timpMaximFunctionare=" + timpFunctionareMax+
                ", " + super.toString() +
                '}';
    }
}
