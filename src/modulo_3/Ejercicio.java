/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_3;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video de 123 a 131 - Módulo 3 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suma operacion1=new Suma();        
        Resta operacion2=new Resta();        
        Multiplica operacion3=new Multiplica();        
        Divide operacion4=new Divide();        
        System.out.println(operacion1.calculo(7,8));        
        System.out.println(operacion2.calculo(7,8));        
        System.out.println(operacion3.calculo(7,8));        
        System.out.println(operacion4.calculo(7,8));
    }
}

class Divide implements Calcula{    
    public int calculo(int num1, int num2){        
        return num1/num2;    
    }   
}

class Multiplica implements Calcula{    
    public int calculo(int num1, int num2){        
        return num1*num2;
    } 
}

class Resta implements Calcula{
    public int calculo(int num1, int num2){        
        return num1-num2;
    }     
}

class Suma implements Calcula{    
    public int calculo(int num1, int num2){       
        return num1+num2;
    }    
}
