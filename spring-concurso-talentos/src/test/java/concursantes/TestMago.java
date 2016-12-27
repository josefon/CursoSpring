/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author jc.defrutos
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMago {
    private static Log logger = LogFactory.getLog("TestMago");
    @Autowired
    private Pensador voluntario;
    
    @Autowired
    private Adivinador mago;
    
    @Test
    public void testMagoAdivinador(){
        logger.info("Inicio de la adivinación");
        
        voluntario.pensarEnAlgo("Hoy ganaré la lotería");
        
        assertEquals("Hoy ganaré la lotería", mago.getPensamientos());
        
        logger.info("Fin Adivinación");
    }
}
