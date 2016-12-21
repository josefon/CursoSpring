package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jasonPiano")
public class Musico implements Concursante {

    @Value("Noche de Paz")
    private String cancion;
    
    @Autowired @Qualifier("piano")
    private Instrumento instrumento;
    
    @Override
    public void ejecutar() throws EjecucionException {
        System.out.println("Tocando: " + getCancion());
        getInstrumento().tocar();
    }

    /**
     * @return the cancion
     */
    public String getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    /**
     * @return the instrumento
     */
    public Instrumento getInstrumento() {
        return instrumento;
    }

    /**
     * @param instrumento the instrumento to set
     */
    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
}
