/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 184-185 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class ListaLinked2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LinkedList<String> paises=new LinkedList<String>();
        
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");
        
        LinkedList<String> capitales=new LinkedList<String>();
        
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");
        
        //System.out.println(paises);
        //System.out.println(capitales);
        
        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();
        
        while(iterB.hasNext()){        
            if(iterA.hasNext()){            
                iterA.next();                
            }            
            iterA.add(iterB.next());        
        }
        
        System.out.println(paises);        
        iterB=capitales.listIterator();        
        while(iterB.hasNext()){        
            iterB.next();            
            if(iterB.hasNext()){            
                iterB.next();                
                iterB.remove();            
            }
        }
        
        System.out.println(capitales);        
        paises.removeAll(capitales);        
        System.out.println(paises);        
    }    
}
