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
public class Cuenta {
    
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular,Double cantidad){
        
        this.titular = titular;
        this.cantidad = cantidad;
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular){
       this.titular=titular;
       double cantidad=0;
        
    }

    
    
    
   
   public void ingresar (Cuenta i){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Introduzca la cantidad a ingresar:");
       double ingreso = sc.nextDouble();
       
       if(ingreso <0){
           
           System.out.println("Cantidad introducida errónea");
           
          // System.exit(0);
           
       }
       
       
       else{
           
       double total = i.getCantidad() + ingreso;
       
       i.setCantidad(total);
       
           System.out.println("Saldo actual ="+ i.getCantidad());
       
       }
       
   }
   
   
   public void retirar (Cuenta i){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Introduzca la cantidad a retirar:");
       
       double retiro = sc.nextDouble();
       
       if(i.getCantidad()-retiro<=0){
           i.setCantidad(0);
       }
       else{
           double saldo = i.getCantidad()-retiro;
           i.setCantidad(saldo);
           
           System.out.println("El saldo actual de su cuenta es= "+i.getCantidad());
       }
       
   }

    
   
    
   
   
    
}
