package com.udemywill.controller;

import java.util.ArrayList;
import java.util.List;

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
public class ExampleControllerOLD3 {
	/*
	//---------------------
	// Lista de Personas
	private List<Person> getPersonas() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Willow", 23));
		people.add(new Person("Pepe", 3));
		people.add(new Person("Venencio", 13));
		return people;
	}

	// -----------------
	// Primera forma
	@GetMapping("/examplestring")
	// @RequestMapping(value ="/examplestring",method=RequestMethod.GET)
	public String exampleString(Model model) {
		model.addAttribute("people", getPersonas());
		return Constantes.EXAMPLE_VIEW;// "example";// no es necesario añadir le .html spring boot lo detecta solo
	}

	// -----------------
	// Segunda forma
	// @RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(Constantes.EXAMPLE_VIEW);
		mav.addObject("people", getPersonas());
		return mav;
		// return new ModelAndView("example");
	}
*/
}
