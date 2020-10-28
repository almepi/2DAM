/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desplegableanimales;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author alepin
 */
public class VentanaAnimales extends JFrame {
    
    private JComboBox combo;
    private JLabel label;
    private JPanel panel;
    private String[] Nombres = {"Bird" , "Cat", "Dog", "Pig", "Rabbit"};
    
    private Icon imagen;
    
    public VentanaAnimales(){
        setSize(500,300);
        setTitle("ComboImagenes");
        panel=new JPanel();
        panel.setLayout(new BorderLayout());
        
        
        add (panel);
        combo = new JComboBox(Nombres);
        panel.add(combo,BorderLayout.NORTH);
        
        imagen = new ImageIcon(getClass().getResource("/images/Rabbit.gif"));
        
        
        
        label = new JLabel();
        label.setText("Bird");
        label.setIcon(imagen);
        
        panel.add(label);
        combo.addItemListener(new ListenerDelCombo());
        
        
        
        
        
        
        
        
    }
    
    
    private class ListenerDelCombo implements ItemListener{
        public void itemStateChanged (ItemEvent e){
            int indice = combo.getSelectedIndex();
            String s = Nombres[indice];
            imagen = new ImageIcon(getClass().getResource("/images/"+s+".gif"));
            label.setIcon(imagen);
            label.setText(s);
            
        }
    }
    
    
    
}
