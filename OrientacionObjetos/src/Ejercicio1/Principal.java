/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alepin
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Para crear una cuenta introduzca su Nombre y la cantidad de ingreso de apertura."
                + "Si no desea ingrersar al abrir la cuenta introduzca 0.");
        
        String nombre = sc.nextLine();
        Double cantidad = sc.nextDouble();
        
        Cuenta c = new Cuenta(nombre,cantidad);
        
        
        
        while(true){
        
        System.out.println("Puede hacer una de las siguientes 3 opciones:\n"
                + "1-Ingresar dinero\n"
                + "2-Retirar dinero.\n"
                + "3-Salir.\n");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            
        case 1:
                
                c.ingresar(c);
                
                break;
                
        case 2: 
            
                c.retirar(c);
                
                break;
            
                
                
                
        case 3:
            
            System.exit(0);
            
            
        }
        
        
        
                
        
        
        
        
        
                
        
        
    }
    }
    
}
