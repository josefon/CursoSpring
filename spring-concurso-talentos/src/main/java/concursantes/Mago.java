/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author jc.defrutos
 */
@Component("mago")
public class Mago implements Adivinador {

    private String pensamientos;
    
    @Pointcut ("execution(* concursantes.Pensador.pensarEnAlgo(String)) && args(pensamientos)")
    public void pensar(String pensamientos){System.out.println("aa"); }
    
    //@Override
    @Before("pensar(pensamientos)")
    public void interceptarPensamientos(String pensamientos) {
        System.out.println("Magia...");
        System.out.println("Estos son los pensamientos del volucnatio: " + pensamientos);
        this.pensamientos = pensamientos;
    }

    @Override
    public String getPensamientos() {
        return this.pensamientos;
    }
    
}
