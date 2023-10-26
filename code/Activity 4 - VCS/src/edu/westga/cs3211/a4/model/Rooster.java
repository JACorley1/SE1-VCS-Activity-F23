package edu.westga.cs3211.a4.model;

public class Rooster {
	private String name;
	private String breed;
	
	public Rooster(String name , String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
}
