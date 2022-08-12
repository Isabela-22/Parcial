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
 * Video 67 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaEventos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBotones2 miMarco = new MarcoBotones2();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoBotones2 extends JFrame{
    public MarcoBotones2(){
        setTitle("- Botones y Eventos -");
        setBounds(400,150,500,500);
        LaminaBotones2 miLamina = new LaminaBotones2();
        add(miLamina);
    }
}

class LaminaBotones2 extends JPanel{
    JButton btnRosa = new JButton("Rosa");
    JButton btnGris = new JButton("Gris");
    JButton btnBlanco = new JButton("Blanco");
    public LaminaBotones2(){
        add(btnRosa);
        add(btnGris);
        add(btnBlanco);
        ColorFondo rosa = new ColorFondo(Color.PINK);
        ColorFondo gris = new ColorFondo(Color.DARK_GRAY);
        ColorFondo blanco = new ColorFondo(Color.WHITE);
        btnRosa.addActionListener(rosa);
        btnGris.addActionListener(gris);
        btnBlanco.addActionListener(blanco);
    }  
    private class ColorFondo implements ActionListener{
        public ColorFondo(Color c){
            colorDeFondo=c;
        }
    
        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo);
        }
        private Color colorDeFondo;
    }
}



