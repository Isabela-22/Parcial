/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo_1;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 36,37, 38 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleados trabajador1 = new Empleados("Rose");
        Empleados trabajador2 = new Empleados("Jennie");
        Empleados trabajador3 = new Empleados("Alya");
        Empleados trabajador4 = new Empleados("Lila");
        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos()+ trabajador2.getDatos()+ trabajador3.getDatos() + trabajador4.getDatos()); 
        System.out.println(Empleados.getNextId());    
    }
    
}

class Empleados{
    public Empleados(String name){
        nombre = name;
        seccion = "Administracción";
        id = nextId;
        nextId++;

    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
       
    public String getDatos(){
        return "El nombre es " + nombre + ", la sección es " + seccion + " y el id es " + id;
    }
    
    public static String getNextId(){
        return "El Id siguiente es: " + nextId;
    }
    
    private final String nombre;
    private String seccion;
    private int id;
    private static int nextId=1;
}
