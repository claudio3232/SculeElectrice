package com.mycompany.proiectpoo;

/**
 * Clasa SurubelnitaElectrica derivata din SculeElectrice.
 */
public class SurubelnitaElectrica extends SculeElectrice {
    protected int nrviteze;          // Număr de viteze
    protected float timpIncarcare;  // Timp de încărcare (ore)
    protected float autonomie;      // Autonomie (ore)
    protected String tipAlimentare; // Tip alimentare (ex.: Baterie, Cablu)
    protected boolean luminaLed;    // Are lumină LED?

    // Constructor fara argumente
    public SurubelnitaElectrica() {
        super();
        this.nrviteze = 0;
        this.timpIncarcare = 0.0f;
        this.autonomie = 0.0f;
        this.tipAlimentare = "";
        this.luminaLed = false;
    }

    // Constructor cu toate argumentele
    public SurubelnitaElectrica(String firma, int putere, float greutate, int nrviteze, 
                                float timpIncarcare, float autonomie, String tipAlimentare, boolean luminaLed) {
        super(firma, putere, greutate);
        this.nrviteze = nrviteze;
        this.timpIncarcare = timpIncarcare;
        this.autonomie = autonomie;
        this.tipAlimentare = tipAlimentare;
        this.luminaLed = luminaLed;
    }

    // Constructor de copiere
    public SurubelnitaElectrica(SurubelnitaElectrica surubelnita) {
        super(surubelnita);
        this.nrviteze = surubelnita.nrviteze;
        this.timpIncarcare = surubelnita.timpIncarcare;
        this.autonomie = surubelnita.autonomie;
        this.tipAlimentare = surubelnita.tipAlimentare;
        this.luminaLed = surubelnita.luminaLed;
    }

    // Getteri si setteri
    public int getNrviteze() {
        return nrviteze;
    }
    public void setNrviteze(int nrviteze) {
        this.nrviteze = nrviteze;
    }

    public float getTimpIncarcare() {
        return timpIncarcare;
    }
    public void setTimpIncarcare(float timpIncarcare) {
        this.timpIncarcare = timpIncarcare;
    }

    public float getAutonomie() {
        return autonomie;
    }
    public void setAutonomie(float autonomie) {
        this.autonomie = autonomie;
    }

    public String getTipAlimentare() {
        return tipAlimentare;
    }
    public void setTipAlimentare(String tipAlimentare) {
        this.tipAlimentare = tipAlimentare;
    }

    public boolean isLuminaLed() {
        return luminaLed;
    }
    public void setLuminaLed(boolean luminaLed) {
        this.luminaLed = luminaLed;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + ", Numar viteze: " + nrviteze + ", Timp incarcare: " + timpIncarcare + 
               " ore, Autonomie: " + autonomie + " ore, Tip alimentare: " + tipAlimentare + 
               ", Lumina LED: " + (luminaLed ? "Da" : "Nu");
    }
}