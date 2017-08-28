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
public class Furgoneta extends Coche{
    private int capacidad_extra;
    private int plazas_extra;

    public Furgoneta(int capacidad_extra, int plazas_extra) {
        super(); //Se llama al constructor de la clase padre
        this.capacidad_extra = capacidad_extra;
        this.plazas_extra = plazas_extra;
    }

    @Override
    public String toString() {
        return " capacidad_extra=" + capacidad_extra + ", plazas_extra=" + plazas_extra + '}';
    }
    
    
    
}
