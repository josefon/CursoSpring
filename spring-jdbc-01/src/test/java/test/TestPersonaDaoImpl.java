/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.dominion.farmacia.Persona;
import com.dominion.farmacia.PersonaDao;
import java.util.List;
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
@ContextConfiguration(locations = {"classpath:datasource-test.xml", "classpath:applicationContext.xml"})
public class TestPersonaDaoImpl {
    private static Log logger = LogFactory.getLog("TestPersonasDaoImpl");
    
    @Autowired
    private PersonaDao personaDao;
    
    @Test
    public void deberiaMostrarPersonas(){
        try{
            System.out.println("");
            logger.info("Inicio del test deberiaMostrarPersonas");
            List<Persona> personas = personaDao.findAllPersonas();
            int contadorPersonas = 0;
            for (Persona persona: personas){
                logger.info("Persona: " + persona);
                contadorPersonas++;
            }
            assertEquals(contadorPersonas, personaDao.contadorPersonas());
            logger.info("Fin del test deberiaMostrarPersonas");
        }catch(Exception e){
            logger.error("Error JDBC: " + e.getMessage());
        }
    }
}
