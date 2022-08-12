/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 101 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Procesador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuProcesador mimarco=new MenuProcesador();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador extends JFrame{
    public MenuProcesador(){    
    setBounds(500,300,550,400);    
    LaminaProcesador milamina=new LaminaProcesador();    
    add(milamina);    
    setVisible(true);
    }   
}

class LaminaProcesador extends JPanel{
    public LaminaProcesador(){    
    setLayout(new BorderLayout());    
    JPanel laminamenu = new JPanel();    
    JMenuBar mibarra = new JMenuBar();    
    JMenu fuente = new JMenu("Fuente");    
    JMenu estilo = new JMenu("Estilo");    
    JMenu tamagno = new JMenu("Tamano");
    JMenuItem arial = new JMenuItem("Arial");    
    arial.addActionListener(new ActionListener(){    
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Arial",Font.PLAIN,12));
        }    
    });    
    JMenuItem courier = new JMenuItem("Courier");    
    courier.addActionListener(new ActionListener(){    
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Courier",Font.PLAIN,12));
        }
    }); 
    JMenuItem verdana=new JMenuItem("Verdana");    
    verdana.addActionListener(new ActionListener(){    
        public void actionPerformed(ActionEvent e) {
           miarea.setFont(new Font("Verdana",Font.PLAIN,12));
        }    
    });    
    fuente.add(arial);    
    fuente.add(courier);    
    fuente.add(verdana);
    
    JMenuItem negrita = new JMenuItem("Negrita");    
    JMenuItem cursiva = new JMenuItem("Cursiva");    
    fuente.add(negrita);    
    fuente.add(cursiva);
    JMenuItem tam12 = new JMenuItem("12");    
    JMenuItem tam16 = new JMenuItem("16");    
    JMenuItem tam20 = new JMenuItem("20");    
    JMenuItem tam24 = new JMenuItem("24");    
    fuente.add(tam12);    
    fuente.add(tam16);    
    fuente.add(tam20);    
    fuente.add(tam24);
    mibarra.add(fuente);    
    mibarra.add(estilo);    
    mibarra.add(tamagno);    
    laminamenu.add(mibarra);    
    add(laminamenu,BorderLayout.NORTH);    
    miarea=new JTextPane();    
    add(miarea,BorderLayout.CENTER);    
    }   
    JTextPane miarea;  
}
