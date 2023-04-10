package com.udemywill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	public static final String  EXAMPLE2_VIEW ="example2";
	
	//localhost:8181/example2/request1?nm=JON
	//localhost:8181/example2/request1?nm=MIKEL
	@RequestMapping("/request1")
	public ModelAndView request1 (@RequestParam(name="nm",required = false,defaultValue = "NULO") String name) {
		ModelAndView mov = new ModelAndView(EXAMPLE2_VIEW);
		mov.addObject("nm_in_model",name);
		return mov;		
	}
	//localhost:8181/example2/request1/JON
	//localhost:8181/example2/request1/MIKEL
	@RequestMapping("/request2/nm")
	public ModelAndView request2 (@PathVariable("nm") String name) {
		ModelAndView mov = new ModelAndView(EXAMPLE2_VIEW);
		mov.addObject("nm_in_model", name);
		return mov;		
	}
	
}
