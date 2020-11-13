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
    
    private Connection conexionTransaccional;
    
    private static final String SQL_SELECT="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
    
    
    
    
    
    
    public PersonaDaO(){};
    
    public PersonaDaO(Connection conexionTransaccional){
        this.conexionTransaccional=conexionTransaccional;
    }
    
    
    
        
    }
    
    

