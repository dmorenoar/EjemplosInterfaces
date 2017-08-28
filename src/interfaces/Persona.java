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

//Vale la pena crear una clase abstractar por si quiero que se hereden los metodos al programar y no sean overrides, si no nuevos
//para segun las funcionalidades que se requieran.
public abstract class Persona {
    
    protected String nombre;

    protected Persona(String nombre) {
        this.nombre = nombre;
    }

    //El definir almenos 1 metodo abstracto te obliga a que la clase sea abstracta
    protected abstract String getNombre();

    protected abstract void setNombre(String nombre);

}
