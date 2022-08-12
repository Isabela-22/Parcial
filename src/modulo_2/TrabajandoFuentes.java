/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 62 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class TrabajandoFuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoFuentes miMarco = new MarcoFuentes();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFuentes extends JFrame{
    public MarcoFuentes(){
        setTitle("- Prueba con fuentes -");
        setSize(400,400);
        LaminaFuentes miLamina = new LaminaFuentes();
        add(miLamina);
        miLamina.setForeground(Color.darkGray);
    }
}

class LaminaFuentes extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font miFuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(miFuente);
        //g2.setColor(Color.blue);
        g2.drawString("Isabela", 150, 160);
        g2.setFont(new Font("Courier", Font.ITALIC, 25));
        g2.drawString("Rosero", 150, 185);
    }
}