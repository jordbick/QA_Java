package com.qa.challenges.garage;

public class Motorbike extends Vehicle{

	private int wheels;
	private String make;
	
	public Motorbike() {
		super();
	}
	
	public Motorbike(String name, int id) {
		super(name, id);
	}
	
	public Motorbike(String name, int maxSpeed, int seats, int id, int wheels, String make) {
		super(name, maxSpeed, seats, 2);
		this.wheels = wheels;
		this.make = make;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	
	
}
