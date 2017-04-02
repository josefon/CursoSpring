package com.udemy.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.stereotype.Service;

import com.udemy.service.Ejercicio;

@Service
public class EjercicioImpl implements Ejercicio {

	private final static Log LOGGER = LogFactoryImpl.getLog(EjercicioImpl.class);
	
	@Override
	public String unicoMetodo() {
		LOGGER.info("En unicoMetodo");
		return null;
	}

}
