/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dominion.farmacia;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jc.defrutos
 */
@Repository
public class PersonaDaoImpl implements PersonaDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(DataSource dataSource){
        //No es común que se utilicen las 2 plantillas, sin embargo si es posible
        //La diferencia es el manejo de parámetros por índice o por nombre
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    
    //Query con Parametros por nombre
    //Omitimos la PK ya que es autoincrementable
    private static final String SQL_INSERT_PERSONA = "INSERT INTO PERSONA (nombre, ape_paterno, ape_materno, email) values (:nombre, :ape_paterno, :ape_materno, :email)";
    
    private static final String SQL_UPDATE_PERSONA = "UPDATE PERSONA set nombre = :nombre, ape_paterno = :ape_paterno, ape_materno = :ape_materno, email = :email";
    private static final String SQL_DELETE_PERSONA = "DELETE FROM PERSONA WHERE id_persona = :idPersona";
    private static final String SQL_SELECT_PERSONA = "SELECT id_persona, nombre, ape_paterno, ape_materno, email FROM PERSONA";
    private static final String SQL_SELECT_PERSONA_BY_ID = SQL_SELECT_PERSONA + " WHERE id_persona = ?";
    
    @Override
    public void insertPersona(Persona persona) {
    }

    @Override
    public void updatePersona(Persona persona) {
    }

    @Override
    public void deletePersona(Persona persona) {
    }

    @Override
    public Persona findPersonaById(long idPersona) {
        return null;
    }

    @Override
    public List<Persona> findAllPersonas() {
        RowMapper<Persona> personaRowMapper = ParameterizedBeanPropertyRowMapper.newInstance(Persona.class);
        return this.jdbcTemplate.query(SQL_SELECT_PERSONA, personaRowMapper);
    }

    @Override
    public int contadorPersonasPorNombre(Persona persona) {
        return 0;
    }

    @Override
    public int contadorPersonas() {
        String sql = "SELECT COUNT(*) FROM PERSONA";
        //return this.jdbcTemplate.queryForInt(sql);
        return this.namedParameterJdbcTemplate.getJdbcOperations().queryForInt(sql);
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        return null;
    }
    
}
