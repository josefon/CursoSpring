package com.udemy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.component.ExampleComponent;
import com.udemy.model.Person;

import tools.Constantes;

@Controller
@RequestMapping("/example")
public class ExampleController {

	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	// //Primera forma
	// //Usa RequestMapping indicando la ruta y el tipo de petición. Sería
	// equivalente a @GetMapping("/exampleString")
	// @RequestMapping(value="/exampleString", method=RequestMethod.GET)
	// public String exampleString(){
	// return Constantes.EXAMPLE_VIEW;
	// }
	//
	// //Segunda forma
	// //Como el anterior pero devolviendo un ModelAndView
	// @RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	// public ModelAndView exampleMAV(){
	// return new ModelAndView(Constantes.EXAMPLE_VIEW);
	// }

	// Desde Spring 4.3 @RequestMapping(value="/exampleMAV",
	// method=RequestMethod.GET) se puede sustituir por
	// @GetMapping("/exampleMAV")
	// Lo mismo para PostMapping, PutMapping, etc.

	// //Pasando datos
	// @GetMapping(value="/exampleString2")
	// public String exampleString2(Model model){
	// model.addAttribute("name", "Josefon String"); //Primero se pone el nombre
	// del atributo, segundo el valor
	// return Constantes.EXAMPLE_VIEW;
	// }
	//
	// @GetMapping(value="/exampleMAV2")
	// public ModelAndView exampleMAV2(){
	// ModelAndView mav = new ModelAndView(Constantes.EXAMPLE_VIEW);
	// mav.addObject("name", "Josefon MAV");
	// return mav;
	// }

	// Con datos complejos
	@GetMapping(value = "/exampleString")
	public String exampleString(Model model) {
		exampleComponent.sayHello();
		//model.addAttribute("person", new Person("Jon", 23)); 
		model.addAttribute("people", getPeople());
		return Constantes.EXAMPLE_VIEW;
	}

	
	@GetMapping(value = "/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(Constantes.EXAMPLE_VIEW);
		//mav.addObject("person", new Person("Mikel", 30));
		mav.addObject("people", getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Jon", 23));
		people.add(new Person("Mikel", 30));
		people.add(new Person("Eva", 41));
		people.add(new Person("Peter", 18));
		return people;
	}
}
