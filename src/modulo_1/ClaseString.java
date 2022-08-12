/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 11, 12 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Isabela";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras");
        System.out.println("La primera letra de " + nombre +" es la " + nombre.charAt(0));
        int ultima_letra;
        ultima_letra = nombre.length();
        
        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
    }
    
}
