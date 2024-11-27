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
        

        Vector<Polizor> polizoare = new Vector<>();

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

        
        Vector<Slefuitor> slefuitoare = new Vector<>();

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
        
        
        Vector<PolizorUnghiular> polizoareU = new Vector<>();
        
        polizoareU.add(new PolizorUnghiular("Bosch", 1500, 5.0f, "Ergonomic", 125, 12000, true));
        polizoareU.add(new PolizorUnghiular("Makita", 1700, 5.4f, "Fix", 130, 12500, false));
        polizoareU.add(new PolizorUnghiular("DeWalt", 1900, 5.8f, "Pivotant", 135, 13000, true));
        polizoareU.add(new PolizorUnghiular("Hilti", 2100, 6.0f, "Ergonomic", 140, 13500, false));
        polizoareU.add(new PolizorUnghiular("Black+Decker", 2200, 6.2f, "Fix", 145, 14000, true));
        polizoareU.add(new PolizorUnghiular("Ryobi", 2300, 6.4f, "Pivotant", 150, 14500, false));
        polizoareU.add(new PolizorUnghiular("Craftsman", 2400, 6.6f, "Ergonomic", 155, 15000, true));
        polizoareU.add(new PolizorUnghiular("Hitachi", 2500, 6.8f, "Fix", 160, 15500, false));
        polizoareU.add(new PolizorUnghiular("Einhell", 2600, 7.0f, "Pivotant", 165, 16000, true));
        polizoareU.add(new PolizorUnghiular("Skil", 2700, 7.2f, "Ergonomic", 170, 16500, false));
        
        
        Vector<AparatDeSudura> aparateSudura = new Vector<>();
        
        aparateSudura.add(new AparatDeSudura("Makita", 2000, 5.5f, "Electrod de inox", 6.0f, 3, "Curent continuu", 85.5f));
        aparateSudura.add(new AparatDeSudura("Bosch", 2500, 6.0f, "Electrod bazic", 5.0f, 4, "Curent alternativ", 80.0f));
        aparateSudura.add(new AparatDeSudura("DeWalt", 1800, 4.8f, "Electrod rutilic", 4.5f, 2, "Curent continuu", 90.0f));
        aparateSudura.add(new AparatDeSudura("Einhell", 2200, 6.5f, "Electrod acid", 5.5f, 3, "Curent alternativ", 88.0f));
        aparateSudura.add(new AparatDeSudura("Hitachi", 2100, 5.0f, "Electrod de inox", 5.0f, 4, "Curent continuu", 82.5f));
        aparateSudura.add(new AparatDeSudura("Makita", 2300, 5.3f, "Electrod rutilic", 6.0f, 5, "Curent alternativ", 83.0f));
        aparateSudura.add(new AparatDeSudura("Hilti", 2400, 6.2f, "Electrod bazic", 7.0f, 2, "Curent continuu", 86.0f));
        aparateSudura.add(new AparatDeSudura("Black & Decker", 2000, 5.0f, "Electrod acid", 4.0f, 3, "Curent alternativ", 81.0f));
        aparateSudura.add(new AparatDeSudura("Bosch", 2600, 6.8f, "Electrod de inox", 6.5f, 6, "Curent continuu", 89.5f));
        aparateSudura.add(new AparatDeSudura("Makita", 2200, 5.2f, "Electrod rutilic", 5.0f, 4, "Curent alternativ", 84.0f));
        
        
         Vector<GeneratorElectric> generatoareElectrice = new Vector<>();
         
        generatoareElectrice.add(new GeneratorElectric("Honda", 5000, 30.0f, 7.5f, 10, 65.0f, "Benzina", 4));
        generatoareElectrice.add(new GeneratorElectric("Yamaha", 4000, 25.0f, 6.0f, 8, 60.0f, "Motorina", 3));
        generatoareElectrice.add(new GeneratorElectric("Generac", 5500, 32.0f, 8.0f, 12, 70.0f, "Benzina", 5));
        generatoareElectrice.add(new GeneratorElectric("Kipor", 3000, 22.5f, 5.0f, 6, 55.0f, "Motorina", 2));
        generatoareElectrice.add(new GeneratorElectric("Briggs & Stratton", 4500, 28.0f, 6.5f, 9, 68.0f, "Benzina", 4));
        generatoareElectrice.add(new GeneratorElectric("Loncin", 3800, 27.0f, 5.5f, 7, 64.0f, "Motorina", 3));
        generatoareElectrice.add(new GeneratorElectric("Powerhorse", 6000, 35.0f, 8.5f, 15, 75.0f, "Benzina", 6));
        generatoareElectrice.add(new GeneratorElectric("Honda", 7000, 40.0f, 9.0f, 18, 80.0f, "Benzina", 5));
        generatoareElectrice.add(new GeneratorElectric("Parker", 3500, 23.0f, 5.5f, 6, 62.0f, "Motorina", 3));
        generatoareElectrice.add(new GeneratorElectric("Vanguard", 6500, 37.0f, 8.0f, 13, 72.0f, "Benzina", 4));

        
        Vector<FierastrauPendular> fierastraiePendulare = new Vector<>();

        fierastraiePendulare.add(new FierastrauPendular("Bosch", 700, 2.5f, 3000, true, true, 80, "Curbă"));
        fierastraiePendulare.add(new FierastrauPendular("Makita", 650, 2.2f, 2800, true, false, 75, "Dreaptă"));
        fierastraiePendulare.add(new FierastrauPendular("DeWalt", 750, 2.8f, 3200, true, true, 85, "Mix"));
        fierastraiePendulare.add(new FierastrauPendular("Black & Decker", 600, 2.1f, 2500, false, false, 70, "Curbă"));
        fierastraiePendulare.add(new FierastrauPendular("Ryobi", 680, 2.3f, 2900, true, false, 78, "Dreaptă"));
        fierastraiePendulare.add(new FierastrauPendular("Hitachi", 720, 2.4f, 3100, true, true, 82, "Mix"));
        fierastraiePendulare.add(new FierastrauPendular("Einhell", 500, 2.0f, 2400, false, false, 65, "Curbă"));
        fierastraiePendulare.add(new FierastrauPendular("Festool", 800, 3.0f, 3300, true, true, 88, "Mix"));
        fierastraiePendulare.add(new FierastrauPendular("Metabo", 700, 2.5f, 3000, true, false, 80, "Dreaptă"));
        fierastraiePendulare.add(new FierastrauPendular("Stanley", 600, 2.2f, 2600, false, false, 72, "Curbă"));
        
        
        Vector<SurubelnitaElectrica> surubelnite = new Vector<>();
        
        surubelnite.add(new SurubelnitaElectrica("Bosch", 18, 1.5f, 2, 1.5f, 10.0f, "Baterie", true));
        surubelnite.add(new SurubelnitaElectrica("Makita", 20, 1.6f, 3, 2.0f, 12.0f, "Baterie", false));
        surubelnite.add(new SurubelnitaElectrica("DeWalt", 22, 1.7f, 2, 1.7f, 8.0f, "Cablu", true));
        surubelnite.add(new SurubelnitaElectrica("Einhell", 15, 1.4f, 1, 1.0f, 6.0f, "Baterie", true));
        surubelnite.add(new SurubelnitaElectrica("Black & Decker", 18, 1.8f, 2, 1.8f, 11.0f, "Cablu", false));
        surubelnite.add(new SurubelnitaElectrica("Hitachi", 20, 2.0f, 3, 2.5f, 15.0f, "Baterie", true));
        surubelnite.add(new SurubelnitaElectrica("Ryobi", 25, 1.9f, 2, 1.6f, 9.0f, "Cablu", false));
        surubelnite.add(new SurubelnitaElectrica("Craftsman", 22, 1.7f, 1, 1.4f, 7.0f, "Baterie", true));
        surubelnite.add(new SurubelnitaElectrica("Skil", 19, 1.6f, 3, 2.0f, 13.0f, "Cablu", true));
        surubelnite.add(new SurubelnitaElectrica("Milwaukee", 30, 2.2f, 2, 2.0f, 14.0f, "Baterie", false));
        
        
        Vector<Rotopercutor> vectorRotopercutoare = new Vector<>();
        
        vectorRotopercutoare.add(new Rotopercutor("Bosch", 800, 3.5f, 3500, 2.5, 50, true, "SDS"));
        vectorRotopercutoare.add(new Rotopercutor("Makita", 900, 4.0f, 3600, 3.0, 60, false, "Hex"));
        vectorRotopercutoare.add(new Rotopercutor("DeWalt", 850, 3.8f, 3400, 2.8, 55, true, "SDS Max"));
        vectorRotopercutoare.add(new Rotopercutor("Hilti", 950, 4.2f, 3700, 3.5, 65, false, "QuickLock"));
        vectorRotopercutoare.add(new Rotopercutor("AEG", 780, 3.3f, 3300, 2.3, 45, true, "Universal"));
        vectorRotopercutoare.add(new Rotopercutor("Metabo", 820, 3.6f, 3500, 2.7, 52, false, "SDS Plus"));
        vectorRotopercutoare.add(new Rotopercutor("Ryobi", 870, 4.1f, 3650, 3.1, 58, true, "TwistLock"));
        vectorRotopercutoare.add(new Rotopercutor("Festool", 880, 4.3f, 3750, 3.6, 68, false, "ClampLock"));
        vectorRotopercutoare.add(new Rotopercutor("Einhell", 740, 3.1f, 3200, 2.0, 42, true, "ThreadLock"));
        vectorRotopercutoare.add(new Rotopercutor("Black+Decker", 770, 3.2f, 3250, 2.2, 44, false, "Standard"));
        
        
        Vector<Compactor> vectorCompactoare = new Vector<>();
        
        vectorCompactoare.add(new Compactor("Caterpillar", 1200, 100.0f, 600.0, 15, 2.0, true, "Diesel"));
        vectorCompactoare.add(new Compactor("Dynapac", 1250, 105.0f, 650.0, 16, 2.2, false, "Electric"));
        vectorCompactoare.add(new Compactor("Bomag", 1300, 110.0f, 700.0, 18, 2.5, true, "Hydraulic"));
        vectorCompactoare.add(new Compactor("Hamm", 1350, 115.0f, 750.0, 20, 2.8, false, "Pneumatic"));
        vectorCompactoare.add(new Compactor("Volvo", 1400, 120.0f, 800.0, 22, 3.0, true, "Gasoline"));
        vectorCompactoare.add(new Compactor("Wacker Neuson", 1450, 125.0f, 850.0, 24, 3.2, false, "Propane"));
        vectorCompactoare.add(new Compactor("JCB", 1500, 130.0f, 900.0, 26, 3.5, true, "Diesel"));
        vectorCompactoare.add(new Compactor("Case", 1550, 135.0f, 950.0, 28, 3.8, false, "Electric"));
        vectorCompactoare.add(new Compactor("Hitachi", 1600, 140.0f, 1000.0, 30, 4.0, true, "Hydraulic"));
        vectorCompactoare.add(new Compactor("Komatsu", 1650, 145.0f, 1050.0, 32, 4.2, false, "Pneumatic"));


        System.out.println("Polizoare:");
        for (Polizor polizor : polizoare) {
            System.out.println(polizor);
        }

        System.out.println("\nSlefuitoare:");
        for (Slefuitor slefuitor : slefuitoare) {
            System.out.println(slefuitor);
        }
        
        System.out.println("\nPolizoare Unghiulare:");
        for (PolizorUnghiular objpolizor : polizoareU) {
            System.out.println(objpolizor);
        }
   
        System.out.println("\nAparat de sudura:");
        for (AparatDeSudura aparat : aparateSudura) 
            {
            System.out.println(aparat);
            }
        
        System.out.println("\nGenerator electric:");
         for (GeneratorElectric generator : generatoareElectrice) 
            {
            System.out.println(generator);
            }   
         
               
        System.out.println("\nFierastraie pendulare:");
        for (FierastrauPendular fierastrau : fierastraiePendulare) {
            System.out.println(fierastrau);
        }

        
        System.out.println("\nSurubelnite Electrice:");
        for (SurubelnitaElectrica surubelnita : surubelnite) {
            System.out.println(surubelnita);
        }

        System.out.println("\nVector Rotopercutoare:");
        for (Rotopercutor roto : vectorRotopercutoare) {
            System.out.println(roto);
        }
        
        System.out.println("\nVector Compactoare:");
        for (Compactor comp : vectorCompactoare) {
            System.out.println(comp);
        }
    }
}
       
 
