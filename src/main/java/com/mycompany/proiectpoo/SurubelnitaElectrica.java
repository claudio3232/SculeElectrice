package com.mycompany.proiectpoo;

/**
 * Clasa SurubelnitaElectrica derivata din SculeElectrice.
 */
class SurubelnitaElectrica extends SculeElectrice {
    protected int nrviteze;
    protected float autonomie;
    protected String tipAlimentare;

    // Constructor fara argumente
    public SurubelnitaElectrica() {
        super();
        this.nrviteze = 0;
        this.autonomie = 0.0f;
        this.tipAlimentare = "";
    }

    // Constructor cu toate argumentele
    public SurubelnitaElectrica(String firma, int putere, float greutate, int nrviteze, float autonomie, String tipAlimentare ) {
        super(firma, putere, greutate);
        this.nrviteze = nrviteze;
        this.autonomie = autonomie;
        this.tipAlimentare = tipAlimentare;
    }

       public SurubelnitaElectrica(SurubelnitaElectrica surubelnita) {
        super(surubelnita);
        this.nrviteze = surubelnita.nrviteze;
        this.autonomie = surubelnita.autonomie;
        this.autonomie = surubelnita.autonomie;
    }
    @Override
public String specificatii() {
    return "Surubelnita electrica de la firma " + firma + ", cu puterea " + putere + "W, greutate " + greutate + " kg.";
}


    // Implementare metoda descriereDetaliata
    public String toString() {
        return super.toString() + ", Numar viteza: " + nrviteze + " trepte, " +
                "cu autonomie de: " + autonomie + " ore, " +
                "si tip de alimentare cu: " + tipAlimentare;
    }
}