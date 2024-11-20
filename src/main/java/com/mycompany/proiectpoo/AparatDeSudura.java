package com.mycompany.proiectpoo;

public class AparatDeSudura extends SculeElectrice 
{
    protected String tipElectrod; //tipul electordului folosit 
    
  //const. fara argumente
    public AparatDeSudura() 
    {
        super();
        this.tipElectrod = "Necunoscut";
    }

    //const. cu toti parametrii 
    public AparatDeSudura(String firma, int putere, float greutate, String tipElectrod) 
    {
        super(firma, putere, greutate);
        this.tipElectrod = tipElectrod;
    }

    //const. copiere
    public AparatDeSudura(AparatDeSudura aparat) 
    {
        super(aparat);
        this.tipElectrod = aparat.tipElectrod;
    }

    //setter,getter
    public String getTipElectrod() 
    {
        return tipElectrod;
    }

    public void setTipElectrod(String tipElectrod) 
    {
        this.tipElectrod = tipElectrod;
    }
    
    //met. toString
    @Override
    public String toString() 
    {
        return "AparatDeSudura{" +
                "tipElectrod='" + tipElectrod + '\'' +
                ", " + super.toString() +
                '}';
    }
}
