/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 70 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class CambioEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoEstado miMarco = new MarcoEstado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(400,100,500,500);
        CambiaEstado nuevo_estado = new CambiaEstado();
        addWindowStateListener(nuevo_estado);
    }
}

class CambiaEstado implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        //System.out.println("La ventana a cambiado de estado");
        //System.out.println(e.getNewState());
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana está a pantalla completa");
        } else if (e.getNewState() == Frame.NORMAL){
            System.out.println("La ventana está normal");
        } else if (e.getNewState() == Frame.ICONIFIED){
            System.out.println("La ventana está minimizada");
        }
    }
}