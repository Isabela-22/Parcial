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
public class ListaLinked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> personas=new LinkedList<String>();        
        personas.add("Pepe");        
        personas.add("Sandra");        
        personas.add("Ana");        
        personas.add("Laura");        
        System.out.println(personas.size());        
        ListIterator<String> it=personas.listIterator();        
        it.next();        
        it.add("Juan");        
        for(String persona : personas){        
            System.out.println(persona);     
        }
    }    
}
