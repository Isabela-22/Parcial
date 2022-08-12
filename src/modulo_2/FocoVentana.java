/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 75 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class FocoVentana extends JFrame implements WindowFocusListener {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FocoVentana ventana = new FocoVentana();
        ventana.iniciar();
    }
    
    public void iniciar(){
        marco1 = new FocoVentana();
        marco2 = new FocoVentana();
        marco1.setVisible(true);
        marco2.setVisible(true);
        marco1.setBounds(300,100,400,400);
        marco2.setBounds(700,100,400,400);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.addWindowFocusListener(this);
        marco2.addWindowFocusListener(this);
    }
    
    @Override
    public void windowGainedFocus(WindowEvent e) {
        if(e.getSource() == marco1){
            marco1.setTitle("¡Tengo el foco!");
        } else {
            marco2.setTitle("¡Tengo el foco!");
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        if(e.getSource() == marco1){
            marco1.setTitle("");
        } else {
            marco2.setTitle("");
        }
    }
    
    FocoVentana marco1;
    FocoVentana marco2;
}
