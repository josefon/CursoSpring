package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	@GetMapping("/vista404")
	public String vista404(){
		return "404";
	}
	
	@GetMapping("/vista500")
	public String vista500(){
		return "500";
	}
}
