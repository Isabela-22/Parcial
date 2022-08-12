/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 57 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class CreandoMarcoCentrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCentrado miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoCentrado extends JFrame{
    public MarcoCentrado(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension sizePantalla = miPantalla.getScreenSize();
        int alturaPantalla = sizePantalla.height;
        int anchoPantalla = sizePantalla.width;
        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setTitle("- Marco Centrado -");
        Image miIcono = miPantalla.getImage("src/imagenes/iconn.png");
        setIconImage(miIcono);
        
        
    }
}
