/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 68 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class Eventos_Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoVentana miMarco = new MarcoVentana();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MarcoVentana miMarco2 = new MarcoVentana();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");
        miMarco2.setTitle("Ventana 2");
        miMarco.setBounds(200,200,500,350);
        miMarco2.setBounds(700,200,500,350);
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){
        //setTitle("- Respondiendo -");
        //setBounds(400,150,500,500);
        setVisible(true);
        M_Ventana oyente_ventana = new M_Ventana();
        addWindowListener(oyente_ventana);
        
    }
}

class M_Ventana implements WindowListener{
    public void windowActivated(WindowEvent e){
        System.out.println("Ventana activada");
    }
    public void windowClosed(WindowEvent e){
    System.out.println("La ventana ha sido cerrada");
    }
    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando Ventana");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }
    public void windowIconified(WindowEvent e){
       System.out.println("Ventana minimizada");
   }
    public void windowOpened(WindowEvent e){
       System.out.println("Ventana abierta");
    }
}
