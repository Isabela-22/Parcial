/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

import java.util.GregorianCalendar;

/**
 *
*@author Isabela Rosero Obando - 202128720 - 3743
 * Video 161-163 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Array_list_PG {

    public static void main(String[] args) {
        // TODO code application logic here        
        String nombres[]={"Jose","Maria","Pepe"};        
        System.out.println(MisMatrices.getMenor(nombres));        
    /*  Empleado paco=new Empleado ("Paco",45,2500);        
        Empleado ana=new Empleado ("Ana",45,2500);      
        
        Empleado maria=new Empleado ("Maria",45,2500);        
        Empleado misEmpleados[]={paco,ana,maria};        
        System.out.println(MisMatrices.getMenor(misEmpleados))*/
    
        GregorianCalendar fechas[]={new GregorianCalendar(2015,07,12),
            new GregorianCalendar(2015,07,12),
            new GregorianCalendar(2015,07,12)
        };        
        System.out.println(MisMatrices.getMenor(fechas));
    }   
}

class MisMatrices {
    public static <T extends Comparable> T getMenor(T[]a){    
        if(a==null || a.length==0){        
            return null;        
        }        
        T elementoMenor=a[0];        
        for(int i=1;i<a.length;i++){       
            if(elementoMenor.compareTo(a[i])>0){            
                elementoMenor=a[i];            
            }        
        }
        return elementoMenor;    
    }
}