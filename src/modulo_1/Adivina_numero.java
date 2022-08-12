/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;
import java.util.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 19 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Adivina_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio=(int)(Math.random()*100);
        Scanner entrada=new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio){
            intentos++;               
            System.out.println("Introduce un número,por favor");
            numero=entrada.nextInt();
            if(aleatorio<numero){
                System.out.println("Más bajo");
            } else if(aleatorio>numero){
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
    }
    
}
