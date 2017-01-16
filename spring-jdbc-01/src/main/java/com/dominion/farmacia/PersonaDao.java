/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominion.farmacia;

import java.util.List;

/**
 *
 * @author jc.defrutos
 */
public interface PersonaDao {
    void insertPersona(Persona persona);
    void updatePersona(Persona persona);
    void deletePersona(Persona persona);
    
    Persona findPersonaById(long idPersona);
    
    List<Persona> findAllPersonas();
    
    int contadorPersonasPorNombre(Persona persona);
    int contadorPersonas();
    Persona getPersonaByEmail(Persona persona);
}
