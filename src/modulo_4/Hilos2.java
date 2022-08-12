/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 168-178 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Hilos2 {

    public static void main(String[] args) {
        // TODO code application logic here        
        HilosVarios hilo1=new HilosVarios();        
        HilosVarios2 hilo2=new HilosVarios2(hilo1);        
        hilo2.start();        
        hilo1.start();        
        System.out.println("Terminadas las tareas");
    }    
}

class HilosVarios extends Thread{
    public void run(){    
        for(int i=0;i<15;i++){        
            System.out.println("Ejecutando hilo" + getName());            
            try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }        
        }    
    }
}

class HilosVarios2 extends Thread{    
    public HilosVarios2(Thread hilo){    
        this.hilo=hilo;    
    }

    public void run(){        
        try {
            hilo.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }    
        for(int i=0;i<15;i++){        
            System.out.println("Ejecutando hilo" + getName());            
            try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }        
        }    
    }
    
    private Thread hilo;
}