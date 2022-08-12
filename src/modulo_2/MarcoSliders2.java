/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 97 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class MarcoSliders2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame_Sliders2 mimarco = new Frame_Sliders2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Frame_Sliders2 extends JFrame{
    public Frame_Sliders2(){
        setBounds(550,400,550,350);
        Lamina_Sliders2 milamina = new Lamina_Sliders2();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_Sliders2 extends JPanel{
    public Lamina_Sliders2(){
        setLayout(new BorderLayout());
        rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        add(rotulo, BorderLayout.CENTER);
        control = new JSlider(8,50,12);
        control.setMajorTickSpacing(20);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        control.addChangeListener(new EventoSlider());
        JPanel laminaSlider = new JPanel();
        laminaSlider.add(control);
        add(laminaSlider, BorderLayout.NORTH);
    }
    private class EventoSlider implements ChangeListener{
        public void stateChanged(ChangeEvent e){
            //contador++
            //System.out.println("Estás manipulando el deslizante" + control.getValue());
            rotulo.setFont(new Font("Serif", Font.PLAIN,control.getValue()));
        }
    }
    private JLabel rotulo;
    private JSlider control;
    private static int contador;
}