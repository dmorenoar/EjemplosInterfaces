/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author dmorenoar
 */
public class Coche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        this.ruedas= 4;
        this.largo = 2000;
        this.ancho = 300;
        this.motor = 1900;
        this.peso_plataforma = 200;
    }

    public Coche(int ruedas, int largo, int ancho, int motor, int peso_plataforma, String color, int peso_total, boolean asientos_cuero, boolean climatizador) {
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.motor = motor;
        this.peso_plataforma = peso_plataforma;
        this.color = color;
        this.peso_total = peso_total;
        this.asientos_cuero = asientos_cuero;
        this.climatizador = climatizador;
    }


    public String toStringCoche() {
        return "ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor + ", peso_plataforma=" + peso_plataforma + ", color=" + color + ", peso_total=" + peso_total + ", asientos_cuero=" + asientos_cuero + ", climatizador=" + climatizador ;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public boolean isAsientos_cuero() {
        return asientos_cuero;
    }

    public void setAsientos_cuero(boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
    
    
    
    
    
    
}
