/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfata extends JFrame {
    private AparatDeSudura[] aparateDeSudura;
    private Compactor[] compactoare;
    private FierastrauPendular[] fierastraiePendulare;
    private GeneratorElectric[] generatoareElectrice;
    private MasinaGaurit[] masiniDeGaurit;
    private Polizor[] polizoare;
    private PolizorUnghiular[] polizoareUnghiulare;
    private Rotopercutor[] rotopercutoare;
    private Slefuitor[] slefuitoare;
    private SurubelnitaElectrica[] surubelniteElectrice;

    public Interfata(
            AparatDeSudura[] aparateDeSudura,
            Compactor[] compactoare,
            FierastrauPendular[] fierastraiePendulare,
            GeneratorElectric[] generatoareElectrice,
            MasinaGaurit[] masiniDeGaurit,
            Polizor[] polizoare,
            PolizorUnghiular[] polizoareUnghiulare,
            Rotopercutor[] rotopercutoare,
            Slefuitor[] slefuitoare,
            SurubelnitaElectrica[] surubelniteElectrice
    ) {
        this.aparateDeSudura = aparateDeSudura;
        this.compactoare = compactoare;
        this.fierastraiePendulare = fierastraiePendulare;
        this.generatoareElectrice = generatoareElectrice;
        this.masiniDeGaurit = masiniDeGaurit;
        this.polizoare = polizoare;
        this.polizoareUnghiulare = polizoareUnghiulare;
        this.rotopercutoare = rotopercutoare;
        this.slefuitoare = slefuitoare;
        this.surubelniteElectrice = surubelniteElectrice;

        initializeUI();
    }

    private void initializeUI() {
        setTitle("Aplicatie Utilaje");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JButton btnAparateDeSudura = new JButton("Aparate de Sudura");
        JButton btnCompactoare = new JButton("Compactoare");
        JButton btnFierastraiePendulare = new JButton("Fierastraie Pendulare");
        JButton btnGeneratoareElectrice = new JButton("Generatoare Electrice");
        JButton btnMasiniDeGaurit = new JButton("Masini de Gaurit");
        JButton btnPolizoare = new JButton("Polizoare");
        JButton btnPolizoareUnghiulare = new JButton("Polizoare Unghiulare");
        JButton btnRotopercutoare = new JButton("Rotopercutoare");
        JButton btnSlefuitoare = new JButton("Slefuitoare");
        JButton btnSurubelniteElectrice = new JButton("Surubelnite Electrice");

        addActionListeners(
            btnAparateDeSudura, btnCompactoare, btnFierastraiePendulare,
            btnGeneratoareElectrice, btnMasiniDeGaurit, btnPolizoare,
            btnPolizoareUnghiulare, btnRotopercutoare, 
            btnSlefuitoare, btnSurubelniteElectrice
        );

        mainPanel.add(btnAparateDeSudura);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnCompactoare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnFierastraiePendulare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnGeneratoareElectrice);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnMasiniDeGaurit);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnPolizoare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnPolizoareUnghiulare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnRotopercutoare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnSlefuitoare);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(btnSurubelniteElectrice);

        mainPanel.setBounds(50, 50, 300, 800);
        add(mainPanel);
        setVisible(true);
    }

    private void addActionListeners(JButton... buttons) {
        buttons[0].addActionListener(e -> openFrame(new AparatDeSuduraFrame(aparateDeSudura)));
        buttons[1].addActionListener(e -> openFrame(new CompactorFrame(compactoare)));
        buttons[2].addActionListener(e -> openFrame(new FierastrauPendularFrame(fierastraiePendulare)));
        buttons[3].addActionListener(e -> openFrame(new GeneratorElectricFrame(generatoareElectrice)));
        buttons[4].addActionListener(e -> openFrame(new MasinaGauritFrame(masiniDeGaurit)));
        buttons[5].addActionListener(e -> openFrame(new PolizorFrame(polizoare)));
        buttons[6].addActionListener(e -> openFrame(new PolizorUnghiularFrame(polizoareUnghiulare)));
        buttons[7].addActionListener(e -> openFrame(new RotopercutorFrame(rotopercutoare)));
        buttons[8].addActionListener(e -> openFrame(new SlefuitorFrame(slefuitoare)));
        buttons[9].addActionListener(e -> openFrame(new SurubelnitaElectricaFrame(surubelniteElectrice)));
    }

    private void openFrame(JFrame frame) {
        dispose();
        frame.setVisible(true);
    }
}
