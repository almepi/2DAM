/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author alepin
 */
public class Persona {
    
    private int id_Persona;
    private String Nombre;
    private String Apellidos;
    private int Edad;

    public Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public Persona(int id_Persona, String Nombre, String Apellidos, int Edad) {
        this.id_Persona = id_Persona;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public Persona(String Nombre, String Apellidos, int Edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public Persona() {
    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_Persona=" + id_Persona + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + '}';
    }



    
    
}
