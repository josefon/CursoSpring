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
    private Concursante malabarista2;
    private Concursante musico1;
    private Concursante musico2;
    
    @Before
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        malabarista1 = (Concursante)ctx.getBean("solei");
        malabarista2 = (Concursante)ctx.getBean("soleiRecitador");
        musico1 = (Concursante)ctx.getBean("jasonPiano");
        musico2 = (Concursante)ctx.getBean("jasonSax");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEjecutar() {
        logger.info("Inicio de ejecutar el test de Malabarista");
        int nPelotas = 10;
        malabarista1.ejecutar();       
        assertEquals(nPelotas, ((Malabarista)malabarista1).getPelotas());
        logger.info("Fin de test Malabarista");
        
        logger.info("Inicio de ejecutar el test de MalabaristaRecitador");
        nPelotas = 15;
        malabarista2.ejecutar();       
        assertEquals(nPelotas, ((Malabarista)malabarista2).getPelotas());
        logger.info("Fin de test MalabaristaRecitador");
        
        logger.info("Inicio de ejecutar el test de Musico 1");
        String cancion="Noche de Paz";
        musico1.ejecutar();
        assertEquals(cancion, ((Musico)musico1).getCancion());
        logger.info("Fin de test Musico1");
        
        logger.info("Inicio de ejecutar el test de Musico 2");
        cancion="Equinox";
        musico2.ejecutar();
        assertEquals(cancion, ((Musico)musico2).getCancion());
        logger.info("Fin de test Musico2");
    }    
}
