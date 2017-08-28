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


//Al crear una clase como final, se corta la cadena de la herencia
public final class Jefatura extends Empleado implements Jefes{

    private double incentivo = 25;
    
    public Jefatura(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
    public void estableceIncentivo(double incentivo){
        
        this.incentivo = incentivo;
    }
    
    //Declarar el metodo final para que nadie pueda hacer un override en las subclases
    @Override
    public double getSueldo(){
        
        //Con el super le decimos que no llame al getSueldo de Jefatura sino de la clase padre
        double sueldoJefe = super.getSueldo();
        
        return sueldoJefe + incentivo;
    }
    
    @Override
    public double subeSueldo(double porcentaje){
        
        double aumento = sueldo * porcentaje / 100;
        
        return sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Jefatura{" + "incentivo=" + incentivo +  "bonus=" + this.bonus_base + '}';
    }

    @Override
    public String tomarDecisiones(String decision) {
        
        return "Un miembro de la direccion ha tomado la decision de:" + decision;
        
    }

    //Al tener la interfaz Jefes un extends de la interfaz Trabajadores estamos obligados a implementar el metodo abstracto
    @Override
    public double establece_bonus(double gratificacion) {
       return Trabajadores.bonus_base + gratificacion * 35.0;
    }


    
}
