package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Malabarista1 implements Concursante {

    private int pelotas = 10;
    
    public Malabarista1(){
        
    }
    
    //@Autowired
    public Malabarista1(int pelotas){
        this.pelotas = pelotas;
    }
    
    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("Malabareo = " + getPelotas() + " pelotas. ");
    }

    /**
     * @return the pelotas
     */
    public int getPelotas() {
        return pelotas;
    }

    /**
     * @param pelotas the pelotas to set
     */
    public void setPelotas(int pelotas) {
        this.pelotas = pelotas;
    }
    
}
