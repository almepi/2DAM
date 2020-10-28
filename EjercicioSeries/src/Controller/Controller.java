/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ListShow;
import Model.Shows;
import Model.acces;
import Model.ListShow;
import View.Ventana;

/**
 *
 * @author alepin
 */
public class Controller {
    
    private int posicion;
    private ListShow ls;
    private acces acc = new acces();
    
    
    public Controller(){
        posicion=0;
        ls= new ListShow();
        ls=acc.loadLS();
    }
    
    
    public Shows first(){
        
        posicion=0;
        return ls.getShow(posicion);
    }
    
    
    public Shows previous(){
        if(posicion>0){
            posicion--;
            
        }
        return ls.getShow(posicion);
    }
    
    public Shows next(){
        posicion++;
        if(posicion==ls.longitud()){
            posicion--;
        }
        return ls.getShow(posicion);
    }
    
    public Shows last(){
        posicion=(ls.longitud()-1);
        return ls.getShow(posicion);
        
        
    }
    
    public void nuevo(Shows s){
        ls.setShow(s);
        posicion=ls.longitud()-1;
        acc.saveLS(ls);
        
    }
    
    
    
    
    
    
    
}
