/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alepin
 */
public class VentanaJOP extends JFrame {
    
    private JPanel panel = new JPanel();
    private JButton info = new JButton("Info");
    private JButton advertencia = new JButton("Advertencia");
    private JButton error = new JButton("Error");
    private JButton confirmacion = new JButton("Confirmacion");
    private JButton texto = new JButton("Texto");
    private JButton combo = new JButton("Combo");
    private JButton mas = new JButton("Más");
    
    public VentanaJOP(){
        
        setSize(500,100);
        setTitle("Montones de JOptionPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        buttonsListener bl = new buttonsListener();
        
        
        panel.add(info);
        panel.add(advertencia);
        panel.add(error);
        panel.add(confirmacion);
        panel.add(texto);
        panel.add(combo);
        panel.add(mas);
        
        
        info.addActionListener(bl);
        advertencia.addActionListener(bl);
        error.addActionListener(bl);
        confirmacion.addActionListener(bl);
        texto.addActionListener(bl);
        combo.addActionListener(bl);
        mas.addActionListener(bl);
        
        
        
        add(panel);
    }
    
    
    class buttonsListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
                
                if(e.getSource()==info){
                    
                    JOptionPane.showMessageDialog (null, "Este es un mensaje simple de tipo información");
                    JOptionPane.showMessageDialog(null, "Otro mensaje Simple tipo Información", "INFORMATION_MESSAGE", HEIGHT);
                }
                if(e.getSource()!=advertencia){
                    
                    
                }
                
                if(e.getSource()==error){
                    
                }
                if(e.getSource()==confirmacion){
                    
                }
                if(e.getSource()==texto){
                    
                }
                if(e.getSource()==combo){
                    
                }
                if(e.getSource()==mas){
                    
                }
        }
    }
    
}
