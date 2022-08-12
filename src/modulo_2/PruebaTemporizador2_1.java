/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 54 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaTemporizador2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj2 mireloj = new Reloj2 ();
        mireloj.enMarcha2(3000,true);
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class Reloj2{
    
    public void enMarcha2(int intervalo, final boolean sonido){
        class DameLaHora2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Date ahora = new Date();
            System.out.println("Hora cada 3 segundos: " + ahora);
            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();
    }
    
}
