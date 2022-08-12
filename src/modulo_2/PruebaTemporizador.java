/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 52 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaTemporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DameLaHora oyente = new DameLaHora();
        //ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class DameLaHora implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Date ahora = new Date();
        System.out.println("Hora cada 5 segundos: " + ahora);
        Toolkit.getDefaultToolkit().beep();
    }
}
