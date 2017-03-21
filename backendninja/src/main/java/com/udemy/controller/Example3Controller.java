package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		return Constantes.FORM_VIEW;
	}
	
	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person persona){
		ModelAndView mav = new ModelAndView();
		mav.setViewName(Constantes.RESULT_VIEW);
		mav.addObject("person", persona);
		return mav;
	}
	
}
