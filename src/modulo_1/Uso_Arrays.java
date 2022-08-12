/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 23 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Uso_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int[] mi_matriz=new int[5];
        mi_matriz[0]=22;
        mi_matriz[1]=21;
        mi_matriz[2]=1;
        mi_matriz[3]=97;
        mi_matriz[4]=31;*/
        int[] mi_matriz={22,21,31,97,1,13,7,9};
        for(int i=0;i<mi_matriz.length;i++){
            //System.out.println(mi_matriz[i]);
            System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
        }
    }
}
