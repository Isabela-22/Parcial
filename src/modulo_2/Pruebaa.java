/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 88 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Pruebaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPrueba miMarco = new MarcoPrueba();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoPrueba extends JFrame{
    public MarcoPrueba(){
        setBounds(500,300,500,350);
        LaminaPrueba lamina = new LaminaPrueba();
        add(lamina);
        setVisible(true);
    }
}

class LaminaPrueba extends JPanel{
    public LaminaPrueba(){
        EscuchaTexto el_evento = new EscuchaTexto();
        JTextField campo1 = new JTextField(20);
        Document midoc = campo1.getDocument();
        midoc.addDocumentListener(el_evento);
        add(campo1);
    }
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has insertado un texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
        
    }
}

