/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 90 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class EjemploArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoArea miMarco = new MarcoArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoArea extends JFrame{
    public MarcoArea() {
        setBounds(500,300,500,350);
        LaminaArea lamina = new LaminaArea();
        add(lamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel{
    public LaminaArea(){
        area = new JTextArea(8,20);
        JScrollPane laminaBarras = new JScrollPane(area);
        //area.setLineWrap(true);
        add(laminaBarras);
        JButton btn1 = new JButton("Ok");
        btn1.addActionListener(new GestionaArea());
        add(btn1);
    }
    private class GestionaArea implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println(area.getText());
        }
    }
    private JTextArea area;
}
