/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;

import java.util.Scanner;

/**
 *
 * @author alepin
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double total;
        
        System.out.println("Introduzca la longitud del primer lado:");
        double Lado1 = sc.nextDouble();
        System.out.println("Introduzca la longitud del segundo lado:");
        double Lado2 = sc.nextDouble();
        System.out.println("Introduzca la longitud del tercer lado:");
        double Lado3 = sc.nextDouble();
        
        if(Lado1+Lado2>Lado3 && Lado2+Lado3 >Lado1 && Lado1+Lado3>Lado2){
            System.out.println("Los lados introducidos sí que forman un triángulo.");
        }
        else{
            System.out.println("Los lados introducidos no forman un triangulo.");
        }
        
        
        
    }
}
