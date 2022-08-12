/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;
import javax.swing.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 22 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Long resultado=1L;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }
        System.out.println("El factorial de" + numero + " es " + resultado);
    }
}
