/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author jc.defrutos
 */
@Component("soleiRecitador")
public class MalabaristaRecitador extends Malabarista {
    private Poema poema;
    
    public MalabaristaRecitador(Poema poema){
        super();
        this.poema = poema;
    }
    
    @Autowired
    public MalabaristaRecitador(@Value("15") int nPelotas, Poema poema){
        super(nPelotas);
        this.poema = poema;
    }
    
    public void ejecutar() throws EjecucionException {
        super.ejecutar();
        System.out.println("Mientras recita...");
        poema.recitar();
        System.out.println("Termina recitación.");
    }
}
