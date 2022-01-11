package com.qa.challenges.garage;

public class Plane extends Vehicle{

	private int maxPassengers;
	private int engineNumber;
	
	public Plane() {
		super();
	}
	
	public Plane(String name, int id) {
		super(name, id);
	}
	
	public Plane(String name, int maxSpeed, int seats, int id, int maxPassengers, int engineNumber) {
		super(name, maxSpeed, seats, 3);
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
	
	
	
}
