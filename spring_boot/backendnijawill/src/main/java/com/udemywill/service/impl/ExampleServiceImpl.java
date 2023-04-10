package com.udemywill.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;


import com.udemywill.model.Person;
import com.udemywill.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	private static final Log LOGGER =LogFactory.getLog(ExampleServiceImpl.class);
	@Override
	public List <Person> getListPeople(){
		LOGGER.info("PASO ExampleServiceImpl.getListPeople()" );
		List <Person> people = new ArrayList<>();
		people.add(new Person("Michael",30));
		people.add(new Person("luis",25));
		people.add(new Person("Maria",18));
		people.add(new Person("Lulu",38));
		people.add(new Person("Charlie",58));
		people.add(new Person("Tito",5));
		return people;
	}
	
}