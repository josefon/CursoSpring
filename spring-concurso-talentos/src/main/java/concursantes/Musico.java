package concursantes;

public class Musico implements Concursante {

    private String cancion;
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
