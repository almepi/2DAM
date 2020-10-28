/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alepin
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        boolean sexoboolean =true;
        
        System.out.println("Hola, introduzca su nombre:");
        
        Scanner sc = new Scanner(System.in);
        
        String nombre = sc.nextLine();
        
        System.out.println("Introduzca si edad: ");
        
        int edad = sc.nextInt();
        
        System.out.println("Introduzca su sexo, si se trata de un hombre escriba 'H':\n De lo contrario escriba 'M'");
       
        String sexoreal =""+ sc.nextLine().charAt(0);
        
        sexoreal.toUpperCase();
        
        if(sexoreal.contains("M")){
            sexoboolean =false;
        }
        
        
        
        
        
        
        
        System.out.println("Introduzca su peso: ");

        double peso = sc.nextDouble();
        
        System.out.println("Introduzca su altura");
        
        double altura = sc.nextDouble();
        
        
        
       // Persona persona1 = new Persona(nombre,edad,sexoboolean);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
