package edu.westga.cs3211.a4.model;

public class Rooster {
	private String name;
	private String breed;
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public Rooster(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
}
