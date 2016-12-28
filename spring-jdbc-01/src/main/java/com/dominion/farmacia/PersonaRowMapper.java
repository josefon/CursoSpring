/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominion.farmacia;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author jc.defrutos
 */
public class PersonaRowMapper implements RowMapper<Persona> {

    @Override
    public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persona persona = new Persona();
        persona.setIdPersona(rs.getLong("id_persona"));
        persona.setNombre(rs.getString("nombre"));
        persona.setApePaterno(rs.getString("ape_paterno"));
        persona.setApeMaterno(rs.getString("ape_materno"));
        persona.setEmail(rs.getString("email"));
        return persona;
    }
}
