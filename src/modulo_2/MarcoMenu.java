/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 100 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class MarcoMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuFrame mimarco = new MenuFrame();
        mimarco.setVisible(true);
    }
}

class MenuFrame extends JFrame{
    public MenuFrame(){
        setBounds(500,300,550,400);
        MenuLamina milamina = new MenuLamina();
        add(milamina);
        setVisible(true);  
    }
}

class MenuLamina extends JPanel{
    public MenuLamina(){
        JMenuBar mibarra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar Como");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        opciones.add(opcion1);
        opciones.add(opcion2);
        archivo.add(guardar);
        archivo.add(guardar_como);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.addSeparator();
        edicion.add(opciones);
        herramientas.add(generales);
        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        add(mibarra);
    }
}