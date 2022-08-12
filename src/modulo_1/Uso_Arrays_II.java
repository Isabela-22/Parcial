/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 24 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Uso_Arrays_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //String[]paises={"Estado Unidos", "Canadá", "México", "Panamá", "Haití", "Jamaica", "Perú", "República Dominicana", "Cuba", "Caribe", "Groenlandia", "El Salvador", "Puerto Rico", "Colombia", "Venezuela", "Honduras", "Guayana"};
        String[]paises=new String[8];
        for(int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce país " + (i+1));
        }
        for (String elemento:paises){
            System.out.println("País: "+ elemento);
        }
        
        //Otro ejemplo 
        
        /*int[]matriz_aleatorios=new int[150];
        for(int i=0;i<matriz_aleatorios.length;i++){
        matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
        }
        for(int numeros:matriz_aleatorios){
        System.out.print(numeros + " ");
        }*/
    }
    
}
