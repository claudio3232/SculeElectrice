/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author nechi
 */

 public class Test {
    public static void main(String[] args) {
     
        SurubelnitaElectrica surubelnita1 = new SurubelnitaElectrica();
        SurubelnitaElectrica surubelnita2 = new SurubelnitaElectrica("Bosch", 18, 1.5f, 2, 1.5f, 10.0f, "Baterie", true);
        SurubelnitaElectrica surubelnita3 = new SurubelnitaElectrica(surubelnita2);
     
        Polizor polizor1 = new Polizor();
        Polizor polizor2 = new Polizor("Bosch", 1500, 5.0f, 12000, 2000, 25.0f, "Diamantat", "Electric");
        Polizor polizor3 = new Polizor(polizor2);
      
        Slefuitor slefuitor1 = new Slefuitor();
        Slefuitor slefuitor2 = new Slefuitor("Makita", 900, 2.8f, 130.0f, false, true, "Metal", 36);
        Slefuitor slefuitor3 = new Slefuitor(slefuitor2);
        
        AparatDeSudura aparat1 = new AparatDeSudura();
        AparatDeSudura aparat2 = new AparatDeSudura("Lincoln Electric", 2000, 9.5f, "2.5 mm", 10.0f, 3, "Curent alternativ", 90.5f);
        AparatDeSudura aparat3 = new AparatDeSudura(aparat2);
        
        GeneratorElectric generator1 = new GeneratorElectric();
        GeneratorElectric generator2 = new GeneratorElectric("Honda", 3500, 45.0f, 15.0f, 8, 75.0f, "Benzină", 4);
        GeneratorElectric generator3 = new GeneratorElectric(generator2);

        FierastrauPendular fierastrau1 = new FierastrauPendular();
        FierastrauPendular fierastrau2 = new FierastrauPendular("Bosch", 1200, 3.5f, 5000, true, true, 85, "Curba");
        FierastrauPendular fierastrau3 = new FierastrauPendular(fierastrau2);
        
        System.out.println("\nTestare MasinaGaurit:");
        MasinaGaurit masina1 = new MasinaGaurit();
        MasinaGaurit masina2 = new MasinaGaurit("DeWalt", 600, 2.8f, 45000,true, 16, "Automat");
        MasinaGaurit masina3 = new MasinaGaurit(masina2);
        
        System.out.println("\nTestare PolizorUnghiular:");
        PolizorUnghiular polizorU1 = new PolizorUnghiular();
        PolizorUnghiular polizorU2 = new PolizorUnghiular("Makita", 750, 3.2f, "Ergonomic", 125, 11000, true);
        PolizorUnghiular polizorU3 = new PolizorUnghiular(polizorU2);
        
        System.out.println(polizorU1.toString());
        System.out.println(polizorU2.toString());
        System.out.println(polizorU3.toString());
        
        System.out.println(masina1.toString());
        System.out.println(masina2.toString());
        System.out.println(masina3.toString());

        
        System.out.println("Fierastrau 1 (Constructor fara argumente): " + fierastrau1);
        System.out.println("Fierastrau 2 (Constructor cu argumente): " + fierastrau2);
        System.out.println("Fierastrau 3 (Constructor de copiere): " + fierastrau3);

        System.out.println("Surubelnita 1 (fara argumente): " + surubelnita1);
        System.out.println("Surubelnita 2 (cu argumente): " + surubelnita2);
        System.out.println("Surubelnita 3 (copiere): " + surubelnita3);
        
        System.out.println("Aparat de sudura:");
        System.out.println("Aparat 1 (Constructor fara argumente): " + aparat1);
        System.out.println("Aaparat 2 (Constructor cu argumente): " + aparat2);
        System.out.println("Aparat 3 (Constructor de copiere): " + aparat3);
        
        System.out.println("Generator Electric:");
        System.out.println("Generator1 (Constructor fara argumente): " + generator1);
        System.out.println("Generator 2 (Constructor cu argumente): " + generator2);
        System.out.println("Generator 3 (Constructor de copiere): " + generator3);
        
        System.out.println("Polizoare:");
        System.out.println("Polizor 1 (Constructor fara argumente): " + polizor1);
        System.out.println("Polizor 2 (Constructor cu argumente): " + polizor2);
        System.out.println("Polizor 3 (Constructor de copiere): " + polizor3);

        System.out.println("\nSlefuitoare:");
        System.out.println("Slefuitor 1 (Constructor fara argumente): " + slefuitor1);
        System.out.println("Slefuitor 2 (Constructor cu argumente): " + slefuitor2);
        System.out.println("Slefuitor 3 (Constructor de copiere): " + slefuitor3);
    }
}
