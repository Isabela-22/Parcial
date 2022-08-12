/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 165 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Pareja_CG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pareja<String> una=new Pareja<String>();        
        una.setPrimero("Juan");        
        System.out.println(una.getPrimero());        
        Persona pers1=new Persona("Ana");        
        Pareja<Persona> otra=new Pareja<Persona>();        
        otra.setPrimero(pers1);        
        System.out.println(otra.getPrimero());
    }   
}

class Pareja<T> {
    
    public Pareja(){    
        primero=null;    
    }
    
    public void setPrimero(T nuevoValor){    
        primero=nuevoValor;    
    }
    
    public T getPrimero(){    
        return primero;    
    }
    
    private T primero;    
}


class Persona{
    public Persona(String nombre){    
        this.nombre=nombre;    
    }
    
    public String toString(){    
        return nombre;    
    }

    private String nombre;
}