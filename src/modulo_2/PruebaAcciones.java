/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 76, 77, 78,79  - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class PruebaAcciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoAccion miMarco = new MarcoAccion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoAccion extends JFrame{
    public MarcoAccion(){
        setTitle("- Prueba Acciones -");
        setBounds(400,100,400,400);
        PanelAccion lamina = new PanelAccion();
        add(lamina);
    }
}

class PanelAccion extends JPanel{
    public PanelAccion(){
        /*JButton btnRosa = new JButton("Rosa");
        JButton btnGris = new JButton("Gris");
        JButton btnBlanco = new JButton("Blanco");
        
        add(btnRosa);
        add(btnGris);
        add(btnBlanco);*/
       
       //Video 77
       AccionColor accionRosa = new AccionColor("Rosa", new ImageIcon("src/imagenes/pinkbtn1.png"), Color.PINK);
       AccionColor accionGris = new AccionColor("Gris", new ImageIcon("src/imagenes/greybtn1.png"), Color.darkGray);
       AccionColor accionBlanco = new AccionColor("Blanco", new ImageIcon("src/imagenes/whitnebtn1.png"), Color.white);
       
       //Video 78
       add(new JButton(accionRosa));
       add(new JButton(accionGris));
       add(new JButton(accionBlanco));
       
       //video 79
       InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
       //KeyStroke teclarosado = KeyStroke.getKeyStroke("ctrl A");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rosa");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl G"), "fondo_gris");
       mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_blanco");
       
       ActionMap mapaAccion = getActionMap();
       mapaAccion.put("fondo_rosa", accionRosa);
       mapaAccion.put("fondo_gris", accionGris);
       mapaAccion.put("fondo_blanco", accionBlanco);
    }
    
    //Video 77 
class AccionColor extends AbstractAction{
    public AccionColor(String nombre, Icon icono, Color color_boton){
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
        putValue("color_de_fondo", color_boton);
    }
    
    //Video 78
    public void actionPerformed (ActionEvent e){
        Color c = (Color)getValue("color_de_fondo");
        setBackground(c);
        System.out.println("Nombre: " + getValue(Action.NAME));
    }
}
}

