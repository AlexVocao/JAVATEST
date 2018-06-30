package com.caohoa.model;

import com.google.gson.Gson;

public class Person {
	private int age;
	private String name;
	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		
	}
	public static Person convertPerson(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, Person.class);
		 
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public String toStringPerson() {
		return "Age: "+this.age +"\n"+"Name: "+this.name;
	}
}
