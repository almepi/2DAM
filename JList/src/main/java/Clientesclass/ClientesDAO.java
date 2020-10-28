/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientesclass;
import java.sql.*;
import java.util.*;
import Conexion.Conex;
import static Conexion.Conex.getConnection;




/**
 *
 * @author alepin
 */
public class ClientesDAO {
    
    private static final String SQL_SELECT="SELECT * from clientesejercicio";
    
    
    public List <clientes> seleccionar() throws SQLException{
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clientes c = null;
        
        List <clientes> listaclientes = new ArrayList<>();
        
        try{
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("Nombre");
               
                c = new clientes (idCliente,nombre);
                listaclientes.add(c);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
        
        
        
        
        return listaclientes;
    }
        
}
    
    
    
    
    
    
    /*
    p
    
    try{
    
    String urlodbc ="jdbc:mysql://localhost:3306/di?useSSL=false";
    
    Connection conn =(java.sqlDriveManager.getConnection(urlODBC,'root',...))
    
    Statement s = con.createStatement();
    ResulSet rs = s.executeQuerry("select * from clientesejercicio");
    
    while(rs.next()){
        client c = new client();
        c.setID(rs.getString("ID"));
        c.setNotes(rs.getString("Notes"));
        lc.add(c);
    }
    
    rs.close;
    s.close;
    con.close;
    
    
}
    catch(Exception e){
            System.out.println("error database");
}
    */
    
    
    
    
    
    
    
    
    
    
    

