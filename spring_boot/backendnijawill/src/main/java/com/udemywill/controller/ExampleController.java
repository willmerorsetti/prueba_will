package com.udemywill.controller;

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

import com.udemywill.component.ExampleComponent;
import com.udemywill.model.Person;
import com.udemywill.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW="example.html";
	//public static final String EXAMPLE_VIEW="example.html"; // es lo mismo con .html o sin 

	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService ;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent ;
	
	
	//Primera forma
	@GetMapping("/examplestring") 
	//@RequestMapping(value="/examplestring",method=RequestMethod.GET)
	public String exampleString(Model model ) {
		//exampleComponent.sayHello();
		//model.addAttribute("name","Jhon");
		//model.addAttribute("person",new Person("Jhon",23) );
		model.addAttribute("people",getPeople() );
		//model.addAttribute("people",exampleService.getListPeople() );
		return EXAMPLE_VIEW;
	}
	
	//Segunda forma
	@GetMapping("/exampleMAV") 
	//@RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		//ModelAndView mav=new ModelAndView();
		ModelAndView mav=new ModelAndView(EXAMPLE_VIEW);
		//mav.addObject("name","Michael");
		mav.addObject("people",getPeople());
		//mav.addObject("people",exampleService.getListPeople());
		//mav.setViewName(EXAMPLE_VIEW);
		return  mav;
	}

	//Tercera forma
	@GetMapping("/exampleServ") 
	//@RequestMapping(value="/exampleMAV",method=RequestMethod.GET)
	public ModelAndView exampleServ() {
		
		ModelAndView mav=new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people",exampleService.getListPeople());

		return  mav;
	}

	private List <Person> getPeople(){
		List <Person> people = new ArrayList<>();
		people.add(new Person("Michael",30));
		people.add(new Person("luis",25));
		people.add(new Person("Maria",18));
		people.add(new Person("Lulu",38));
		people.add(new Person("Rombo",68));
		return people;
	}
	
}
