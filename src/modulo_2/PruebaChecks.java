/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 92 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class PruebaChecks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCheck miMarco = new MarcoCheck();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCheck extends JFrame{
    public MarcoCheck(){
        setTitle("Prueba checkss");
        setBounds(550,300,550,350);
        LaminaCheck lamina = new LaminaCheck();
        add(lamina);
    }
}

class LaminaCheck extends JPanel {
    public LaminaCheck(){
        
        setLayout(new BorderLayout());
        Font letra = new Font("Serif", Font.PLAIN, 24);
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        System.out.println("Hola");
        texto.setFont(letra);
        JPanel laminaTexto = new JPanel();
        laminaTexto.add(texto);
        add(laminaTexto, BorderLayout.CENTER);
        check1 = new JCheckBox("Negrita");
        check2 = new JCheckBox("Cursiva");
        check1.addActionListener(new ManejaChecks());
        check2.addActionListener(new ManejaChecks());
        JPanel laminachecks = new JPanel();
        laminachecks.add(check1);
        laminachecks.add(check2);
        add(laminachecks, BorderLayout.SOUTH);
    }
    private class ManejaChecks implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int tipo = 0;
            if(check1.isSelected()) tipo+=Font.BOLD;
            if(check2.isSelected()) tipo+=Font.ITALIC;
            texto.setFont(new Font("Serif", tipo, 24));
        }
    }
    private JCheckBox check1, check2;
    private JLabel texto;
}