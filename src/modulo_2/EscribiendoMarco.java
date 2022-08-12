/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 58 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class EscribiendoMarco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoConTexto miMarco = new MarcoConTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto(){
        setVisible(true);
        setSize(300,300);
        setLocation(400,200);
        setTitle("- Primer Texto -");
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Aprendiendo Swing", 100, 100);
    }
}