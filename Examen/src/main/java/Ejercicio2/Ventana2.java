/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author alepin
 */
public class Ventana2 extends JFrame {
    
    
    private JPanel panel1 = new JPanel();
    private JButton Mortadelo,Filemon,Carpanta,Rompetechos,PepeGotera,Otilio;
    private JToggleButton Mortadelot,Filemont,Carpantat,Rompetechost,PepeGoterat,Otiliot;
    
    private JPanel panelButt = new JPanel();
    private JPanel panelTogg = new JPanel();
    private JPanel panelChek = new JPanel();
    private JPanel panelRadi = new JPanel();
    
    private JCheckBox MortadeloJC = new JCheckBox();
    private JCheckBox FilemonJC = new JCheckBox();
    private JCheckBox CarpantaJC = new JCheckBox();
    private JCheckBox RompetechosJC = new JCheckBox();
    private JCheckBox PepeGoteraJC = new JCheckBox();
    private JCheckBox OtilioJC = new JCheckBox();
    
    private JRadioButton MortadeloRB = new JRadioButton ("Mortadelo", true);
    private JRadioButton FilemonRB = new JRadioButton ("Filemon", true);
    private JRadioButton CarpantaRB = new JRadioButton ("Carpanta", true);
    private JRadioButton RompetechosRB = new JRadioButton ("Rompetechos", true);
    private JRadioButton PepeGoteraRB = new JRadioButton ("Pepe Gotera", true);
    private JRadioButton OtilioRB = new JRadioButton ("Otilio", true);
    
    //ButtonGroup optiongroup = new ButtonGroup();
    
    
    
    
    
    public Ventana2(){
        
        
        setSize(800,500);
        setTitle("Tutorial de Java,Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        panel1.setLayout(new GridLayout(4,1,10,10));
        
        panelButt.setLayout(new GridLayout(1,6));
        panelTogg.setLayout(new GridLayout(1,6));
        panelChek.setLayout(new GridLayout(1,6));
        panelRadi.setLayout(new GridLayout(1,6));
        
        Mortadelo = new JButton("Mortadelo");
        Filemon = new JButton("Filemon");
        Carpanta = new JButton("Carpanta");
        Rompetechos = new JButton("Rompetechos");
        PepeGotera = new JButton("Pepe Gotera");
        Otilio = new JButton("Otilio");
        
       Mortadelot = new JToggleButton("Mortadelo");
       Filemont = new JToggleButton("Filemon");
       Carpantat = new JToggleButton("Carpanta");
       Rompetechost = new JToggleButton("Rompetechos");
       PepeGoterat = new JToggleButton("Pepe Gotera");
       Otiliot = new JToggleButton("Otilio");
       
       
       MortadeloJC = new JCheckBox("Mortadelo");
       FilemonJC = new JCheckBox("Filemon");
       CarpantaJC = new JCheckBox("Carpanta");
       RompetechosJC = new JCheckBox("Rompetechos");
       PepeGoteraJC = new JCheckBox("Pepe Gotera");
       OtilioJC = new JCheckBox("Otilio");
       
       MortadeloRB = new JRadioButton("Mortadelo");
       FilemonRB = new JRadioButton("Filemon");
       CarpantaRB = new JRadioButton("Carpanta");
       RompetechosRB = new JRadioButton("Rompetechos");
       PepeGoteraRB = new JRadioButton("Pepe Gotera");
       OtilioRB = new JRadioButton("Otilio");
            
       
       
       
        
        
      TitledBorder titulo1;
      titulo1 = BorderFactory.createTitledBorder("JButton");
      panelButt.setBorder(titulo1);
      panelButt.add(Mortadelo);
      panelButt.add(Filemon);
      panelButt.add(Carpanta);
      panelButt.add(Rompetechos);
      panelButt.add(PepeGotera);
      panelButt.add(Otilio);
       
       
       TitledBorder titulo2;
       titulo2 = BorderFactory.createTitledBorder("JToggleButton");
       panelTogg.setBorder(titulo2);
       panelTogg.add(Mortadelot);
       panelTogg.add(Filemont);
       panelTogg.add(Carpantat);
       panelTogg.add(Rompetechost);
       panelTogg.add(PepeGoterat);
       panelTogg.add(Otiliot);
       
       
       
       
       
       
       
       TitledBorder titulo3;
       titulo3 = BorderFactory.createTitledBorder("JCheckBox");
       panelChek.setBorder(titulo3);
       panelChek.add(MortadeloJC);
       panelChek.add(FilemonJC);
       panelChek.add(CarpantaJC);
       panelChek.add(RompetechosJC);
       panelChek.add(PepeGoteraJC);
       panelChek.add(OtilioJC);
       
       
       
       
       TitledBorder titulo4;
       titulo4 = BorderFactory.createTitledBorder("JRadioButton");
       panelRadi.setBorder(titulo4);
       panelRadi.add(MortadeloRB);
       panelRadi.add(FilemonRB);
       panelRadi.add(CarpantaRB);
       panelRadi.add(RompetechosRB);
       panelRadi.add(PepeGoteraRB);
       panelRadi.add(OtilioRB);
       
       
       
        
        
        panel1.add(panelButt);
        panel1.add(panelTogg);
        panel1.add(panelChek);
        panel1.add(panelRadi);
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        add(panel1);
    }
    
    
}
