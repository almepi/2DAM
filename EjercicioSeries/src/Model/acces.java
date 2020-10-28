/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.*;

/**
 *
 * @author alepin
 */
public class acces {
    private static File f = new File("series.dat");
    
    public static void saveLS(ListShow ls){
        try{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ls);
            oos.close();
        } catch(IOException ex){
            System.out.println("Failed to open file");
        }
    }
    
    public static ListShow loadLS(){
        ListShow ls = new ListShow();
        ObjectInputStream ois = null;
        try{
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ls=(ListShow) ois.readObject();
            ois.close();
        }catch(IOException io){
            System.out.println("Failed to open file");
            
        }finally{
            return ls;
        }
    }
    
    
    
    }
