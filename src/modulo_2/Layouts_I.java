/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 81,82 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Layouts_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_Layout miMarco = new Marco_Layout();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Marco_Layout extends JFrame{
    public Marco_Layout(){
        setTitle("- Prueba acciones -");
        setBounds(400,100,400,400);
        Panel_Layout lamina = new Panel_Layout();
        /*FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);
        lamina.setLayout(disposicion);*/
        //lamina.setLayout(new FlowLayout(FlowLayout.CENTER));
        //vIDEO 82
        Panel_Layout2 lamina2 = new Panel_Layout2();
        add(lamina, BorderLayout.NORTH);
        add(lamina2, BorderLayout.SOUTH);
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("Rosa"));
        add(new JButton("Gris"));
    }
}
//Video 82
class Panel_Layout2 extends JPanel{
    public Panel_Layout2(){
        setLayout(new BorderLayout());
        add(new JButton("Blanco"), BorderLayout.WEST);
        add(new JButton("Cyan"), BorderLayout.EAST);
        add(new JButton("Magenta"), BorderLayout.CENTER);
    }
}
