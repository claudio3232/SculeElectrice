package com.mycompany.proiectpoo;

public class GeneratorElectric extends SculeElectrice 
{
    protected int capacitate; //capacitate in litrii 

    //const. fara argumente
    public GeneratorElectric() 
    {
        super();
        this.capacitate = 0;
    }

   //const. cu toti parametrii 
    public GeneratorElectric(String firma, int putere, float greutate, int capacitate) 
    {
        super(firma, putere, greutate);
        this.capacitate = capacitate;
    }

    //const. copiere
    public GeneratorElectric(GeneratorElectric generator) 
    {
        super(generator);
        this.capacitate = generator.capacitate;
    }

     //getter, setter
    public int getCapacitate() 
    {
        return capacitate;
    }

    public void setCapacitate(int capacitate) 
    {
        this.capacitate = capacitate;
    }

    //met. toString
    @Override
    public String toString() 
    {
        return "GeneratorElectric{" +
                "capacitate=" + capacitate +
                ", " + super.toString() +
                '}';
    }
}
