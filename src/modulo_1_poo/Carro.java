/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo_1_poo;

/**
 *
 * @author Isabela Rosero Obando - 202128720 - 3743
 * Video 28, 29, 30, 31, 32 - Módulo 1 - Curso Java SE - Instructor Juan Díaz - Píldoras informáticas
 */
public class Carro {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private int peso_total;
    private String color;
    private boolean asientos_cuero, climatizador;
    
    public Carro(){
        ruedas = 4;
        largo = 2500;
        ancho = 350;
        motor = 1600;
        peso_plataforma = 500;
    }
    
    public String datosGenerales(){
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" + ". Mide" + largo/1000 + " metros, con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getLargo() {
        return "El largo del carro es " + largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public String getPeso_total() {
        int peso_carroceria = 500;
        peso_total = peso_carroceria + peso_plataforma;
        if (asientos_cuero == true){
            peso_total = peso_total + 50;
        } else {
            peso_total = peso_total + 20;
        }
        return "El peso del carro es " + peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public String getColor() {
        return "El color de tu carro es " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAsientos_cuero() {
        if (asientos_cuero == true){
            return "El carro tiene asientos de cuero.";
        } else {
            return "El carro tiene asientos de serie.";
        }
    }

    public void setAsientos_cuero(String asientos_cuero) {
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
        
    }

    public String isClimatizador() {
        if (climatizador == true){
            return "El carro incorpora climatizador";
        } else {
            return "El carro lleva aire acondicionado";
        }
    }

    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        } else { 
            this.climatizador = false;
        }
    }
    
    public int precio_carro(){
        int precio_final = 10000;
        if (asientos_cuero == true){
            precio_final += 2000;
        }
        if (climatizador == true){
            precio_final += 1500;
        }
        return precio_final;
    }
    
}
