/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeando;

import javax.swing.JOptionPane;

/**
 *
 * @author alepin
 */
public class Ejemplo {

    public static void main(String[] args) {

        String opc[] = {"Info", "Advertencia", "Error", "Conformación", "Texto", "Combo", "Más"};

        int seleccion = (int) JOptionPane.showOptionDialog(null, "", "Montones de JOptionPane", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null, opc, opc[0]);

        if(seleccion==1){
            
        }
        
        
        
        
        
        
        
        
        
        
    }

}
