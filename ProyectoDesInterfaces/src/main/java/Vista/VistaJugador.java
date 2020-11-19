/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.Jugador;
import java.util.List;

/**
 *
 * @author alepin
 */
public class VistaJugador {
    
    public void verJugador (Jugador jugador){
        System.out.println("Datos del jugador:"+jugador);
    }
    
    public void verJugadores(List<Jugador>jugadores){
        for(Jugador jugador:jugadores){
            System.out.println("Jugadores:"+jugador);
        }
    }
    
}
