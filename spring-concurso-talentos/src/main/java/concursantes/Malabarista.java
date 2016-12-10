package concursantes;

public class Malabarista implements Concursante {

    private int pelotas = 5;
    
    public Malabarista(){
        
    }
    
    public Malabarista(int pelotas){
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
