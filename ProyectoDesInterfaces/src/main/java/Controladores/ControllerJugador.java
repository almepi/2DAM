/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import DaO.JugadorDaoImpl;
import Model.Jugador;
import Vista.VistaJugador;
import iDAO.IJugadorDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alepin
 */
public class ControllerJugador {
    
    private VistaJugador vista = new VistaJugador();
    
    public ControllerJugador(){
        
    }
    
    //Llama al Dao para añadir un jugador
    public void añadir(Jugador jugador){
        IJugadorDao dao = new JugadorDaoImpl();
        dao.añadir(jugador);
    }
    
    //Llama al Dao para actualizar un jugador
    public void actualizar(Jugador jugador){
        IJugadorDao dao= new JugadorDaoImpl();
        dao.actualizar(jugador);
    }
    
    //Llama al Dao para eliminar un jugador
    public void eliminar(Jugador jugador){
        IJugadorDao dao = new JugadorDaoImpl();
        dao.eliminar(jugador);
    }
    
    
    //Llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public void verJugadores(){
        List<Jugador> jugadores = new ArrayList<Jugador>();
        IJugadorDao dao = new JugadorDaoImpl();
        jugadores=dao.obtener();
        vista.verJugadores(jugadores);
    }
    
}
