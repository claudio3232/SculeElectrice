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
        // Crearea instantelor pentru clasa Polizor
        Polizor polizor1 = new Polizor();
        Polizor polizor2 = new Polizor("Bosch", 1500, 5.2f, 12000, 2000, 25.0f);
        Polizor polizor3 = new Polizor(polizor2);
        
        // Crearea instantelor pentru clasa Slefuitor
        Slefuitor slefuitor1 = new Slefuitor();
        Slefuitor slefuitor2 = new Slefuitor("Makita", 800, 2.5f, 125.0f, true, true);
        Slefuitor slefuitor3 = new Slefuitor(slefuitor2);
        
        // Crearea unui vector cu cel putin 10 instante din fiecare clasa
        Polizor[] polizoare = new Polizor[10];
        for (int i = 0; i < 10; i++) {
            polizoare[i] = new Polizor("Brand" + (i+1), 1500 + i*200, 5.0f + i*0.4f, 12000 + i*500, 2000 + i*50, 25.0f + i*0.5f);
        }

        Slefuitor[] slefuitoare = new Slefuitor[10];
        for (int i = 0; i < 10; i++) {
            slefuitoare[i] = new Slefuitor("Brand" + (i+1), 500 + i*50, 2.0f, 125.0f + i*2.5f, (i % 2 != 0), (i % 2 == 0));
        }


        // Afisarea instantelor pentru fiecare clasa
        System.out.println("Polizoare:");
        System.out.println(polizor1);
        System.out.println(polizor2);
        System.out.println(polizor3);
        
        for (Polizor polizor : polizoare) {
            System.out.println(polizor);
        }
        
        System.out.println("\nSlefuitoare:");
        System.out.println(slefuitor1);
        System.out.println(slefuitor2);
        System.out.println(slefuitor3);
        
        for (Slefuitor slefuitor : slefuitoare) {
            System.out.println(slefuitor);
        }
    }
}
