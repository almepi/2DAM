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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número mayor que 0:");
        
        
        
        int Numero = sc.nextInt();
        
        while(Numero<=0){
            System.out.println("Numero introducido no válido,introduzca otro número:");
            Numero = sc.nextInt();
        }
        
        for(int i=1;i<=Numero;i++){
            if(Numero%i==0){
                System.out.println(i);
                
            }
        }
        
        
    }
    
}
