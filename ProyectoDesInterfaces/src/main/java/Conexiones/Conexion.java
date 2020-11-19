/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alepin
 */
public class Conexion {
    
    
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/bddinterfaces?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="123456";
    
    
    
    public static Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(JDBC_URL, JDBC_USER,JDBC_PASSWORD);
        
        
    }
    
    public static void close (ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close (Statement smtm) throws SQLException{
        smtm.close();
    }
    public static void close (Connection conn) throws SQLException{
        conn.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    
    public static Connection conectar(){
        Connection conn = null;
        
        //Gestionamos la conexion a la base de datos mysql a traves de estas variables:
        
        String password ="123456";
        String usuario ="root";
        String url = "jdbc:mysql://localhost:3306/bddinterfaces?user=" + usuario + "&password=" + password;
        
        
        
    
        
        
        
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
    
    */
}
