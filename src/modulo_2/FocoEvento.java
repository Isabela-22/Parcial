/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 74, 75 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class FocoEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoFoco miMarco = new MarcoFoco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}

class MarcoFoco extends JFrame{
    public MarcoFoco(){
        setVisible(true);
        setBounds(400,100,400,400);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setLayout(null);
        cuadro1 = new JTextField();
        cuadro2 = new JTextField();
        cuadro1.setBounds(120, 50, 150, 20);
        cuadro2.setBounds(120, 90, 150, 20);
        add(cuadro1);
        add(cuadro2);
        LanzaFocos foco = new LanzaFocos();
        cuadro1.addFocusListener(foco);
    }
    
    private class LanzaFocos implements FocusListener{

       @Override
       public void focusGained(FocusEvent e) {
       }

       @Override
       public void focusLost(FocusEvent e) {
           //System.out.println("Ha perdido el foco");
           
           //Video 75 
           String email = cuadro1.getText();
           boolean comprobacion = false;
           for(int i=0; i<email.length(); i++){
               if(email.charAt(i)=='@'){
                   comprobacion = true;
               }
           }
           if (comprobacion){
               System.out.println("Correcto");
           } else {
               System.out.println("Incorrecto");
           }
       }
}
    JTextField cuadro1;
    JTextField cuadro2;
}
