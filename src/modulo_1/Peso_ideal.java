/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import javax.swing.*;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 20 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Peso_ideal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String genero="";
        do{
            genero=JOptionPane.showInputDialog("Introduce tu género(H/M)");
        }while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
            int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
            int pesoideal = 0;
                if(genero.equalsIgnoreCase("H")){
                    pesoideal = altura-110;
                }else if(genero.equalsIgnoreCase("M")){
                    pesoideal = altura-120;
                }
                System.out.println("Tu peso ideal es" + pesoideal);
    }
    
}
