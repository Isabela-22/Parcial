/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*@author Isabela Rosero Obando - 202128720 - 3743
 * Video 168-178 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */

public class Hilos1 {
    public static void main(String[] args) {
        // TODO code application logic here    
        JFrame marco=new MarcoRebote();        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        marco.setVisible(true);    
    }    
}

class PelotaHilos implements Runnable{    
    public PelotaHilos (Pelota unaPelota, Component unComponente){    
        pelota=unaPelota;        
        componente=unComponente;    
    }
    
    public void run(){        
        System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());    
        //for(int i=1; 1<3000; i++){        
        //while(!Thread.interrupted()){        
        while(!Thread.currentThread().isInterrupted()){        
            pelota.mueve_pelota(componente.getBounds());            
            componente.paint(componente.getGraphics());            
            try{
                Thread.sleep(4);
            } catch (InterruptedException e){
                //e.printStackTrace();
                //System.out.println("Hilo bloqueado. Imposible su interrupcion");
                //System.exit(0);
                Thread.currentThread().interrupt();
            }            
        }
        System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
    }    
    private Pelota pelota;    
    private Component componente;
}
//Movimiento de la pelota
class Pelota{
    //Mueve la pelota invirtiendo posicion si choca con limites    
    public void mueve_pelota(Rectangle2D limites){  
        x+=dx;        
        y+=dy;        
        if(x<limites.getMinX()){        
            x=limites.getMinX();            
            dx=-dx;        
        }        
        if(x + TAMX>=limites.getMaxX()){        
            x=limites.getMaxX() - TAMX;            
            dx=-dx;        
        }        
        if(y<limites.getMinY()){        
            y=limites.getMinY();            
            dy=-dy;            
        }        
        if(y + TAMY>=limites.getMaxY()){        
            y=limites.getMaxY()-TAMY;            
            dy=-dy;        
        }        
    }

    //Forma de la pelota en su posicion inicial
    
    public Ellipse2D getShape(){    
        return new Ellipse2D.Double(x,y,TAMX,TAMY);    
    }    
    private static final int TAMX=15;    
    private static final int TAMY=15;    
    private double x=0;    
    private double y=0;    
    private double dx=0;    
    private double dy=0;    
}

// Lamina que dibuja las pelotas
class LaminaPelota extends JPanel{
    //Se añade la pelota a la lamina    
    public void add(Pelota b){    
        pelotas.add(b);    
    }
    
    public void paintComponent(Graphics g){    
        super.paintComponent(g);        
        Graphics2D g2=(Graphics2D)g;        
        for(Pelota b: pelotas){        
            g2.fill(b.getShape());        
        }    
    }
    
    private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}

class MarcoRebote extends JFrame{
    public MarcoRebote(){    
        setBounds(600,300,400,350);        
        setTitle("Rebotes");        
        lamina=new LaminaPelota();        
        add(lamina, BorderLayout.CENTER);        
        JPanel laminaBotones=new JPanel();    
        arranca1=new JButton("Hilo1");        
        arranca1.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                comienza_el_juego(evento);            
            }       
        });        
        laminaBotones.add(arranca1);
        
        arranca2=new JButton("Hilo2");        
        arranca2.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                comienza_el_juego(evento);            
            }        
        });        
        laminaBotones.add(arranca2);
        
        arranca3=new JButton("Hilo3");        
        arranca2.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                comienza_el_juego(evento);            
            }        
        });        
        laminaBotones.add(arranca3); 
        
        detener1=new JButton("Detener1");        
        detener1.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                detener(evento);
            }        
        });
        
        laminaBotones.add(detener1);        
        detener2=new JButton("Detener2");        
        detener2.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                detener(evento);
            }        
        });
        
        laminaBotones.add(detener3);        
        detener3=new JButton("Detener3");        
        detener3.addActionListener(new ActionListener(){        
            public void actionPerformed(ActionEvent evento){            
                detener(evento);
            }        
        });
        
        laminaBotones.add(detener3);

    }
    
    //Se añade pelota y la bota 1000 veces
    
    public void comienza_el_juego(ActionEvent e){    
        Pelota pelota=new Pelota();        
        lamina.add(pelota);        
        Runnable r=new PelotaHilos(pelota, lamina);        
        //Thread t=new Thread(r);        
        if(e.getSource().equals(arranca1)){        
            t1=new Thread(r);        
            t1.start();        
        }else if(e.getSource().equals(arranca2)){            
            t2=new Thread(r);        
            t2.start();
        }else if(e.getSource().equals(arranca3)){            
            t3=new Thread(r);        
            t3.start();
        }
    
    }
    
    public void detener(ActionEvent e){    
        //t.stop();
        if(e.getSource().equals(detener1)){            
        t1.interrupt();        
        }else if(e.getSource().equals(detener2)){            
        t2.interrupt();        
        }else if(e.getSource().equals(detener3)){            
        t3.interrupt();        
        }    
    }
    
    Thread t1,t2,t3;    
    JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;    
    private LaminaPelota lamina;
}