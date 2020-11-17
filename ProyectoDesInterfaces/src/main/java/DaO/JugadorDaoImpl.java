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
        
        
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM jugadoresespaña";
        List <Jugador> listaJugadores = new ArrayList<Jugador>();
        
        try{
            
            //Abrimos conexion
            co=Conexion.conectar();
            stm=co.createStatement();
            rs=stm.executeQuery(sql);
            
            
            //Añadimos jugadores a la lista.
            while(rs.next()){
                Jugador j = new Jugador();
                j.setId(rs.getInt(1));
                j.setNombre(rs.getString(2));
                j.setApellido(rs.getString(3));
                j.setDNI(rs.getString(4));
                j.setPosicion(rs.getString(5));
                listaJugadores.add(j);
                
            }
            //Cerramos Conexion con la base de datos.
            stm.close();
            rs.close();
            co.close();
            
        }
        catch (SQLException e){
            //Avisamos por si hay algun error
            System.out.println("Error al obtener los jugadores");
            e.printStackTrace();
        }
            
            
                
            //Devolvemos la lista de jugadores    
            return listaJugadores;
        }
        
    

    @Override
    public boolean añadir(Jugador jugador) {
       
        //Creamos una variable para validar el registro.
        boolean registrar = false;
        
        Statement stm = null;
        Connection con = null;
        
        
        //Creamos la instruccion SQL almacenada en una variable.
        String insertar ="INSERT INTO jugadoresespaña values(NULL,'"+jugador.getNombre()+"','"+jugador.getApellido()+"','"+jugador.getDNI()+"','"+jugador.getPosicion()+"')";
        
        
        //Ejecutamos la consulta
        try{
            
            con=Conexion.conectar();
            stm=con.createStatement();
            stm.execute(insertar);
            registrar = true;
            stm.close();
            con.close();
            
        }
        
        
        catch(SQLException e){
            
            //Avisamos si existe algun error y donde ha sido
            System.out.println("Error:Clase JugadorDaoImpl,a la hora de añadir jugador");
        }
        
        
        //Devolvemos la validacion
        return registrar;
    }

    @Override
    public boolean actualizar(Jugador jugador) {
        
        Conexion conn= null;
        Statement stm = null;
        
        boolean actualizacion=false;
        
        String sql ="UPDATE jugadoresespaña SET Nombre='"+jugador.getNombre()+"', Apellidos='"+jugador.getApellido()+"', DNI='"+jugador.getDNI()+"'"+"', Posicion='"+jugador.getPosicion() +" WHERE ID="+jugador.getId();
        
        
        
        
        return actualizacion;
    }

    @Override
    public boolean eliminar(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
