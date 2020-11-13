/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.jdbc.menucasa;

import java.awt.BorderLayout;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alepin
 */
public class VentanaCasa extends JFrame{
    
        private JMenuBar menuBar;
        private JMenu menuCasa;
        private JMenu menuExtras;
        private JMenuItem menuItem;
        private Icon fotoCasa;
    
    public VentanaCasa(){
        
        setLayout(new BorderLayout());
        setTitle( "Menus" );
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        menuBar = new JMenuBar();
        
        menuCasa = new JMenu("Casa");
        menuCasa.setIcon(fotoCasa);
        
        
    }
    
}
