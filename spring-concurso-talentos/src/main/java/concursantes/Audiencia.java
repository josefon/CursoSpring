/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author jc.defrutos
 */
@Component
@Aspect
public class Audiencia {
    public void sentarse(){
        System.out.println("El show está por comenzar, favor de tomar asiento...");
    }
    
    public void apagarCelulares(){
        System.out.println("Favor de apagar celulares...");
    }
    
    public void aplaudir(){
        System.out.println("El show ha terminado, clap clap Clap");
    }
    
    public void devolucion(){
        System.out.println("El show fue terrible, se devolverán las entradas");
    }
    
    @Around("ejecutarShow()")
    public void monitorearShow(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("El show está por comenzar, favor de tomar asiento...");
            System.out.println("Favor de apagar celulares...");
            
            long horaInicio = System.currentTimeMillis();
            
            joinPoint.proceed();
            
            //Thread.sleep(1000);
            
            long horaTermino = System.currentTimeMillis();
            
            System.out.println("El show ha terminado");
            System.out.println("El show duró " + (horaTermino - horaInicio));
            
        }catch(Throwable t){
            System.out.println("El show fue terrible, se devolverán las entradas.");
        }
    }
    
    @Pointcut("execution(* concursantes.Concursante.ejecutar(..))")
    public void ejecutarShow(){
        
    }
}
