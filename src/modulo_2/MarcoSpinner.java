/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 98,99 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */
public class MarcoSpinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrameSpinner mimarco = new FrameSpinner();
        mimarco.setVisible(true);
    }
}

class FrameSpinner extends JFrame{
    public FrameSpinner(){
        setBounds(550,350,550,350);
        setVisible(true);
        add(new LaminaSpinner());
    }
}

class LaminaSpinner extends JPanel{
    public LaminaSpinner(){
        //String lista[] = {"Enero", "Febrero", "Marzo", "Abril"};
        //String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailanleFontFamilyNames();
        JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1){
            public Object getNextValue(){
               return super.getPreviousValue();
            }
            public Object getPreviousValue(){
               return super.getNextValue();
            }
        });
        
        //JSpinner control = new JSpinner(new MiModeloJSpinner());
        Dimension d = new Dimension(200,20);
        control.setPreferredSize(d);
        add(control);
    }
    //video 99 
    /*private class MiModeloJSpinner extends SpinnerNumberModel{
    public MiModeloJSpinner(){
    super(5,0,10,1);
    }
    public Object getNextValue(){
    return super.getPreviousValue();
    }
    public Object getPreviousValue(){
    return super.getNextValue();
    }
    }*/
}