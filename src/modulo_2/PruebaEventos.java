/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 65,66 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBotones miMarco = new MarcoBotones();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones extends JFrame{
    public MarcoBotones(){
        setTitle("- Botones y Eventos -");
        setBounds(400,150,500,500);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener{
    JButton btnRosa = new JButton("Rosa");
    JButton btnGris = new JButton("Gris");
    JButton btnBlanco = new JButton("Blanco");
    public LaminaBotones(){
        add(btnRosa);
        add(btnGris);
        add(btnBlanco);
        btnRosa.addActionListener(this);
        btnGris.addActionListener(this);
        btnBlanco.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Object btnPulsado=e.getSource();
        if(btnPulsado == btnRosa){
            setBackground(Color.pink);
        } else if (btnPulsado == btnGris){
            setBackground(Color.DARK_GRAY);
        } else {
            setBackground(Color.WHITE);
        }
    }
    
    
}
