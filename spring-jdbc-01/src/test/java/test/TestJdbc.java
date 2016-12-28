/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author jc.defrutos
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:datasource-test.xml"})
public class TestJdbc {
    private static Log logger = LogFactory.getLog("TestJdbc");
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Test
    public void testJdbc() {
        logger.info("Inicio del testJdbc");
        int noPersonas = jdbcTemplate.queryForInt("select count(*) from persona");
        logger.info("Número de personas: " + noPersonas);
        assertEquals(3, noPersonas);
        logger.info("Fin del test Jdbc");
    }
}
