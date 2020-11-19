/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import Conexiones.Conexion;
import Controladores.ControllerJugador;
import DaO.JugadorDaoImpl;
import Model.Jugador;
import Vista.VistaJugador;
import iDAO.IJugadorDao;

/**
 *
 * @author alepin
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ControllerJugador controlador = new ControllerJugador();
        
       /* Jugador jugador = new Jugador();
        
        jugador.setNombre("Alejandro");
        jugador.setApellido("Megias");
        jugador.setDNI("44444444M");
        jugador.setPosicion("Delantero");
        
        controlador.añadir(jugador);
        */
       
       controlador.verJugadores();
    }
    
}
