/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import java.util.Scanner;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 48 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Uso_Tallas {
    
    //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    
    enum Talla {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        
        private Talla(String abrev){
            this.abrev = abrev;
        }
        
        public String getAbrev(){
            return abrev;
        }
        private String abrev;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        /*Talla s = Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;*/
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");
        String entrada_datos = entrada.next().toUpperCase();
        Talla talla = Enum.valueOf(Talla.class, entrada_datos);
        System.out.println("Talla = " + talla);
        System.out.println("Abreviatura = " + talla.getAbrev());
    }
    
}
