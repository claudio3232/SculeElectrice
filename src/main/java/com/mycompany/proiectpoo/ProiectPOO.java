/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proiectpoo;
import java.util.Vector;

/**
 *
 * @author nechi
 */

public class ProiectPOO {
    public static void main(String[] args) {
        // Crearea unui vector cu instante Polizor
        Vector<Polizor> polizoare = new Vector<>();

        // Adaugam 10 obiecte Polizor in vector
        polizoare.add(new Polizor("Bosch", 1500, 5.0f, 12000, 2000, 25.0f, "Diamantat", "Electric"));
        polizoare.add(new Polizor("Makita", 1700, 5.4f, 12500, 2050, 25.5f, "Metallic", "Electric"));
        polizoare.add(new Polizor("DeWalt", 1900, 5.8f, 13000, 2100, 26.0f, "Diamantat", "Baterie"));
        polizoare.add(new Polizor("Hilti", 2100, 6.0f, 13500, 2150, 26.5f, "Metallic", "Electric"));
        polizoare.add(new Polizor("Black+Decker", 2200, 6.2f, 14000, 2200, 27.0f, "Diamantat", "Electric"));
        polizoare.add(new Polizor("Ryobi", 2300, 6.4f, 14500, 2250, 27.5f, "Metallic", "Baterie"));
        polizoare.add(new Polizor("Craftsman", 2400, 6.6f, 15000, 2300, 28.0f, "Diamantat", "Electric"));
        polizoare.add(new Polizor("Hitachi", 2500, 6.8f, 15500, 2350, 28.5f, "Metallic", "Electric"));
        polizoare.add(new Polizor("Einhell", 2600, 7.0f, 16000, 2400, 29.0f, "Diamantat", "Baterie"));
        polizoare.add(new Polizor("Skil", 2700, 7.2f, 16500, 2450, 29.5f, "Metallic", "Electric"));

        // Crearea unui vector cu instante Slefuitor
        Vector<Slefuitor> slefuitoare = new Vector<>();

        // Adaugam 10 obiecte Slefuitor in vector
        slefuitoare.add(new Slefuitor("Bosch", 800, 2.5f, 125.0f, true, false, "Lemn", 24));
        slefuitoare.add(new Slefuitor("Makita", 900, 2.8f, 130.0f, false, true, "Metal", 36));
        slefuitoare.add(new Slefuitor("DeWalt", 1000, 3.0f, 135.0f, true, true, "Piatra", 12));
        slefuitoare.add(new Slefuitor("Hilti", 1100, 3.2f, 140.0f, false, false, "Lemn", 18));
        slefuitoare.add(new Slefuitor("Black+Decker", 1200, 3.4f, 145.0f, true, false, "Metal", 24));
        slefuitoare.add(new Slefuitor("Ryobi", 1300, 3.6f, 150.0f, false, true, "Piatra", 36));
        slefuitoare.add(new Slefuitor("Craftsman", 1400, 3.8f, 155.0f, true, true, "Lemn", 12));
        slefuitoare.add(new Slefuitor("Hitachi", 1500, 4.0f, 160.0f, false, true, "Metal", 24));
        slefuitoare.add(new Slefuitor("Einhell", 1600, 4.2f, 165.0f, true, false, "Piatra", 36));
        slefuitoare.add(new Slefuitor("Skil", 1700, 4.4f, 170.0f, true, true, "Lemn", 18));

        // Afisarea instantelor pentru Polizor
        System.out.println("Polizoare:");
        for (Polizor polizor : polizoare) {
            System.out.println(polizor);
        }

        // Afisarea instantelor pentru Slefuitor
        System.out.println("\nSlefuitoare:");
        for (Slefuitor slefuitor : slefuitoare) {
            System.out.println(slefuitor);
        }
    }
}
       
 