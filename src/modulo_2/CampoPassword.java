/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 89 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class CampoPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPassword miMarco = new MarcoPassword();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame{
    public MarcoPassword(){
        setBounds(400,300,550,400);
        LaminaPassword lamina = new LaminaPassword();
        add(lamina);
        setVisible(true);
    }
}

class LaminaPassword extends JPanel {
    public LaminaPassword(){
        setLayout(new BorderLayout());
        JPanel lamina_superior = new JPanel();
        lamina_superior.setLayout(new GridLayout(2,2));
        add(lamina_superior, BorderLayout.NORTH);
        JLabel etiqueta1 = new JLabel("Usuario");
        JLabel etiqueta2 = new JLabel("Contraseña");
        JTextField c_usuario = new JTextField(15);
        Comprueba_pass mi_evento = new Comprueba_pass();
        c_contra = new JPasswordField(15);
        c_contra.getDocument().addDocumentListener(mi_evento);
        lamina_superior.add(etiqueta1);
        lamina_superior.add(c_usuario);
        lamina_superior.add(etiqueta2);
        lamina_superior.add(c_contra);
        JButton enviar = new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);
    }
    
    private class Comprueba_pass implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            char [] contra;
            contra = c_contra.getPassword();
            if(contra.length<8 || contra.length>12){
                c_contra.setBackground(Color.red);
            } else {
                c_contra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            char [] contra;
            contra = c_contra.getPassword();
            if(contra.length<8 || contra.length>12){
                c_contra.setBackground(Color.red);
            } else {
                c_contra.setBackground(Color.WHITE);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
    JPasswordField c_contra;
}