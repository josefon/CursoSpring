package concursantes;

import org.springframework.stereotype.Component;


public class Saxofon implements Instrumento {

    @Override
    public void tocar() {
        System.out.println("Tun tun tun ...");
    }
    
}
