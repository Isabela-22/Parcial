/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 94 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Ejemplo_radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_radio miMarco = new Marco_radio();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class Marco_radio extends JFrame{
    public Marco_radio(){
        setVisible(true);
        setBounds(550,300,400,400);
        Lamina_radio lamina = new Lamina_radio();
        add(lamina);
    }
}

class Lamina_radio extends JPanel{
    public Lamina_radio(){
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        /*texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        lamina_botones = new JPanel();
        migrupo = new ButtonGroup();
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 26);
        add(lamina_botones, BorderLayout.SOUTH);*/
        add(texto, BorderLayout.CENTER);
        ButtonGroup migrupo = new ButtonGroup();
        btn1 = new JRadioButton("Pequeño", false);
        btn2 = new JRadioButton("Mediano", true);
        btn3 = new JRadioButton("Grande", false);
        btn4 = new JRadioButton("Muy grande", false);
        JPanel lamina_radio = new JPanel();
        Evento_radio mievento = new Evento_radio();
        btn1.addActionListener(mievento);
        btn2.addActionListener(mievento);
        btn3.addActionListener(mievento);
        btn4.addActionListener(mievento);
        migrupo.add(btn1);
        migrupo.add(btn2);
        migrupo.add(btn3);
        migrupo.add(btn4);
        lamina_radio.add(btn1);
        lamina_radio.add(btn2);
        lamina_radio.add(btn3);
        lamina_radio.add(btn4);
        add(lamina_radio, BorderLayout.SOUTH);
        }
        private class Evento_radio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        if(e.getSource()== btn1){
        // System.out.println("Has pulsado el 1");
        texto.setFont(new Font("Serif",Font.PLAIN,10));
        }else if(e.getSource()== btn2){
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        }else if(e.getSource()== btn3){
        texto.setFont(new Font("Serif",Font.PLAIN,18));
        }else if(e.getSource()== btn4){
        texto.setFont(new Font("Serif",Font.PLAIN,12));
        }
        }
    }
    public void colocarBotones(String nombre, boolean seleccionado, int tamagno){
        JRadioButton btn = new JRadioButton(nombre,seleccionado);
        migrupo.add(btn);
        lamina_botones.add(btn);
        ActionListener mievento = (ActionEvent e) -> {
            texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
        };
        btn.addActionListener(mievento);
    }
    private JLabel texto;
    private JRadioButton btn1, btn2, btn3, btn4;
    private ButtonGroup migrupo;
    private JPanel lamina_botones;
}