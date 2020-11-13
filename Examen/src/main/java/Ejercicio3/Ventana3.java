/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



/**
 *
 * @author alepin
 */
public class Ventana3 extends JFrame{
    
    private JPanel panel = new JPanel();
    
    private JRadioButton Linux = new JRadioButton();
    private JRadioButton Wind = new JRadioButton();
    private JRadioButton Mac = new JRadioButton();
    private ButtonGroup GrupoRadios;
    private Icon imagen1,imagen2,imagen3;
    private JLabel label = new JLabel();
    
    private JButton botonaceptar = new JButton();
    
    
    
    public Ventana3(){
        
        setSize(800,500);
        setTitle("Swing JRadioButton Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel.setLayout(new FlowLayout());
        
        Linux = new JRadioButton("Linux",true);
        Wind = new JRadioButton("Windiows");
        Mac = new JRadioButton("Macintosh");
        
        panel.add(Linux);
        panel.add(Wind);
        panel.add(Mac);
        
        
        GrupoRadios = new ButtonGroup();
        GrupoRadios.add(Linux);
        GrupoRadios.add(Wind);
        GrupoRadios.add(Mac);
        
        ListenerCheckBox manejador = new ListenerCheckBox();
        Linux.addItemListener(manejador);
        Wind.addItemListener(manejador);
        Mac.addItemListener(manejador);
        
        
        
        //no me abre la imagen...
        
        //imagen1 = new ImageIcon(getClass().getResource("/ImagenesRBs/Bird.gif"));
        //imagen2 = new ImageIcon(getClass().getResource("/ImagenesRBs/Cat.gif"));
        //imagen3 = new ImageIcon(getClass().getResource("/ImagenesRBs/Dog.gif"));
        
        
        
        label = new JLabel();
        
        label.setIcon(imagen1);
        
        
        
        panel.add(label);
        
        botonaceptar = new JButton("Aceptar");
        
       
        add(botonaceptar);
        
        add(panel);
    }
    
    
    private class ListenerCheckBox implements ItemListener{
        
        
        
        
        
        
    
    public void itemStateChanged( ItemEvent evento )
    {
        
        
        if(evento.getSource()==Linux){
        label.setIcon(imagen1);
        }
        if(evento.getSource()==Wind){
            label.setIcon(imagen2);
        }
        if(evento.getSource()==Mac){
            label.setIcon(imagen3);
        }
    }
        
        
        
        
        
        
        }
    
    
}
