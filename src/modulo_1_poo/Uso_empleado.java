package modulo_1_poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.*;
import modulo_2.Trabajadores;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 33,34,35,36 y 39 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Uso_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Empleado empleado1 = new Empleado("Rose Rossi", 90000, 2000, 9, 22);
        Empleado empleado2 = new Empleado("Ansel Jones", 85000, 1990, 12, 17);
        Empleado empleado3 = new Empleado("Jennie Jacques", 105000, 2003, 5, 11);
        
        empleado1.setSueldo(5);
        empleado2.setSueldo(5);
        empleado3.setSueldo(5);
        
        System.out.println("Nombre: " + empleado1.getNombre() + "\n Sueldo:" + empleado1.getSueldo()+ "\n Fecha de Alta: " + empleado1.getAltaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + "\n Sueldo:" + empleado2.getSueldo()+ "\n Fecha de Alta: " + empleado2.getAltaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + "\n Sueldo:" + empleado3.getSueldo()+ "\n Fecha de Alta: " + empleado3.getAltaContrato());*/
        
        Jefatura jefe_RRHH = new Jefatura("Lisa", 55000, 2000, 8, 20);
        jefe_RRHH.setIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[3];
        misEmpleados[0] = new Empleado("Rose Rossi", 90000, 2000, 9, 22);
        misEmpleados[1] = new Empleado("Ansel Jones", 85000, 1990, 12, 17);
        misEmpleados[2] = new Empleado("Jennie Jacques", 105000, 2003, 5, 11);
        misEmpleados[3] = new Empleado("Alya Rodriguez");
        misEmpleados[4] = jefe_RRHH; //polimorfismo
        misEmpleados[5] = new Jefatura("Lau", 90000, 2000, 3, 18);
        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
        jefa_Finanzas.setIncentivo(8000);        
        
        //Video 50
        System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vaciones a los empleados"));
        
        //Video 51
        System.out.println("El Jefe " + jefa_Finanzas.getNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(700));
        System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(300));
        
        for(Empleado e: misEmpleados){
            e.setSueldo(5);
        }
        
        Arrays.sort(misEmpleados); //Video 49 - interfaces
        /*for(int j=0; j<3; j++){
        System.out.println("Nombre: " + misEmpleados[j].getNombre() + "\nSueldo:" + misEmpleados[j].getSueldo()+ "\nFecha de Alta: " + misEmpleados[j].getAltaContrato());
        }
        */
        for(Empleado e: misEmpleados){
            
            System.out.println("Nombre: " + e.getNombre() 
                    + " Sueldo:" + e.getSueldo()
                    + " Fecha de Alta: " + e.getAltaContrato());
        }
    }
}
    
class Empleado implements Comparable, Trabajadores {
        public Empleado(String nom, double sue, int agno, int mes, int dia){
           nombre = nom;
           sueldo = sue;
           GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
           altaContrato = calendario.getTime();
           id = nextId;
           nextId++;
        }
        
        //video 51
        public double establece_bonus(double gratificacion){
            return Trabajadores.bonus_base + gratificacion;
        }
               
        //Sobrecarga de constructores - video 39
        
        public Empleado (String nom){
            this(nom, 30000, 2000, 1, 2 );
        }
              
        public String getNombre(){
            return nombre;
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
        
        //Video 49 - interfaces
        public int compareTo(Object miObjeto){
            Empleado otroEmpleado = (Empleado) miObjeto;
            if (this.sueldo<otroEmpleado.sueldo){
                return -1;
            } else if (this.sueldo>otroEmpleado.sueldo){
                return 1;
            } else {
                return 0;
            } 
        }
        private String nombre;
        private double sueldo;
        private Date altaContrato;
        private String seccion;
        private int id;
        private static int nextId=1;
    
}

//Video 42 - Herencia 
//Video 43,44,45 -Polimorfismo

class Jefatura extends Empleado implements Jefes{
    
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }
    
    public String tomar_decisiones(String decision){
        return "Un miembro de la dirección ha tomado la decisión de: ";
    }
    
    public double establece_bonus(double gratificacion){
        double prima = 2000;
        return Trabajadores.bonus_base + gratificacion + prima;
    }
    
    public void setIncentivo(double b){
        incentivo = b;
    }
    
    public double getSueldo(){
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
    private double incentivo;
    
    
    
}
