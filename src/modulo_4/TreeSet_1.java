/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 186-188 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class TreeSet_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Articulo primero=new Articulo(1, "Primer articulo");        
        Articulo segundo=new Articulo(2, "Segundo articulo");        
        Articulo tercer=new Articulo(3, "Tercero articulo");        
        TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();        
        ordenaArticulos.add(tercer);        
        ordenaArticulos.add(primero);        
        ordenaArticulos.add(segundo); 
        
        for(Articulo art: ordenaArticulos){            
           System.out.println(art.getDescripcion());            
        }        
        Articulo comparadorArticulos=new Articulo();        
        TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);        
        ordenaArticulos2.add(primero);        
        ordenaArticulos2.add(segundo);        
        ordenaArticulos2.add(tercer);
        
        for(Articulo art: ordenaArticulos2){        
            System.out.println(art.getDescripcion());            
        }    
    }    
}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{    
    public Articulo(){}
    public Articulo(int num, String desc){    
        numero_articulo=num;        
        descripcion=desc;        
    }

    @Override
    public int compareTo(Articulo o) {        
        return numero_articulo - o.numero_articulo;        
    }
    
    public String getDescripcion(){        
        return descripcion;        
    }
    
        private int numero_articulo;        
        private String descripcion;

    @Override
    public int compare(Articulo arg0, Articulo arg1) {        
        String descripcionA=arg0.getDescripcion();        
        String descripcionB=arg0.getDescripcion();        
        return descripcionA.compareTo(descripcionB);
    }
    
}

