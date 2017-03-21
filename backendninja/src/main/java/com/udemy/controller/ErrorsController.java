package com.udemy.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tools.Constantes;

@ControllerAdvice
public class ErrorsController {

	@ExceptionHandler(Exception.class)
	public String showInternalServerError(){
		return Constantes.INTERNAL_SERVER_ERROR_VIEW;
	}
}
