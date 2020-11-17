/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iDAO;

import Model.Jugador;
import java.util.List;

/**
 *
 * @author alepin
 */

//Hacemos una interfaz de nuestro objeto que solo tendrá algunos metodos.

public interface IJugadorDao {
    public List <Jugador> obtener();
    public boolean añadir(Jugador jugador);
    public boolean actualizar(Jugador jugador);
    public boolean eliminar(Jugador jugador);
    
    
    
    
    
    
}
