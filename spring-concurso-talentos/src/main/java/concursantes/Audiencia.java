/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

import org.springframework.stereotype.Component;

/**
 *
 * @author jc.defrutos
 */
@Component
public class Audiencia {
    public void sentarse(){
        System.out.println("El show está por comenzar, favor de tomar asiento...");
    }
    
    public void apagarCelulares(){
        System.out.println("Favor de apagar celulares...");
    }
    
    public void aplaudir(){
        System.out.println("El show ha terminado, clap clap Clap");
    }
    
    public void devolucion(){
        System.out.println("El show fue terrible, se devolverán las entradas");
    }
}
