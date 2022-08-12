/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 96 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class MarcoSliders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame_Sliders mimarco = new Frame_Sliders();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Frame_Sliders extends JFrame{
    public Frame_Sliders(){
        setBounds(550,400,550,350);
        Lamina_Sliders milamina = new Lamina_Sliders();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_Sliders extends JPanel{
    public Lamina_Sliders(){
        JSlider control = new JSlider(0,100,50);
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setFont(new Font("Serif", Font.ITALIC,12));
        control.setPaintLabels(true);
        //control.setSnapToTicks(true);
        add(control);
    }
}