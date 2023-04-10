package com.udemywill.controller;

import org.apache.catalina.valves.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.udemywill.constants.Constantes;
import com.udemywill.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleControllerOLD2 {
	
	//-----------------
	//Primera forma
	//-----------------
	@GetMapping("/examplestring2")
	//@RequestMapping(value ="/examplestring",method=RequestMethod.GET)
	public String exampleString(Model model) {
		model.addAttribute("person",new Person( Constantes.NAME,23));
		return Constantes.EXAMPLE_VIEW;// "example";// no es necesario añadir le .html spring boot lo detecta solo
	}
	
	//-----------------
	//Segunda forma
	//-----------------
	//@RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	@GetMapping("/exampleMAV2")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(Constantes.EXAMPLE_VIEW);
		mav.addObject("person",new Person (Constantes.NAME,37));
		return mav;
		//return new ModelAndView("example");
	}
	
}
