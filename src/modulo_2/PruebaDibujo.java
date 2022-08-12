/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_2;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 59, 60 - Módulo 2 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 * Continuación de Interfaces y clases internas. 
 */ 
public class PruebaDibujo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoDibujo miMarco = new MarcoDibujo();
        miMarco.setVisible(true);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoDibujo extends JFrame{
    public MarcoDibujo(){
        setTitle("- Prueba de Dibujo -");
        setSize(400,400);
        LaminaFiguras miLamina = new LaminaFiguras();
        add(miLamina);
    }
}

class LaminaFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Video 59
        //g.drawRect(50, 50, 200, 200);
        //g.drawLine(100, 100, 300, 200);
        //g.drawArc(60, 100, 100, 200, 120, 150);
        
        //Video 60
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        double CentroenX = rectangulo.getCenterX();
        double CentroenY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
        g2.draw(circulo);
    }
}
