/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1_poo;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 46 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Uso_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] laspersonas = new Persona[2];      
        
        laspersonas[0] = new Empleado2("Rose", 45000, 2003, 12, 24);
        laspersonas[1] = new Alumno("Jennie Lopez", "Química");
        
        for(var p: laspersonas){
            System.out.println(p.getNombre() + ", " + p.getDescripcion());
        }
  
    }
}

    abstract class Persona{
        public  Persona (String nom){
            nombre=nom;
        }

        public String getNombre() {
            return nombre;
        }
        
        public abstract String getDescripcion();
        private String nombre;
    }

    class Empleado2 extends Persona{
        public Empleado2(String nom, double sue, int agno, int mes, int dia){
           super(nom);
           sueldo = sue;
           GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
           altaContrato = calendario.getTime();
           id = nextId;
           nextId++;
        }
        
        @Override
        public String getDescripcion(){
            return "Este empleado tienen un Id: " + id + " con un sueldo " + sueldo;
        }

        public double getSueldo() {
            return sueldo;
        }

        public Date getAltaContrato() {
            return altaContrato;
        }
        
        public void setSueldo(double porcentaje){
            double aumento = sueldo*porcentaje/100;
            sueldo += aumento;
        }
        
        private  double sueldo;
        private  Date altaContrato;
        private  int id;
        private  static int nextId;
}
    
    class Alumno extends Persona{
        public Alumno(String nom, String car){
            super(nom);
            carrera = car;
        }
        
        @Override
        public String getDescripcion(){
            return "Este alumno está estudiando la carrera de " + carrera;
        }
        private String carrera;
        
    }

