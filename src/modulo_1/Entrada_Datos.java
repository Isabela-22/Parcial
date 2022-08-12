/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 14, 15 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Entrada_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        double num2 = Double.parseDouble(num1);        
        System.out.print("La raiz de " + num2 + "es ;");
        System.out.printf("%1.2f", Math.sqrt(num2));
    }
    
}
