/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author dmorenoar
 */
public class PruebaTemporizador {
    

     public static void main(String[] args) {
         
         DameLaHora listener = new DameLaHora();
         
         Timer miTemporizador = new Timer(5000, listener);
         
         miTemporizador.start();
         
         //Estara funcionando y continuara con el codigo cuando demos Aceptar
         JOptionPane.showMessageDialog(null, "Pulsa para pararlo");
         
         //Al dar Aceptar se encontrara con el System.exit(0) que para la maquina virtual.
         System.exit(0);
     }
    
}

class DameLaHora implements ActionListener{

    /*Elaborar una inner class, clase interna
    Para acceder a los campos privados de una clase desde otra clase
    Para ocultar a una clase de otras pertenencientes al mismo paquete
    Para crear las clases internas anonimas, utiles para gestionar eventos y retrollamadas
    Cuando solo una clase debe acceder a los campos de ejemplar de otra clase-
    */
    
    
    
    
    
    //Es invocado siempre que se desarrolla un evento, por eso el constructor de new Timer nos obliga a crear una interfaz ActionListener
    //Todas aquellas clases que desencadenen eventos han de implementar la interfaz Actionlistener que implementa actionPerformed.
    //Asegurarse que cuadno ocurre un evento dispone del metodo actionPerformed.
    //Uno de los objetivos de las interfaces es marcar el diseño de aquellas clases que implementan la interfaz.
    @Override
    public void actionPerformed(ActionEvent e) {
        Date ahora= new Date();
        
        System.out.println("Te pongo la hora cada 5s " + ahora);
        
        Toolkit.getDefaultToolkit().beep();
    }
    
}
