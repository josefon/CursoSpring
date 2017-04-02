package com.udemy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.service.impl.EjercicioImpl;

@Controller
@RequestMapping("/ejercicio")
public class Ejercicio {

	private final static Log LOGGER = LogFactoryImpl.getLog(Ejercicio.class);
	
	@Autowired
	private EjercicioImpl ejercicioImpl;
	
	@GetMapping("/metodo1")
	public RedirectView metodo1(){
		return new RedirectView("/ejercicio/metodo2");
	}
	
	@GetMapping("/metodo2")
	public String metodo2(Model model, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		ejercicioImpl.unicoMetodo();
		model.addAttribute("mensaje", "test Mensaje Ejercicio");
		long startTime = (long) request.getAttribute("startTime");
		LOGGER.info("Request URL: " + request.getRequestURL() + ", Tiempo total: " + (System.currentTimeMillis() - startTime));
		return "vista2";
	}
}
