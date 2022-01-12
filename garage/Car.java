package com.qa.challenges.garage;

public class Car extends Vehicle{

	private int doors;
	private boolean isManual;
	
	public Car() {
		super();
	}
	
	public Car(String name) {
		super(name);
	}
	
	public Car(String name, int maxSpeed, int seats, int doors, boolean isManual) {
		super(name, maxSpeed, seats);
		this.doors = doors;
		this.isManual = isManual;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	@Override
	public double cost() {
		return 100d;
	}
	
	
	
}
