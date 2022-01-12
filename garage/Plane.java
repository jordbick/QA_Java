package com.qa.challenges.garage;

public class Plane extends Vehicle{

	private int maxPassengers;
	private int engineNumber;
	
	public Plane() {
		super();
	}
	
	public Plane(String name) {
		super(name);
	}
	
	public Plane(String name, int maxSpeed, int seats, int maxPassengers, int engineNumber) {
		super(name, maxSpeed, seats);
		this.maxPassengers = maxPassengers;
		this.engineNumber = engineNumber;
	}


	public int getMaxPassengers() {
		return maxPassengers;
	}


	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}


	public int getEngineNumber() {
		return engineNumber;
	}


	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}

	@Override
	public double cost() {
		return 1000;
	}
	
	
	
}
