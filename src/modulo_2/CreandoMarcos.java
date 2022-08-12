/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 55, 56 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class CreandoMarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Marco marco1 = new Marco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}

class Marco extends JFrame{
    public Marco(){
        //setSize(300,300);
        //setLocation(500,5000);
        //setResizable(false);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setBounds(520,250,300,300);
        setTitle("- Ventana -");
    }
}
