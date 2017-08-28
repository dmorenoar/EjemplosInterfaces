/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Arrays;
import sun.font.EAttribute;

/**
 *
 * @author dmorenoar
 */
public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Pepito", 2563);

        Empleado[] misEmpleados = new Empleado[5];

        misEmpleados[0] = new Empleado("daniel", 23);
        misEmpleados[1] = new Empleado("marta", 233);
        misEmpleados[2] = new Empleado("jesus", 123);

        misEmpleados[3] = jefe_RRHH; // Polimorfismo Principio de sustitucion
        //Se puede utilizar un objeto de la subclase siempre que se espere un objetdo de la superclase

        misEmpleados[4] = new Jefatura("eL FUCK BOSS", 11);

        //Metodo casting de un empleado a otro tipo de clase se puede hacer el casting porque el jefe es un tipo empleado
        Jefatura jefe_Finanzas = (Jefatura) misEmpleados[4];

        jefe_Finanzas.estableceIncentivo(22.4);

        /*Error para caster un Empleado a Jefatura, un Jefe si es un empleado, pero un empleado no tiene porque ser un jefe.
        Jefatura jefe_compras = (Jefatura) misEmpleados[1];
         */
        //Ese metodo nos obliga a heredad una interfaz, nos dice que interfaces.Empleado cannot be cast to java.lang.Comparable
        //Por lo tanto hemos de añadir la interfaz Comparable
        Arrays.sort(misEmpleados);

        Empleado director_comercial = new Jefatura("Alba", 1312);

        //No se puede instancias una interfaz pero si utilizar el principio de sustitucion
        Comparable ejemplo = new Empleado("Manolito gafotas", 0);

        if (ejemplo instanceof Empleado) 
            System.out.println("Es una instancia de comparable");

        if (director_comercial instanceof Empleado) 
            System.out.println("Es una instancia de comparable");
            
        //Hago uso del metodo implementado por la interfaz
        System.out.println(jefe_Finanzas.tomarDecisiones("Despedido"));
        
        /*Si probamos hacer un tomardecisiones de la clase empleado no podemos hacerlo, porque jefatura implementa la interfa
        misEmpleados[3].*/
        
        /*
        PODRIA QUERER QUE EL EMPLEADO TUVIESE TOMARDECISIONE Y ME LLEVARIA TODO EL METODO Y EL IMPLEMENTES JEFES A LA CLASE EMPLEADO,
        Y AL SER PADRE DE JEFATURA, AMBAS PODRIAN TOMAR DECISIONES POR HERENCIA
        */
        
        //Establecemos un bonus al jefe de finanzas
        System.out.println("El jefe de finanzas tiene un bonus de " + jefe_Finanzas.establece_bonus(2000));
        
        
                for (Empleado e : misEmpleados) {
                    System.out.println(e.subeSueldo(3)); //Enlazado dinamico, la maquina virtual de java en tiempo ejecucion sabe a que tipo de metodo de la clase o subclase debe llamar
                    System.out.println("BONUSS: " + e.establece_bonus(200));
                }

                for (Empleado e : misEmpleados) {
                    System.out.println(e.toString());
                }

            }
    

        }
