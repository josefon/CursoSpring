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
        System.out.println("Malabareo = " + pelotas + " pelotas. ");
    }
    
}
