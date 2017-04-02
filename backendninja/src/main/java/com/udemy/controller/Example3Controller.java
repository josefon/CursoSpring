package com.udemy.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemy.model.Person;

import tools.Constantes;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
	
	private static final Log LOGGER = LogFactory.getLog(Example3Controller.class);
	
	//#1 - Forma de redireccionar
//	@GetMapping("/")
//	public String redirect(){
//		return "redirect:/example3/showForm";
//	}
	
	//#2 - Otra forma de redireccionar
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/showForm");
	}
	
	@GetMapping("/showForm")
	public String showForm(Model model){
		model.addAttribute("person", new Person());
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG TRACE");
		return Constantes.FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@Valid @ModelAttribute("person") Person persona, BindingResult bindingResult){
		ModelAndView mav = new ModelAndView();
		if (bindingResult.hasErrors()){
			mav.setViewName(Constantes.FORM_VIEW);
		}else{
			mav.setViewName(Constantes.RESULT_VIEW);
			mav.addObject("person", persona);	
		}
		return mav;
	}
	
}
