/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 91 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class PruebaArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPruebaArea miMarco = new MarcoPruebaArea();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoPruebaArea extends JFrame{
    public MarcoPruebaArea(){
        setTitle("Probando Área de texto");
        setBounds(500,300,500,350);
        setLayout(new BorderLayout());
        laminaBotones = new JPanel();
        btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                areaTexto.append("Soñar no te servirá de nada si olvidas vivir ");
            }
        });
        laminaBotones.add(btnInsertar);
        btnSaltoLinea = new JButton("Salto línea");
        btnSaltoLinea.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                boolean saltar =! areaTexto.getLineWrap();
                areaTexto.setLineWrap(saltar);
                /*if(saltar){
                btnSaltoLinea.setText("Quitar salto");
                } else {
                btnSaltoLinea.setText("Salto Línea");
                }*/
                btnSaltoLinea.setText(saltar ? "Quitar salto" : "Salto Linea");
            }
        });
        laminaBotones.add(btnSaltoLinea);
        add(laminaBotones, BorderLayout.SOUTH);
        areaTexto = new JTextArea(8,20);
        laminaConBarras = new JScrollPane(areaTexto);
        add(laminaConBarras, BorderLayout.CENTER);
    }
    private JPanel laminaBotones;
    private JButton btnInsertar, btnSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}
