/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import java.util.Scanner;

/**
 *
 *@author Isabela Rosero Obando - 202128720 - 3743
 * Video 14, 15 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class EntradaSalida_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       System.out.print("Introduce tu nombre, por favor ");
       String nombre_usuario = entrada.nextLine();
       System.out.println("Introduce edad, por favor ");
       int edad = entrada.nextInt();
       System.out.print("Hola " + nombre_usuario + " El agnio que viene tendras " + (edad+1) + " agnios");
    }
    
}
