package com.caohoa.main;

import com.caohoa.model.Person;

public class Main {
	public static void main(String[] args) {
		StringBuilder builderJson = new StringBuilder();
		
		builderJson.append("{ \"age\": 11");
		builderJson.append(",\"name\":\"hung\"}");
		
		//Person person = new Person(10,"hung");
		//Person person = Person.convertPerson(builderJson.toString());
		
		System.out.println(Person.convertPerson(builderJson.toString()).toStringPerson());
	}
}
