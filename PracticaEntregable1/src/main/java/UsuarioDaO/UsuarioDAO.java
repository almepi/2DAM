/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioDaO;

import Domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Datos.Conexion;
import static Datos.Conexion.getConnection;
import java.sql.SQLException;
import static  Datos.Conexion.close;
import java.util.Scanner;

/**
 *
 * @author alepin
 */
public class UsuarioDAO {
    int registro =0;
    
   //mostrar Usuarios
    private static final String SQL_SELECT="SELECT id_usuario,Usuario,Password FROM usuario";
    
    //insertar Usuario
    private static final String SQL_INSERT="INSERT INTO usuarios (Usuario,Password)";

    
    
    
    //metodo para mostrar los usuarios
    public List <Usuario> seleccionar() throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario persona = null;
        
        List <Usuario> personas = new ArrayList<>();
        
        try{
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idUsuario = rs.getInt("id_usuario");
                String Usuario = rs.getString("Usuario");
                String Contraseña = rs.getString("Password");
                
                persona = new Usuario (Usuario,Contraseña);
                personas.add(persona);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        finally{
            Conexion.close(conn);
            Conexion.close(rs);
            Conexion.close(stmt);
        }
        
        
        
        
        
        return personas;
    }
    
    
    //metodo pa
    public int  insertar(Usuario x) throws SQLException {
        
       
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
       
        
        
        
        try{
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            
            
            
            
            stmt.setString(1, x.getNomUsuario());
            stmt.setString(2, x.getContraseña());
            registro= stmt.executeUpdate();
            
    }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        finally{
            Conexion.close(conn);
            Conexion.close(rs);
            Conexion.close(stmt);
        }
        
        return registro;
    
}
    
    
    
    

}