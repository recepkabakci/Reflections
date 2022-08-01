package com.bilgeadam.basic;

public class Person {
	
	private String name;
	private String lastName;
	private int birthYear;

	
	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}


	public String getFullName() {
		return this.name.concat(" ").concat(lastName);
	}


	public int getBirthYear() {
		return this.birthYear;
	}


	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	

}
