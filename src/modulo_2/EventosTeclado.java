/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 71 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class EventosTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoTeclado miMarco = new MarcoTeclado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTeclado extends JFrame{
    public MarcoTeclado(){
        setVisible(true);
        setBounds(400,100,400,400);
        EventoDeTeclado tecla = new EventoDeTeclado();
        addKeyListener(tecla);
    }
}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //int codigo = e.getKeyCode();
        //System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}