
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alepin
 */
public class TestMysqlJDBC {
    
    public static void main(String[] args) {
        
        
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   
        
    
        try{
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexion = DriverManager.getConnection(url,"root","123456");
            Statement instruccion = conexion.createStatement();
            String sql ="SELECT id_Persona,Nombre,Apellidos,Edad FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
        
            while(resultado.next()){
                System.out.println("id Persona: "+ resultado.getInt("id_Persona"));
                System.out.println("Nombre: "+ resultado.getString("Nombre"));
                System.out.println("Apellidos: "+resultado.getString("Apellidos"));
                System.out.println("Edad persona: "+resultado.getInt("Edad"));
          
                
                
                
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();
            
            
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    
    
    
    
    
    
    
    
    }
    
    
}
