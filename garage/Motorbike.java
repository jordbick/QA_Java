package com.qa.challenges.garage;

public class Motorbike extends Vehicle{

	private int wheels;
	private String make;
	
	public Motorbike() {
		super();
	}
	
	public Motorbike(String name) {
		super(name);
	}
	
	public Motorbike(String name, int maxSpeed, int seats, int wheels, String make) {
		super(name, maxSpeed, seats);
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

	@Override
	public double cost() {
		return 50;
	}
	
	
	
}
