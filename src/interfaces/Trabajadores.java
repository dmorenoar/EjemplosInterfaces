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
public interface Trabajadores {
    
    //Las constantes de las interfaces son por defecto todos public static final
    double bonus_base = 1500;
    
    //Los metodos de las interfaces solo se definen no se desarrollan
    //Por convencio no suelen ponerse el public absctact se sobreentiende
    double establece_bonus(double gratificacion);
    
    
    
}
