package concursantes;

import org.springframework.stereotype.Component;

@Component("poema")
public class Soneto implements Poema {

    @Override
    public void recitar() {
        String reci = "hola esto"
                + "es una prueba"
                + "de soneto";
        System.out.println("reci = " + reci);
    }
    
}
