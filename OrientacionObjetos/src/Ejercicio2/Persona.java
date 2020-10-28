/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author alepin
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;
    private final boolean sexo=true;
    private double peso;
    private double altura;
    
    
    private char sexoReal = 'H';
    
    public Persona(String nombre, int edad,String dni,boolean sexoboolean,double peso,double altura){
        this.nombre= nombre;
        this.edad= edad;
        this.dni= dni;
        this.peso=peso;
        this.altura=altura;
        sexoboolean=true;
        sexoReal='H';
        
        if(sexoboolean==true){
            
        }
        else{
            sexoReal='M';
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public boolean getSexo() {
        return sexo;
    }

    

    public char getSexoReal(Persona p) {
        
        if(p.getSexo()==true){
            sexoReal='H';
        }
        else{
            sexoReal='M';
        }
        
        return sexoReal;
    }

    public void setSexoReal(char sexoReal) {
        this.sexoReal = sexoReal;
    }
    
    public Persona(String nombre,int edad, boolean sexo,String dni,double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.dni="";
        this.peso=0;
        this.altura=0;
        
    }
    
    public Persona(){
        
    }
    
    public void indiceMC (Persona p){
        
        int num;
        
        double imc;
        
        if(p.getPeso()/((p.getAltura()*p.getAltura()))<20){
            num=-1;
            System.out.println("Usted se encuentra por debajo de su peso ideal");
        }
        if(p.getPeso()/((p.getAltura()*p.getAltura()))>20 && p.getPeso()/((p.getAltura()*p.getAltura()))<25){
            num=0;
            System.out.println("Usted está en su peso ideal");
        }
       if(p.getPeso()/((p.getAltura()*p.getAltura()))>25)
           num =1;
           System.out.println("Usted está por encima de su peso ideal.");
    }
    
    
    
    public void mayorDeEdad(Persona p){
        if(p.getEdad()<18){
            System.out.println("Esta persona es menor de edad");
        }
        else{
            System.out.println("Esta persona es mayor de edad.");
        }
    }
    
    public char comprobarSexo(char x){
        
        if(x=='H' || x=='h' || x=='M' || x=='m'){
            
            System.out.println("El sexo es correcto");
            
            return x;
            
        }
        
        else{
            
            System.out.println("El sexo no es correcto.");
             
            return 'H';
            
            
        }
        
        
        
    }
    
    
    
    
    

    @Override
    public String toString() {
        
        String mensaje = "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexoReal + ", peso=" + peso + ", altura=" + altura + "}";
   
        
        return mensaje;

    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
