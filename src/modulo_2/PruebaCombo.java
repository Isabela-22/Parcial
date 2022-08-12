/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 95 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class PruebaCombo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCombo miMarco = new MarcoCombo();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCombo extends JFrame{
    MarcoCombo(){
        setVisible(true);
        setBounds(550,300,550,400);
        LaminaCombo lamina = new LaminaCombo();
        add(lamina);
    }
}

class LaminaCombo extends JPanel{
    public LaminaCombo(){
        setLayout(new BorderLayout());
        texto = new JLabel("En un lugar de la Macha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);
        JPanel lamina_norte = new JPanel();
        micombo = new JComboBox();
        micombo.setEditable(true);
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");
        Evento_combo mievento = new Evento_combo();
        micombo.addActionListener(mievento);
        lamina_norte.add(micombo);
        add(lamina_norte, BorderLayout.NORTH);
    }
    private class Evento_combo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN,18));
        }
    }
    private JLabel texto;
    private JComboBox micombo;
}