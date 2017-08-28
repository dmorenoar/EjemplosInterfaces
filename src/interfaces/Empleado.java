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

//Hacemos un implementes de trabajadores porque se dice que todos los empleados debe definir el metodo establece_bonus de la interfaz trabajadores
public class Empleado extends Persona implements Comparable, Trabajadores{

    double sueldo;

    public Empleado(String nombre, double sueldo) {
        //Al extender de Persona debo utilizar el constructor de la clase abstracta para crear el nombre
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double subeSueldo(double porcentaje){
        
        double aumento = sueldo + porcentaje / 100;
        
        return sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{ nombre=" + this.nombre + "sueldo=" + sueldo + " bonus:=" + this.bonus_base + "}";
    }

    /*
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
*/

    //Atributos que trabajan en la clase abstracta y puedo acceder desde la clase porque es como si fueran suyos.
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    //Al implementar la interfaz hemos de implementar los metodos abstractos de la clase propio
    @Override
    public int compareTo(Object o) {
       //Hacemos el casting del objecto a lo que queremos, en este caso Empleado. 
       Empleado emp = (Empleado) o;
        
       if(this.sueldo<emp.sueldo)
           return -1;
       
       if(this.sueldo>emp.sueldo)
           return 1;
       
       return 0;
    }

    @Override
    public double establece_bonus(double gratificacion) {

        return Trabajadores.bonus_base + 100;
    }
    
}
