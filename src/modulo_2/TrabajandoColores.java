/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 61 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class TrabajandoColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoColor miMarco = new MarcoColor();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoColor extends JFrame{
    public MarcoColor(){
        setTitle("- Prueba con colores -");
        setSize(400,400);
        LaminaColor miLamina = new LaminaColor();
        add(miLamina);
        miLamina.setBackground(SystemColor.window);
        //miLamina.setBackground(Color.PINK);
    }
}

class LaminaColor extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        // Dibujo rectánuglo
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.blue);
        g2.draw(rectangulo);
        //g2.setPaint(Color.RED);
        g2.fill(rectangulo);
        
        //Dibujo elipse
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        Color micolor = new Color(125, 189, 200);
        g2.setPaint(micolor);
        g2.fill(elipse);
    }
}