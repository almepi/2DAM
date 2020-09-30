/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPropuesto;

/**
 *
 * @author alepin
 */

import interfaces.FrameCheckBox;
import java.awt.Component;
import java.awt.FlowLayout;
 import java.awt.Font;
 import java.awt.event.ItemListener;
 import java.awt.event.ItemEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JCheckBox;
 import javax.swing.ButtonGroup;
import javax.swing.JPanel;
 import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame{
        
    private JCheckBox Hijos;
    private JCheckBox Hijas;
    private JCheckBox Ninguno;
    private JRadioButton Hombre;
    private JRadioButton Mujer;
    private JTextField TextoFinal;
    private ButtonGroup GrupoBotones;
    private String texto ="";
    
    
    public Ventana() {
        
        setTitle( "PropuestaEjercicio" );
        setSize(500,500);
        setLayout( new FlowLayout() );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     
        
        Hijos = new JCheckBox("Hijos");
        Hijas = new JCheckBox("Hijas");
        Ninguno = new JCheckBox("Ninguno");
        
        Hombre = new JRadioButton("Hombre", false);
        Mujer = new JRadioButton ("Mujer",false);
        
        TextoFinal = new JTextField("Hola",30);
        
        
        
        
        add(Hijos);
        add(Hijas);
        add(Ninguno);
        add(Hombre);
        add(Mujer);
        add(TextoFinal);
        
        
        
        GrupoBotones = new ButtonGroup();
        GrupoBotones.add(Hombre);
        GrupoBotones.add(Mujer);

        ListenerCheckBox manejador = new ListenerCheckBox();
        Hijos.addItemListener(manejador);
        Hijas.addItemListener(manejador);
        Ninguno.addItemListener(manejador);
        Hombre.addItemListener(manejador);
        Mujer.addItemListener(manejador);
        
    }
    
    
    
    
    private class ListenerCheckBox implements ItemListener{
        
        
        
        
        
        
    
    public void itemStateChanged( ItemEvent evento )
    {
        //texto final
        
        if(evento.getSource()==Hijos){
        texto=Hijos.isSelected() ? "Tengo hijos" : "";
        
        TextoFinal.setText(texto);
        }
        
        
        if(evento.getSource()==Hijas){
            texto=Hijas.isSelected() ? "Tengo hijas" : "";
            
            TextoFinal.setText(texto);
            
        }
            
        
       
        
        /* if(evento.getSource()==Hijos && evento.getSource()==Hijas){
            texto="Tengo hijos e hijas ";
            TextoFinal.setText(texto);
        }
        */
        
        
        if(evento.getSource()==Ninguno){
            texto=Ninguno.isSelected() ? "No tengo hijos ni hijas" : "";
            TextoFinal.setText(texto);
        }
            
        if(evento.getSource()==Hombre){
            
            TextoFinal.setText(texto+" y soy hombre");
        }
        if(evento.getSource()==Mujer){
            TextoFinal.setText(texto+" y soy mujer");
        }
        
        
        
        
        }
    }
}

    
    
    

