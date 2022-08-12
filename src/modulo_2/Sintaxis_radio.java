/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 93 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Sintaxis_radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_radio_sintaxis miMarco = new Marco_radio_sintaxis();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class Marco_radio_sintaxis extends JFrame{
    public Marco_radio_sintaxis(){
        setVisible(true);
        setTitle("Prueba sintaxis radio");
        setBounds(550,300,550,350);
        Lamina_radio_sintaxis lamina = new Lamina_radio_sintaxis();
        add(lamina);
    }
}

class Lamina_radio_sintaxis extends JPanel{
    public Lamina_radio_sintaxis(){
        ButtonGroup migrupo1 = new ButtonGroup();
        ButtonGroup migrupo2 = new ButtonGroup();
        JRadioButton btn1 = new JRadioButton("Rosa", false);
        JRadioButton btn2 = new JRadioButton("Gris", true);
        JRadioButton btn3 = new JRadioButton("Blanco", false);
        JRadioButton btn4 = new JRadioButton("Masculino", false);
        JRadioButton btn5 = new JRadioButton("Femenino", false);
        migrupo1.add(btn1);
        migrupo1.add(btn2);
        migrupo1.add(btn3);
        migrupo2.add(btn4);
        migrupo2.add(btn5);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
    }
}