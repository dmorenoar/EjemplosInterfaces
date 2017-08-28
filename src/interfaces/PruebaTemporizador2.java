/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

/**
 *
 * @author dmorenoar
 */
public class PruebaTemporizador2 {

    public static void main(String[] args) {

        //Al borrar el constructor por la clase local, se omite el constructor y se le pasan los valores al metodo en marcha
        //Reloj mireloj = new Reloj(3000,true);
        Reloj mireloj = new Reloj();

        mireloj.enMarcha(3000, true);
        

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

        System.exit(0);
    }

}

class Reloj {

    /* Se borran al crear la clase interna local y pasarle las variables por el metodo
    private int intervalo;
    private boolean sonido;
    */


    /*Se pueden omitir al borrar el constructor con la clase local
    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }*/

    //Cuando tenemos una clase interna que va a acceder a una variable local que pertenece al metodo, los atributos deben ser de tipo final
    //Como la clase interna no accede a intervalo no se pone final, pero si se hace mencion debe ser final
    public void enMarcha(int intervalo, final boolean sonido){
    
    //public void enMarcha() {

         //Convertimos la clase interna DameLaHora2 en una clase interna local, solo se pueden cuando se utiliza una unica vez
        //La clase interna local no debe llevar ningun modificador de acceso, ni private ni public
        //Esta totalmente encapsulada, no es visible ni desde la clase externa
        class DameLaHora2 implements ActionListener {

            public DameLaHora2() {
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3sg " + ahora);

                //La clase interna esta accediendo a un campo de ejemplar que no es suyo, no esta definido en la clase interna, esta definida
                //fuera de su ambito, y es private, la clase interna puede entrar a la clase que la engloba aunque sea encapsulado.
                //Nos ahorramos a los metodos de acceso de la clase Reloj setter y getter, al crear la clase interna.
                //Aunque podriamos crearlos para que otras clases que necesitasen acceder pudieran.
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new DameLaHora2();

        Timer temporizador = new Timer(intervalo, listener);

        temporizador.start();

       
    }


    /*Clase interna
    private class DameLaHora2 implements ActionListener {

        public DameLaHora2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3sg " + ahora);
            
            //La clase interna esta accediendo a un campo de ejemplar que no es suyo, no esta definido en la clase interna, esta definida
            //fuera de su ambito, y es private, la clase interna puede entrar a la clase que la engloba aunque sea encapsulado.
            //Nos ahorramos a los metodos de acceso de la clase Reloj setter y getter, al crear la clase interna.
            //Aunque podriamos crearlos para que otras clases que necesitasen acceder pudieran.
            if(sonido){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }*/
}
