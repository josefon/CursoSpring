package concursantes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConcursanteTest {
    private static Log logger = LogFactory.getLog("ConcursanteTest");
    private Concursante malabarista1;
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        malabarista1 = (Concursante)ctx.getBean("solei");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEjecutar() {
        logger.info("Inicio de ejecutar el test de Malabarista");
        int nPelotas = 5;
        malabarista1.ejecutar();
        assertEquals(nPelotas, ((Malabarista)malabarista1).getPelotas());
        logger.info("Fin de test");
    }    
}
