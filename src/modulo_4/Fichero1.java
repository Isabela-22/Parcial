/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 152,153 - Módulo 4 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas 
 */
public class Fichero1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Administrador jefe=new Administrador("Juan",80000,2005,12,15);        
        jefe.setIncentivo(500);                
        Empleado[] personal=new Empleado[3];        
        personal[0]=jefe;        
        personal[1]=new Empleado("Ana", 25000,2008,10,1);        
        personal[2]=new Empleado("Luis", 18000,2012,9,15);        
        try{        
            ObjectOutputStream escribiendo_fichero=new ObjectOutputStream(new FileOutputStream("src/archivos/ejemplo"));            
            escribiendo_fichero.writeObject(personal);            
            escribiendo_fichero.close();            
            ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("src/archivos/ejemplo"));
            Empleado[] personal_recuperando=(Empleado[]) recuperando_fichero.readObject();
            recuperando_fichero.close();            
            for(Empleado e : personal_recuperando){            
                System.out.println(e);            
            }        
        }catch(Exception e){  
        }        
    }    
}

class Empleado implements Serializable {

    public Empleado(String n, double s, int agno, int mes, int dia){    
            nombre=n;            
            sueldo=s;            
            GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);            
            fechaContrato=calendario.getTime();    
    }
        
    public String getNombre(){    
        return nombre;    
    }
    
    public double getSueldo(){    
        return sueldo;    
    }
    
    public Date getfechaContrato(){    
        return fechaContrato;    
    }
    
    public void subirSueldo(double porcentaje){    
        double aumento=sueldo*porcentaje/100;        
        sueldo+=aumento;    
    }
    
    public String toString(){    
        return "El Nombre= " + nombre + "El sueldo= " + sueldo + "Y la fecha de contrato= " + fechaContrato;    
    }    
    private String nombre;    
    private double sueldo;    
    private Date fechaContrato;
}

class Administrador extends Empleado{    
    public Administrador(String n, double s, int agno, int mes, int dia){    
        super(n,s,agno,mes,dia);        
        incentivo=0;    
    }
    
    public double getSueldo(){    
        double sueldoBase=super.getSueldo();        
        return sueldoBase + incentivo;    
    }
    
    public void setIncentivo(double b){    
        incentivo=b;    
    }    
    
    public String toString(){    
        return super.toString() + "Incentivo=" + incentivo;    
    }
    
    private double incentivo;
}