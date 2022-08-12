/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 83, 84, 85 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoCalculadora miMarco = new MarcoCalculadora();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    } 
}

class MarcoCalculadora extends JFrame{
    public MarcoCalculadora(){
        setTitle("- Calculadora -");
        setBounds(500, 200, 450, 300);
        LaminaCalculadora lamina = new LaminaCalculadora();
        add(lamina);
        //pack();
    }
}

class LaminaCalculadora extends JPanel{
    public LaminaCalculadora(){
        principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4,4));
        ActionListener insertar = new InsertaNumero();
        ActionListener orden = new AccionOrden();
        
        ponerbtn("7", insertar);
        ponerbtn("8", insertar);
        ponerbtn("9", insertar);
        ponerbtn("/", orden);
        ponerbtn("4", insertar);
        ponerbtn("5", insertar);
        ponerbtn("6", insertar);
        ponerbtn("*", orden);
        ponerbtn("1", insertar);
        ponerbtn("2", insertar);
        ponerbtn("3", insertar);
        ponerbtn("-", orden);
        ponerbtn("0", insertar);
        ponerbtn(".", insertar);
        ponerbtn("=", orden);
        ponerbtn("+", orden);
        add(lamina2, BorderLayout.CENTER);
        ultimaOperacion = "=";
        
        /*        JButton btn1 = new JButton("1");
        lamina2.add(btn1);
        JButton btn2 = new JButton("2");
        lamina2.add(btn2);
        JButton btn3 = new JButton("3");
        lamina2.add(btn3);
        JButton btn4 = new JButton("4");
        lamina2.add(btn4);
        JButton btn5 = new JButton("5");
        lamina2.add(btn5);
        JButton btn6 = new JButton("6");
        lamina2.add(btn6);
        JButton btn7 = new JButton("7");
        lamina2.add(btn7);
        JButton btn8 = new JButton("8");
        lamina2.add(btn8);
        JButton btn9 = new JButton("9");
        lamina2.add(btn9);
        JButton btnIgual = new JButton("=");
        lamina2.add(btnIgual);
        JButton btnMultip = new JButton("*");
        lamina2.add(btnMultip);
        JButton btnSumar = new JButton("+");
        lamina2.add(btnSumar);
        JButton btnRestar = new JButton("-");
        lamina2.add(btnRestar);
        JButton btnComa = new JButton(".");
        lamina2.add(btnComa);
        JButton btnDiv = new JButton("/");
        lamina2.add(btnDiv);
        JButton btnx = new JButton("");
        lamina2.add(btnx);*/
    }
    private void ponerbtn(String rotulo, ActionListener oyente){
        JButton btn = new JButton(rotulo);
        btn.addActionListener(oyente);
        lamina2.add(btn);
    }
    private class InsertaNumero implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String entrada = e.getActionCommand();
            if(principio){
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada);
        }
    }
    
    private class AccionOrden implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion = operacion;
            principio = true;
        }
        public void calcular(double x){
            if(ultimaOperacion.equals("+")){
                resultado +=x;
            } else if (ultimaOperacion.equals("-")){
                resultado -=x;
            } else if (ultimaOperacion.equals("*")){
                resultado *=x;
            }else if (ultimaOperacion.equals("/")){
                resultado /=x;
            }else if (ultimaOperacion.equals("=")){
                resultado = x;
            }
            pantalla.setText("" + resultado);
        }
    }
    
    private JPanel lamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperacion;
}
