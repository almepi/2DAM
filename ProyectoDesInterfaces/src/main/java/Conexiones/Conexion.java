/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alepin
 */
public class Conexion {
    
    public static Connection conectar(){
        Connection conn = null;
        
        //Gestionamos la conexion a la base de datos mysql a traves de estas variables:
        
        String password ="123456";
        String usuario ="root";
        String url ="jdbc:mysql://localhost:3306/bddinterfaces?user=" + usuario + password;
        
        try{
            conn=DriverManager.getConnection(url);
            if(conn!=null){
                System.out.println("Conectado");
            }
            
        }
        
        
        //Por si no se realizara la conexion, mensaje de aviso.
        catch(SQLException e){
            System.out.println("No se puede conectar a la Base de Datos");
            e.printStackTrace();
        }
        
     return conn;  
    }
    
    
}
