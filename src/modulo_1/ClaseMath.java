/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 9, 10 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double base = 5;
       double exponente = 3;
       int resultado = (int)Math.pow(base, exponente);
       System.out.print("El resultado de " + base + "elevado a " + exponente + " es " + resultado);
    }
    
}
