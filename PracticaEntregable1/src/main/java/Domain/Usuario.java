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
public class Usuario {
    
    private int IdUsuario;
    private String NomUsuario;
    private String Contraseña;
    
    public Usuario( String NomUsuario,String Contraseña){
        
        this.NomUsuario=NomUsuario;
        this.Contraseña=Contraseña;
               
    }

    

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", NomUsuario=" + NomUsuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
}
