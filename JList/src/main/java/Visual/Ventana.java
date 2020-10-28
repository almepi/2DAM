/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Clientesclass.clientes;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author alepin
 */
public class Ventana extends JFrame {
    
    
    
    private JList listaIzquierda;
    private JList listaDerecha;
    
    private DefaultListModel listModelIzquierda = new DefaultListModel();
    private DefaultListModel listModelDerecha = new DefaultListModel();
    
    
    
    private JButton botonPasar;
    private JButton botonVolver;
    private JButton botonPrint;
    
    public Ventana(){
        
        setTitle("JListActivity");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //panel
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,3,10,10));
        
        
        
        JPanel panelCentral = new JPanel();
        
        panelCentral.setLayout(new GridLayout(3,1,10,10));
        
        botonPasar = new JButton(">>>");
        botonVolver = new JButton("<<<");
        botonPrint = new JButton("Print");
        
        listaIzquierda =new JList(listModelIzquierda);
        listaDerecha = new JList(listModelDerecha);
        
        panelCentral.add(botonPasar);
        panelCentral.add(botonVolver);
        panelCentral.add(botonPrint);
        
        panel.add(listaIzquierda);
        panel.add(panelCentral);
        panel.add(listaDerecha);
       
        
        
        
        
        
        add(panel);
    }
    

    
    
    
    
}
