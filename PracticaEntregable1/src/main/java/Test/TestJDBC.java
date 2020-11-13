/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Domain.Usuario;
import java.util.Scanner;
import UsuarioDaO.UsuarioDAO;
 

/**
 *
 * @author alepin
 */
import Domain.Usuario;
import UsuarioDaO.UsuarioDAO;
public class TestJDBC {
    
    public static void main(String[] args) throws SQLException  {
        
        
        Scanner sc = new Scanner(System.in);
        
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
   
        
    
        try{
            
          //  Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conexion = DriverManager.getConnection(url,"root","123456");
            Statement instruccion = conexion.createStatement();
            String sql ="SELECT * FROM usuario";
            ResultSet resultado = instruccion.executeQuery(sql);
        
            while(resultado.next()){
                System.out.println("id Usuario: "+ resultado.getInt("id_usuario"));
                System.out.println("Nombre: "+ resultado.getString("Usuario"));
                System.out.println("Apellidos: "+resultado.getString("Password"));
                
          
                
                
                
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();
            
            
            
            
            
        }
        catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    
    
    
    /*while(true){
        System.out.println("Seleccione una opcion:\n"
                + "1-Introducir usuario nuevo.\n"
                + "2-Modificar usuario existente.\n"
                + "3-Eliminar usuario.\n");
        
        
        int opcion = sc.nextInt();
        sc.nextLine();
        
        switch(opcion){
            
            case 1:
            System.out.println("Inroduzca el Nombre de Usuario que desea crear:");
            String user = sc.nextLine();
           
            System.out.println("Introduzca la contraseña para dicho usuario:");
            String pass = sc.nextLine();
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            
            
            Usuario u = new Usuario(user,pass);
            
            usuarioDAO.insertar(u);
            break;
            
            */
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            
            Usuario u = new Usuario("Roberto","1234");
            usuarioDAO.insertar(u);
            
            
            
            
            
            
        }
        
        
    }
    
    
    
    
    
    

