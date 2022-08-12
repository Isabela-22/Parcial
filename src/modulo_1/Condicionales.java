/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import java.util.Scanner;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 16,17 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduzca su edad, por favor");
       int edad=entrada.nextInt();
       if(edad<18){
           System.out.println("Eres un adolecente");
       }else if(edad<40){
           System.out.println("Eres joven");
       }else if(edad<65){
           System.out.println("Eres maduro");
       }else{
           System.out.println("Cuídate");
       }
    }
    
}
