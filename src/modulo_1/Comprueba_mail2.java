/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 22 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Comprueba_mail2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arroba=0;
        boolean punto=false;
        String mail=JOptionPane.showInputDialog("Introduce mail");
        for(int i=0;i<mail.length();i++){
            if(mail.charAt(i)=='@'){
            arroba ++;
            }
            if(mail.charAt(i)=='.'){
            punto=true;
            }
        }
        if(arroba ==1 && punto == true){
            System.out.println("Es correcto");
        }else{
            System.out.println("Es correcto");
        }
    }
}
