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
public class AccesoAdatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        double TasaEspecial = 0.3;
        double TasaGeneral = 0.3;
        String especial="";
        double Tasa;
        
        System.out.println("¿Es usted un conductor especial? Responda SI o NO.\n"
                + "Se considerará conductor especial si pertenece a los siguientes campos:\n"
                + "-Conductor de carga.\n"
                + "-Vehículos especiales(transporte público, emergencias, etc.)\n"
                + "-Si es usted un conductor novel.\n");
        
        
        especial = sc.nextLine();
        
        System.out.println("Introduzca la tasa de alcoholemia dada:");
        
        Tasa= sc.nextDouble();
        
        especial=especial.toUpperCase();
        
        if(especial.contains("SI")){
            if(Tasa>=0.3){
                System.out.println("Usted no puede conducir.");
            }
            else{
                System.out.println("Usted está apto para conducir.");
            }
        }
        if(especial.contains("NO")){
            if(Tasa>=0.5){
                System.out.println("Usted no puede conducir.");
            }
            else{
                System.out.println("Usted está apto para conducir");
            }
        }
      
    }
}
        
        