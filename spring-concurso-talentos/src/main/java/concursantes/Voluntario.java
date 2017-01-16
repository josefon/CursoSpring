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
@Component("voluntario")
public class Voluntario implements Pensador{

    private String pensamientos;

    /**
     * @return the pensamientos
     */
    public String getPensamientos() {
        return pensamientos;
    }

    /**
     * @param pensamientos the pensamientos to set
     */
    public void setPensamientos(String pensamientos) {
        this.pensamientos = pensamientos;
    }
    
    /**
     * @param pensamientos the pensamientos to set
     */
    public void pensarEnAlgo(String pensamientos) {
        this.pensamientos = pensamientos;
    }    
    
}
