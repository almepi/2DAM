/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author alepin
 */
public class ListShow implements Serializable {
    
    private ArrayList<Shows> seriesList;

    public ListShow(){
        
        
        seriesList = new ArrayList<>();
        
    
    
    }

   public Shows getShow(int p){
       return seriesList.get(p);
   }
   
   public void setShow(Shows s){
       seriesList.add(s);
   }
    
    public int longitud(){
        return seriesList.size();
    }
    
    
    
}
