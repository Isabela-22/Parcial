/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 115 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class PruebaDisposiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCaja mimarco=new MarcoCaja();        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        mimarco.setVisible(true);
    }
}

class MarcoCaja extends JFrame{
    public MarcoCaja(){    
    setTitle("Marco en la caja");    
    setBounds(600,360,200,200);    
    JLabel rotulo1=new JLabel("Nombre");    
    JTextField texto1=new JTextField(10);    
    texto1.setMaximumSize(texto1.getPreferredSize());    
    Box cajaH1=Box.createHorizontalBox();    
    cajaH1.add(rotulo1);    
    cajaH1.add(Box.createVerticalStrut(10));    
    cajaH1.add(texto1);    
    JLabel rotulo2=new JLabel("Contraseña");    
    JTextField texto2=new JTextField(10);    
    texto2.setMaximumSize(texto2.getPreferredSize());    
    Box cajaH2=Box.createHorizontalBox();    
    cajaH2.add(rotulo2);    
    cajaH2.add(Box.createHorizontalStrut(10));    
    cajaH2.add(texto2);    
    JButton boton1=new JButton("OK");    
    JButton boton2=new JButton("Cancelar");    
    Box cajaH3=Box.createHorizontalBox();    
    cajaH3.add(boton1);    
    cajaH3.add(Box.createGlue());    
    cajaH3.add(boton2);    
    Box cajaVertical=Box.createVerticalBox();    
    cajaVertical.add(cajaH1);    
    cajaVertical.add(cajaH2);    
    cajaVertical.add(cajaH3);    
    add(cajaVertical,BorderLayout.CENTER);
    }    
}
