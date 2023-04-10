package com.udemywill.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Person {
	@NotNull
	@Size(min = 2, max=60)
	private String name;
	@NotNull
	@Min(10)
	private int age;
	
	public String getName() {
		return name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//Constructor sin parametros 
	public Person() {}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
