/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 86, 87 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class PruebaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setBounds(600,200,600,350);
        LaminaTexto lamina = new LaminaTexto();
        add(lamina);
        setVisible(true);
    }
}

class LaminaTexto extends JPanel{
    public LaminaTexto(){
        setLayout(new BorderLayout());
        JPanel lamina2 = new JPanel();
        lamina2.setLayout(new FlowLayout());
        resultado = new JLabel("", JLabel.CENTER);
        JLabel texto1 = new JLabel("E-mail: ");
        lamina2.add(texto1);
        txt1 = new JTextField(20);
        lamina2.add(txt1);
        add(resultado, BorderLayout.CENTER);
        JButton btn1 = new JButton("Comprobar");
        DameTexto evento = new DameTexto();
        btn1.addActionListener(evento);
        lamina2.add(btn1);
        add(lamina2, BorderLayout.NORTH);
    }
    private class DameTexto implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int correcto = 0;
            String email =txt1.getText().trim();
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)=='@'){
                    correcto++;
                }
            }
            if(correcto!=1){
                resultado.setText("Incorrecto");
            } else {
                resultado.setText("Correcto");
            }
            //System.out.println(txt1.getText().trim());
        }
    }
    private JTextField txt1;
    private JLabel resultado;
}
