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
        
        Polizor polizor1 = new Polizor();
        Polizor polizor2 = new Polizor("Bosch", 1500, 5.0f, 12000, 2000, 25.0f, "Diamantat", "Electric");
        Polizor polizor3 = new Polizor(polizor2);
      
        Slefuitor slefuitor1 = new Slefuitor();
        Slefuitor slefuitor2 = new Slefuitor("Makita", 900, 2.8f, 130.0f, false, true, "Metal", 36);
        Slefuitor slefuitor3 = new Slefuitor(slefuitor2);

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
