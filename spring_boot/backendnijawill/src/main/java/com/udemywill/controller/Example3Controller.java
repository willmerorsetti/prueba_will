package com.udemywill.controller;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.udemywill.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/example3")
public class Example3Controller {
	public static final String FORM_VIEW ="form";
	public static final String RESULT_VIEW ="result";
	private static final Log LOGGER= LogFactory.getLog(Example3Controller.class);
	
	/*
	//Forma 1 redireccionar 
	@GetMapping("/")
	public String redirect() {
		return "redirect:/example3/showForm";
	}
	*/
	
	//Forma 1 redireccionar
	@GetMapping("/")
	public RedirectView redirect() {
		return new RedirectView("/example3/showForm");
	}
	
	@GetMapping("/showForm")
	public String showForm(Model model) {
		LOGGER.info("INFO:Example3Controller:showForm");
		LOGGER.warn("WARNING:Example3Controller:showForm");
		LOGGER.error("ERROR:Example3Controller:showForm");
		LOGGER.debug("debug:Example3Controller:showForm");
		
		model.addAttribute("person",new Person());
		//int a=6/0;
		return FORM_VIEW;	
	}
	
	@PostMapping("/addperson")
	public ModelAndView  addPerson(@ModelAttribute("person") Person person) {
		LOGGER.info("INFO:Example3Controller:addPerson ->"+ person);
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		LOGGER.info("INFO:Example3Controller:addPerson -> TEMPLATE:"+ RESULT_VIEW);
		mav.addObject("person", person);
		return mav;	
	}
}
