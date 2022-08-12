/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 18 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
import javax.swing.*;
public class Acceso_aplicacion{
    public static void main(String[]args){
        // TODO Auto-generated method slub
        String clave="Isabela";
        String pass="";
        while(clave.equals(pass)== false){
        
            pass=JOptionPane.showInputDialog("Introduce la contraseña,por favor");
            
            if(clave.equals(pass)== false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta.Acceso permitido");
    }
}
