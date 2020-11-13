/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPropuesto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author alepin
 */
public class DialogoModal extends JDialog {
    
    private JTextField textField;
    
    public DialogoModal(JFrame padre){
        
        super(padre,true);
        
        setTitle("Mete un dato");
        textField = new JTextField(20);
        add(textField);
        
        textField.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent arg0){
            setVisible(false);
        }
        
    });
        
    
    
    
}
    
    public String getText(){
        return textField.getText();
    }
    
    class em implements ActionListener{
        
       
        
        JFrame miFrame;
        public em(JFrame f){
            miFrame=f;
        }
        public void actionPerformed(ActionEvent e){
            
            DialogoModal dialogoModal = new DialogoModal(miFrame);
            dialogoModal.pack();
            
            dialogoModal.setVisible(true);
            System.out.println(dialogoModal.getText());
            
            
        }
    
        
        
    }
    
    
}

