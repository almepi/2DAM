/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaO;

import Conexiones.Conexion;
import Model.Jugador;
import iDAO.IJugadorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alepin
 */
public class JugadorDaoImpl implements IJugadorDao{

    //Metodo para obtener la lista de jugadores
    
    @Override
    public List<Jugador> obtener() {
        
        
        
        List <Jugador> listaJugadores = new ArrayList<Jugador>();
        String sql = "SELECT * FROM jugadoresespaña";
        
       
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        //Connection co = null;
        //Statement stm = null;
        //ResultSet rs = null;
        
        
        
        
        try{
            
            //Abrimos conexion
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery(sql);
            
            Jugador j = null;
            
            //Añadimos jugadores a la lista.
            while(rs.next()){
                
                int idJugador = rs.getInt("Id");
                String nombre = rs.getString("Nombre");
                String apellidos = rs.getString("Apellidos");
                String DNI = rs.getString("DNI");
                String posicion = rs.getString("Posicion");
                j = new Jugador (idJugador,nombre,apellidos,DNI,posicion);
                listaJugadores.add(j);
                
            }
            //Cerramos Conexion con la base de datos.
            stmt.close();
            rs.close();
            conn.close();
            
        }
        catch (SQLException e){
            //Avisamos por si hay algun error
            System.out.println("Error al obtener los jugadores");
            e.printStackTrace();
        }
            
            
                
            //Devolvemos la lista de jugadores    
            return listaJugadores;
        
        
        }
        
        
        
    //Método para añdir un jugador a la base de datos

    /**
     *
     * @param jugador
     * @return
     */
    @Override
    public boolean añadir(Jugador jugador) {
       
        //Creamos una variable para validar el registro.
        boolean registrar = false;
        
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
       // Statement stm = null;
       // Connection con = null;
        
        
        //Creamos la instruccion SQL almacenada en una variable.
        String insertar ="INSERT INTO jugadoresespaña values(NULL,'"+jugador.getNombre()+"','"+jugador.getApellido()+"','"+jugador.getDNI()+"','"+jugador.getPosicion()+"')";
        
        
        //Ejecutamos la consulta
        try{
            System.out.println(insertar);
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(insertar);
            stmt.execute(insertar);
            registrar = true;
            stmt.close();
            conn.close();
            
        }
        
        
        catch(SQLException e){
            
            //Avisamos si existe algun error y donde ha sido
            System.out.println("Error:Clase JugadorDaoImpl,a la hora de añadir jugador");
        }
        
        
        //Devolvemos la validacion
        return registrar;
    }

    
    //Método para actualizar un jugador en la base de datos
    @Override
    public boolean actualizar(Jugador jugador) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean actualizacion=false;
        
        
        //Sentencia sql a realizar
        String actualizar ="UPDATE jugadoresespaña SET Nombre='"+jugador.getNombre()+"', Apellidos='"+jugador.getApellido()+"', DNI='"+jugador.getDNI()+"'"+"', Posicion='"+jugador.getPosicion() +" WHERE ID="+jugador.getId();
        
        
        //abrimos conexion, ejecutamos y cerramos conexion
        try{
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(actualizar);
            stmt.execute(actualizar);
            actualizacion = true;
            stmt.close();
            conn.close();
            
        }
        
        //Capturamos si existe algun error en la orden
        catch(SQLException e){
            System.out.println("Error: Clase JugadorDaoImpl, método actualizar");
            e.printStackTrace();
        }
        
        return actualizacion;
    }

    
    //Método para eliminar un jugador de la base de datos
    @Override
    public boolean eliminar(Jugador jugador) {
        
    
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        boolean eliminar = false;
        
        //Sentencia sql que queremos hacer
        String borrar ="DELETE FROM jugadoresespaña WHERE ID= "+jugador.getId();
    
        
        //Abrimos onexion, ejecutamos orden y cerramos conexion
        try{
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement(borrar);
            stmt.execute(borrar);
            eliminar = true;
            stmt.close();
            conn.close();
            
            
        }
        
        //Capturamos cualquier error en el método
        catch(SQLException e){
            System.out.println("Error: clase JugadorDaoImpl, método eliminar");
            e.printStackTrace();
        }
    
    return eliminar;
    
    }
    
    
    
}
