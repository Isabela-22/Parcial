/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 63, 64 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaImagenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoImagen miMarco = new MarcoImagen();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("- Prueba con imágen -");
        setBounds(400,150,500,500);
        LaminaImagen miLamina = new LaminaImagen();
        add(miLamina);
    }
}

class LaminaImagen extends JPanel{
    public LaminaImagen(){
       try{
            imagen = ImageIO.read(new File("src/imagenes/icon1.jpg"));
        }
        catch(IOException e){
            System.out.println("La imagen no se encuentra");
        } 
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //File miImagen = new File("src/imagenes/icon1.jpg");
        
        int anchuraImagen = imagen.getWidth(this);
        int alturaImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0, 0, null);
        
        // Video 64
        for (int i=0; i<500; i++){
            for (int j=0; j<500; j++){
                if(i+j>0){
                g.copyArea(0, 0 , anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
                }
            }
        }
    }
    private Image imagen;
}