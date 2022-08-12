/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 69 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class Eventos_Ventana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoVentana2 miMarco = new MarcoVentana2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana2 miMarco2 = new MarcoVentana2();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(200,200,500,350);
        miMarco2.setBounds(700,200,500,350);
    }
}

class MarcoVentana2 extends JFrame{
    public MarcoVentana2(){
        //setTitle("- Respondiendo -");
        //setBounds(400,150,500,500);
        setVisible(true);
        addWindowListener(new M_Ventana2());
        
    }
}

class M_Ventana2 extends WindowAdapter{
    
    public void windowIconified(WindowEvent e){
       System.out.println("Ventana minimizada");
    }
}
