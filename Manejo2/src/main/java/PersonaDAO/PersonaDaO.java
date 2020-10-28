/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaDAO;

import java.util.*;
import datos.Conexion;
import Domain.Persona;
import static datos.Conexion.getConnection;
import java.sql.*;
/**
 *
 * @author alepin
 */
public class PersonaDaO {
    
    private static final String SQL_SELECT="SELECT id_Persona,Nombre,Apellidos,Edad FROM persona";
    
    
    public List <Persona> seleccionar() throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        
        List <Persona> personas = new ArrayList<>();
        
        try{
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idPersona = rs.getInt("id_Persona");
                String nombre = rs.getString("Nombre");
                String apellidos = rs.getString("Apellidos");
                int edad = rs.getInt("Edad");
                persona = new Persona (idPersona,nombre,apellidos,edad);
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
    
    
}
