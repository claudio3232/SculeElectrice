/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proiectpoo;

/**
 *
 * @author nechi
 */

public class ProiectPOO {
    public static void main(String[] args) {
        // Crearea obiectelor
        Polizor polizor = new Polizor("Hecht", 1700, 8.2f, 2950, 1500, 23.5f);
        Slefuitor slefuitor = new Slefuitor("Makita", 190, 1.6f, 150.0f, true, false);
        FierastrauPendular fierastrau = new FierastrauPendular("Bosch", 650, 2.3f, 3000);
        SurubelnitaElectrica surubelnita = new SurubelnitaElectrica("SKIL", 400, 1.5f, 1500);
        PolizorUnghiular polizorUng = new PolizorUnghiular("Adler", 840, 5.2f, "manerScurt");
        MasinaGaurit masina = new MasinaGaurit("Raider", 900, 1.6f, 20000);
        GeneratorElectric generator = new GeneratorElectric("Honda", 2000, 15.0f, 50);
        AparatDeSudura aparat = new AparatDeSudura("Miller", 1800, 8.5f, "Bazic");
        Rotopercutor rotopercutor = new Rotopercutor("Makita", 800, 4.2f, 3200);
        Compactor compactor = new Compactor("Caterpillar", 1500, 120.0f, 500.0);
        
        // Afisare detalii
        System.out.println(polizor.toString());
        System.out.println(slefuitor.toString());
        System.out.println(fierastrau.toString());
        System.out.println(surubelnita.toString());
        System.out.println(polizorUng.toString());
        System.out.println(masina.toString());
        System.out.println(generator.toString());
        System.out.println(aparat.toString());
        System.out.println(compactor.toString());
        System.out.println(rotopercutor.toString());
    }
}
