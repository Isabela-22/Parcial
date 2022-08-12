/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 118,119,120,121 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class LibreDisposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoLibre mimarco=new MarcoLibre();        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}

class MarcoLibre extends JFrame{
    public MarcoLibre(){    
        setBounds(450,350,350,400);        
        LaminaLibre milamina=new LaminaLibre();        
        add(milamina);        
        setVisible(true);    
    }
    
class LaminaLibre extends JPanel{
    public LaminaLibre(){
        setLayout(new EnColumnas());        
        JLabel nombre=new JLabel("Nombre: ");        
        JLabel apellido=new JLabel("Apellido: ");        
        JLabel edad=new JLabel("Edad: ");        
        JLabel tfno=new JLabel("Telefono: ");        
        JTextField c_nombre=new JTextField();        
        JTextField c_apellido=new JTextField();        
        JTextField c_edad=new JTextField();        
        JTextField c_tfno=new JTextField();        
        /*nombre.setBounds(20,20,80,10);        
        c_nombre.setBounds(100,17,100,20);        
        apellido.setBounds(20,60,80,15);        
        c_apellido.setBounds(100,55,100,20);*/        
        add(nombre);        
        add(c_nombre);        
        add(apellido);        
        add(c_apellido);        
        add(edad);        
        add(c_edad);        
        add(tfno);        
        add(c_tfno);    
    }
}

class EnColumnas implements LayoutManager{
        @Override
        public void addLayoutComponent(String name, Component comp) {
        }
        @Override
        public void removeLayoutComponent(Component comp) {
        }
        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }
        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }
        @Override
        public void layoutContainer(Container micontenedor) {            
            int d = micontenedor.getWidth();            
            x = d/2;
            int contador = 0;            
            int n=micontenedor.getComponentCount();            
            for(int i=0; i<n; i++){            
                contador++;                
                Component c=micontenedor.getComponent(i);                
                c.setBounds(x, y, 100, 20);                
                x+=100;                
                if(contador%2 == 0){                
                    x = d/2;
                    y+=40;                
                }
            }
        }
        
        private int x;
        private int y=20;

}

}
