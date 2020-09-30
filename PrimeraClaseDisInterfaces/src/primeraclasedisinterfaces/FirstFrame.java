/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraclasedisinterfaces;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author alepin
 */
class First extends JFrame {
    public First(){
     setTitle("Hello!!!");
     setSize(300,200);
     
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     JPanel panel = new JPanel();
     add(panel);
     panel.setBackground(Color.red);
     
     JButton boton = new JButton();
     Dimension d = new Dimension ();
     d.height = 40;
     d.width = 100;
     
     boton.setPreferredSize(d);
     
     panel.add(boton);
    }
    
    
}
