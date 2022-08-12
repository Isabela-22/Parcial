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

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 80 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Varios_oyentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_Principal miMarco = new Marco_Principal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class Marco_Principal extends JFrame{
    public Marco_Principal(){
        setTitle("- Prueba varios -");
        setBounds(400,100,400,400);
        Lamina_principal lamina = new Lamina_principal();
        add(lamina);
    }
}

class Lamina_principal extends JPanel{
    public  Lamina_principal(){
        JButton btnNuevo = new JButton("Nuevo");
        add(btnNuevo);
        btnCerrar = new JButton("Cerrar todo");
        add(btnCerrar);
        OyenteNuevo miOyente = new OyenteNuevo();
        btnNuevo.addActionListener(miOyente);
    }
    private class OyenteNuevo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Marco_Emergente marco = new Marco_Emergente(btnCerrar);
            marco.setVisible(true);
        }
    }
    JButton btnCerrar;
    
}

class Marco_Emergente extends JFrame{
    public Marco_Emergente(JButton btnPrincipal){
        contador++;
        setTitle("Ventana " + contador);
        setBounds(40*contador, 40*contador, 400,350);
        CierraTodos oyenteCerrar = new CierraTodos();
        btnPrincipal.addActionListener(oyenteCerrar);
    }
    
    private class CierraTodos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            dispose();
        }
    }
    private static int contador=0;
}