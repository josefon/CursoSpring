package prueba;

import concursantes.Concursante;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaConcursoTalentos {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Concursante malabarista1 = (Concursante)ctx.getBean("solei");
        malabarista1.ejecutar();
    }
}