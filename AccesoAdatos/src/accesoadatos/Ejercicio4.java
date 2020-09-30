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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número entero y positivo");
        
        int Numero = sc.nextInt();
        
        while(Numero<0){
            System.out.println("Introduzca un numero positivo:");
            Numero = sc.nextInt();
        }
        
        for(int i=0;i<=Numero;i++){
            System.out.println(i);
               
            for(int j=0;j<=Numero;j=j+2){
                
                for(int k=0;k<=Numero;k=k+3){
                    
                    // System.out.println(i+"\t"+j+"\t"+k);
                     
                }
            }
           
            
            
        }
        
        
    }
    
}
