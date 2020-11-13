/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.jdbc.masmenus;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alepin
 */
public class VentanaMenus extends JFrame{
        
        private JMenuBar menuBar;
        private JMenu menu1;
        private JMenu menu2;
        private JMenuItem menuItem;
    
    public VentanaMenus(){
        setLayout(new BorderLayout());
        setTitle( "Menus" );
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        //Instanciamos la barra de menus
        menuBar = new JMenuBar();
        //La primera opcion del menu:
        
        menu1 = new JMenu("Primer Menu");
        
        menuBar.add(menu1);
        
        menuItem = new JMenuItem("Opcion 1");
        menu1.add(menuItem);
        menu1.addSeparator();
        menuItem = new JMenuItem("Opcion 2");
        menu1.add(menuItem);
        
       
        
        menu2 = new JMenu("Segundo menu");
        menuBar.add(menu2);
        
        
        
        add(menuBar,BorderLayout.NORTH);
        
        
    }
    
    public class DialogoModal extends JDialog {
    
    private JTextField textField;
    
    public DialogoModal(JFrame padre){
        
        super(padre,true);
        
        setTitle("Mete un dato");
        textField = new JTextField(20);
        add(textField);
        
        textField.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent arg0){
            setVisible(false);
        }
        
    });
        
    
    
    
}
    
    public String getText(){
        return textField.getText();
    }
    
    class em implements ActionListener{
        
       
        
        JFrame miFrame;
        public em(JFrame f){
            miFrame=f;
        }
        public void actionPerformed(ActionEvent e){
            
            DialogoModal dialogoModal = new DialogoModal(miFrame);
            dialogoModal.pack();
            
            dialogoModal.setVisible(true);
            System.out.println(dialogoModal.getText());
            
            
        }
    
        
        
    }
    
    
}
}
