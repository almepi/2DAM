/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Shows;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alepin
 */
public class Ventana extends JFrame {
    
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    
    private JButton primera,ultima,anterior,siguiente,borrar,añadir,actualizar;
    private JLabel titulo,escritor,temporadas,genero,verTemporadas;
    private JTextField campoTitulo, campoEscritor,campoTemporadas,campoGenero,campoVerTemporadas;
    private Controller c = null;
    
    public Ventana(Controller control){
        
        
        c=control;
        
        setSize(500,300);
        setTitle("Mis Series");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(7,2,10,10));
        panel3.setLayout(new FlowLayout());
        
        add(panel1);
        
        panel1.add(panel3,BorderLayout.NORTH);
        panel1.add(panel2,BorderLayout.CENTER);
        
        primera = new JButton("|<");
        anterior = new JButton("<");
        siguiente = new JButton(">");
        ultima = new JButton(">|");
        añadir = new JButton("+");
        borrar = new JButton("-");
        actualizar = new JButton("*");
        
        panel3.add(primera);
        panel3.add(anterior);
        panel3.add(siguiente);
        panel3.add(ultima);
        panel3.add(añadir);
        panel3.add(borrar);
        panel3.add(actualizar);
        
        
        
        titulo = new JLabel("Titulo");
        campoTitulo = new JTextField(50);
        
        panel2.add(titulo);
        panel2.add(campoTitulo);
        
        
        
        escritor = new JLabel("Escritor");
        campoEscritor = new JTextField(50);
        
        panel2.add(escritor);
        panel2.add(campoEscritor);
        
        
        
        temporadas = new JLabel("Temporadas");
        campoTemporadas = new JTextField(50);
        
        panel2.add(temporadas);
        panel2.add(campoTemporadas);
        
        
        
        genero = new JLabel("Genero");
        campoGenero = new JTextField(50);
        
        panel2.add(genero);
        panel2.add(campoGenero);
        
        
        
        verTemporadas = new JLabel("Tempoaradas vistas");
        campoVerTemporadas = new JTextField(50);
        
        panel2.add(verTemporadas);
        panel2.add(campoVerTemporadas);
        
        
        
        campoTitulo.setEditable(false);
        campoEscritor.setEditable(false);
        campoTemporadas.setEditable(false);
        campoGenero.setEditable(false);
        campoVerTemporadas.setEditable(false);
        
       
        buttonsListener bl = new buttonsListener();
        
        primera.addActionListener(bl);
        anterior.addActionListener(bl);
        siguiente.addActionListener(bl);
        ultima.addActionListener(bl);
        añadir.addActionListener(bl);
        borrar.addActionListener(bl);
        actualizar.addActionListener(bl); 
        
        
        
        
        
        
        
    
    
    
    }
    
    
    class buttonsListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
                Shows s = new Shows();
                if(e.getSource()==primera){
                    s=c.first();
                }
                
                if(e.getSource()==anterior){
                    s=c.previous();
                }
                
                if(e.getSource()==siguiente){
                    s=c.next();
                }
                
                if(e.getSource()==ultima){
                    s=c.last();
                }
                if(e.getSource()==añadir){
                    if(añadir.getText().equals("+")){
                        
                        //vaciamos campos para activar la escritura.
                        
                        campoTitulo.setText("");
                        campoEscritor.setText("");
                        campoTemporadas.setText("");
                        campoGenero.setText("");
                        campoVerTemporadas.setText("");
                        
                        
                        
                        //botones
                        primera.setEnabled(false);
                        anterior.setEnabled(false);
                        siguiente.setEnabled(false);
                        ultima.setEnabled(false);
                        borrar.setEnabled(false);
                        actualizar.setEnabled(false);
                        
                        añadir.setText("+++");
                        
                        //Activamos campos
                        
                        campoTitulo.setEditable(true);
                        campoEscritor.setEditable(true);
                        campoTemporadas.setEditable(true);
                        campoGenero.setEditable(true);
                        campoVerTemporadas.setEditable(true);
                        
                    }
                    
                    else{
                        
                        //Habilitamos los botones de nuevo
                        
                        primera.setEnabled(true);
                        anterior.setEnabled(true);
                        siguiente.setEnabled(true);
                        ultima.setEnabled(true);
                        añadir.setEnabled(true);
                        borrar.setEnabled(true);
                        actualizar.setEnabled(true);
                        
                        añadir.setText("+");
                        s = añadirSerie();
                        c.nuevo(s);
                        
                    }
                }
                
                updating(s);
                
                }
        
        
        
        
        
        
        
    }
    
    private void updating(Shows s){
        campoTitulo.setText(s.getTittle());
        campoEscritor.setText(s.getScriptwriter());
        campoTemporadas.setText(String.valueOf(s.getSeasons()));
        campoGenero.setText(s.getGenre());
        campoVerTemporadas.setText(String.valueOf(s.getViews()));
        
    }
    
    
    
    public Shows añadirSerie(){
        
        //Introducimos los datos de los campos en un objeto Shows S.
        
        Shows s = new Shows(campoTitulo.getText(),
                            campoEscritor.getText(),
                            Integer.parseInt(campoTemporadas.getText()),
                            campoGenero.getText(),
                            Integer.parseInt(campoVerTemporadas.getText())
        );
        
        
                
                
            return s;            
        
                        
    }
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    

