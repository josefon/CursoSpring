package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tools.Constantes;

@Controller
@RequestMapping("/example2")
public class Example2Controller {

	//localhost:8080/example2/request1?nm=JON&ag=34
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name="nm") String name, @RequestParam(name="ag", required=false, defaultValue="1") int age){
		ModelAndView mav = new ModelAndView(Constantes.EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		mav.addObject("age_in_model", age);
		return mav;
	}
	
	//localhost:8080/example2/request2/JON
	//localhost:8080/example2/request2/MIKEL
	@GetMapping("/request2/{nm}/{ag}/{ln}")
	public ModelAndView request2(@PathVariable("nm") String name, @PathVariable("ag") int age, @PathVariable("ln") String lastName){
		ModelAndView mav = new ModelAndView(Constantes.EXAMPLE2_VIEW);
		mav.addObject("nm_in_model", name);
		mav.addObject("age_in_model", age);
		mav.addObject("ln_in_model", lastName);
		return mav;
	}
}
