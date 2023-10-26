package edu.westga.cs3211.a4.model;

public class Rabbit {



	public String name;
	public String message;
	
	/**
	 * Creates a rabbit object with the provided name and message
	 * 
	 * 
	 * @precondition name != null & .isEmpty() && message != null & .isEmpty()
	 * @postcondition this.name == name && this.message == message
	 * @param name the name of the rabbit 
	 * @param message the message that the rabbit delivers
	 */
	public Rabbit(String name, String message) {
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		}
		if(message == null) {
			throw new IllegalArgumentException("message can not be null");
		}
		if(message.isEmpty()) {
			throw new IllegalArgumentException("message can not be empty");
		}
		if(name.isEmpty()) {
			throw new IllegalArgumentException("name can not be empty");
		}
		this.name = name;
		this.message = message;
	}
	
	/**
	 * Gets the name of the rabbit
	 * 
	 * @return the name of the rabbit
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the message of the rabbit
	 * 
	 * @return the message of the rabbit
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the name of the rabbit
	 * @precondition name != null & .isEmpty()
	 * @postcondition this.name == name
	 * @param name the name of the rabbit
	 */
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("name can not be null");
		}
		if(name.isEmpty()) {
			throw new IllegalArgumentException("name can not be empty");
		}
		this.name = name;
	}

	/**
	 * Sets the message of the rabbit
	 * @precondition message != null & .isEmpty()
	 * @postcondition this.message == message
	 * @param message the message of the rabbit
	 */
	public void setMessage(String message) {
		if(message == null) {
			throw new IllegalArgumentException("message can not be null");
		}
		if(message.isEmpty()) {
			throw new IllegalArgumentException("message can not be empty");
		}
		this.message = message;
	}
	
}
