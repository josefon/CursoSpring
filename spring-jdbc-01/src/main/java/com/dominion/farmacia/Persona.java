/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominion.farmacia;

/**
 *
 * @author jc.defrutos
 */
public class Persona {
    private long idPersona;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String email;
    
    public Persona(){
        
    }
    
    public Persona(long idPersona){
        this.idPersona = idPersona;
    }

    /**
     * @return the idPersona
     */
    public long getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apePaterno
     */
    public String getApePaterno() {
        return apePaterno;
    }

    /**
     * @param apePaterno the apePaterno to set
     */
    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    /**
     * @return the apeMaterno
     */
    public String getApeMaterno() {
        return apeMaterno;
    }

    /**
     * @param apeMaterno the apeMaterno to set
     */
    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Persona [idPersona=" + idPersona
                + ", nombre=" + nombre
                + ", apePaterno=" + apePaterno
                + ", apeMaterno=" + apeMaterno
                + ", email=" + email + "]";
    }
}
