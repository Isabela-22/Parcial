/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;

/**
 *
 * /*@author Isabela Rosero Obando - 202128720 - 3743
 * Video 109 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class MarcoMEmergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoEmergenteM mimarco=new MarcoEmergenteM();        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEmergenteM extends JFrame{
    public MarcoEmergenteM(){    
        setBounds(100,100,300,250);    
        LaminaEmergenteM milamina=new LaminaEmergenteM();    
        add(milamina);    
        setVisible(true);    
    }
}

class LaminaEmergenteM extends JPanel{
    public LaminaEmergenteM(){        
        setLayout(new BorderLayout());        
        JPanel laminamenu=new JPanel();        
        JMenuBar mibarra=new JMenuBar();        
        JMenu fuente=new JMenu("Fuente");        
        JMenu estilo=new JMenu("Estilo");        
        JMenu tamagno=new JMenu("Tamaño");        
        mibarra.add(fuente);        
        mibarra.add(estilo);        
        mibarra.add(tamagno);        
        laminamenu.add(mibarra);        
        add(laminamenu, BorderLayout.NORTH);        
        JTextPane miarea=new JTextPane();        
        add(miarea, BorderLayout.CENTER);         
    
        JPopupMenu emergente=new JPopupMenu();        
        JMenuItem opcion1=new JMenuItem("opcion 1");        
        JMenuItem opcion2=new JMenuItem("opcion 2");        
        JMenuItem opcion3=new JMenuItem("opcion 3");        
        emergente.add(opcion1);        
        emergente.add(opcion2);        
        emergente.add(opcion3);        
        miarea.setComponentPopupMenu(emergente);    
    }
}