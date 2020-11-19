/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alepin
 */


//Este va a ser nuestro objeto principal

public class Jugador {
    
    private int id;
    
    //Definimos las variables propias que tendrá:
    
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Posicion;
    
    
    //Constructor vacio.
    
    public Jugador(){
        
    }
    
    //Constructor parametrizado.
    
    public Jugador(int id,String Nombre,String Apellido,String DNI,String Posicion){
        this.id=id;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.DNI=DNI;
        this.Posicion=Posicion;
        
        
        
    }
    
    //Metodos para acceder a los parametros de nuestro objeto.

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    //Metodo para textualizar el objeto.
    
    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", Posicion=" + Posicion + '}';
    }
    
    
    
    
}
