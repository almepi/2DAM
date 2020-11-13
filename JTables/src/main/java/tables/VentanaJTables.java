/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.awt.BorderLayout;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alepin
 */
public class VentanaJTables extends JFrame{
    
    
     DefaultTableModel tablasql = new DefaultTableModel();   
    
    
   JTable tabla1 = new JTable();
   JScrollPane jScrollPanel = new JScrollPane();
   JPanel panel = new JPanel();
    
    public VentanaJTables() throws SQLException{
        
        //tabla sql:
        
        Object [] cabez = new Object[2];
        cabez[0] = "Id";
        cabez[1] = "Notas";
        
        tablasql.setColumnIdentifiers (cabez);
                
        //conexion con la base de datos:
        
   String JDBC_URL="jdbc: mysql: // localhost: 3306 / di";
        
   Connection con = (java.sql.DriverManager.getConnection(JDBC_URL,"root","123456"));
   
        
        
        
        
        //Cabeceras Tabla
    
     String [] cabeceras = new String []{"Name","Adress","Telephone","Car?"};
    
    //Datos Tabla
    
     Object [] [] datos = new Object [] []
    {
            {"Alfons González Pi","Argentona,Barcelona",new Long (933333333),true},
            {"Ana Maria Cuesta Suñer","Gijon,Asturias",new Long (986482394),false},
            {"Elena Veiguela Suárez","Pontevedra",new Long (623938436),false},
            {"Pedro Aguado Rodriguez","Madrid",new Long (348234723),true}
};
        
        
        
        setTitle( "TablaDatos" );
        setSize(500,500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
        
    tabla1.setModel(new DefaultTableModel (datos,cabeceras)
    {
        //Tipos de cada columna
        Class[] tipoColumna = {String.class,String.class,Long.class,Boolean.class};
        
        public Class getColumnClass(int indColumna){
            return tipoColumna [indColumna];
    }
    
    });
        
    //add(tabla1);
        
        
        
       
    }
    
}
