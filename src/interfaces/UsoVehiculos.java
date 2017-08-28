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
public class UsoVehiculos {

    public static void main(String[] args) {
        // TODO code application logic here

        Coche coche1 = new Coche();
        coche1.setColor("azul");

       // System.out.println(coche1.toStringCoche());

       /*
        Coche coche2 = new Furgoneta(2, 4);
        Furgoneta furgo2 = (Furgoneta) coche2;
      */  
       
        
       // System.out.println(coche1.toStringCoche());
        //En el padre no podemos ver lo del hijo, pero en el hijo si lo del padre
        Furgoneta furgo1 = new Furgoneta(12, 24);
        furgo1.setColor("verde");

       // System.out.println(furgo1.toStringCoche() +  furgo1.toString());

        
        
    }

}
