package com.mycompany.proiectpoo;

public class AparatDeSudura extends SculeElectrice 
{
    protected String tipElectrod; //tipul electordului folosit 
    protected float grosimeMaxiMaterial;
  //const. fara argumente
    public AparatDeSudura() 
    {
        super();
        this.tipElectrod = "";
        this.grosimeMaxiMaterial=0.0f;
    }

    //const. cu toti parametrii 
    public AparatDeSudura(String firma, int putere, float greutate, String tipElectrod) 
    {
        super(firma, putere, greutate);
        this.tipElectrod = tipElectrod;
        this.grosimeMaxiMaterial= grosimeMaxiMaterial;
    }

    //const. copiere
    public AparatDeSudura(AparatDeSudura aparat) 
    {
        super(aparat);
        this.tipElectrod = aparat.tipElectrod;
        this.grosimeMaxiMaterial= aparat.grosimeMaxiMaterial;
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
    
     public float getGrosimeMaxiMaterial() 
    {
        return grosimeMaxiMaterial;
    }
     
    public void setGrosimeMaxiMaterial(float grosimeMaxiMaterial) 
    {
        this.grosimeMaxiMaterial = grosimeMaxiMaterial;
    }
    
    //met. toString
    @Override
    public String toString() 
    {
        return "AparatDeSudura{" +
                "tipElectrod='" + tipElectrod + '\'' +
                ", grosimeMaxiMateriale="+ grosimeMaxiMaterial +
                ", " + super.toString() +
                '}';
    }
}
