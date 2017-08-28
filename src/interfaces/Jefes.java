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

//Una interfaz puede heredar de otra interfaz, se puede crear una jerarquia
public interface Jefes extends Trabajadores{
    //Al crear una interfaz todos los metodos deberan ser obligados a implementarlos en los que implementen la interface
    //Se puede o no poner public abstract
    
    public abstract String tomarDecisiones(String decision);

       
    
}
