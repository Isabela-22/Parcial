/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 72, 73 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class EventosRaton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoRaton miMarco = new MarcoRaton();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true);
        setBounds(400,100,400,400);
        //EventosDeRaton eventoRaton = new EventosDeRaton();
        //addMouseListener(eventoRaton);
        
        //Video 73
        
        //EventosDeRaton2 eventoRaton2 = new EventosDeRaton2();
        //addMouseListener(eventoRaton2);
        EventosDeRaton3 eventoRaton3 = new EventosDeRaton3();
        addMouseMotionListener(eventoRaton3);
    }
}

class EventosDeRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}

//Video 73

class EventosDeRaton2 extends MouseAdapter{
    /*public void mouseClicked(MouseEvent e){
    System.out.println("Has hecho click");
    System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
    System.out.println(e.getClickCount());
    }*/
  public void mousePressed(MouseEvent e){
    if(e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK){
        System.out.println("Has pulsado el botón izquierdo");
    }else if(e.getModifiersEx()== MouseEvent.BUTTON2_DOWN_MASK){
        System.out.println("Has pulsado la rueda del ratón");
    } else if(e.getModifiersEx()== MouseEvent.BUTTON3_DOWN_MASK){
        System.out.println("Has pulsado el botón derecho");
    }
  }
}

class EventosDeRaton3 implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estas arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo");
    }
    
}