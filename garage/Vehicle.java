package com.qa.challenges.garage;

public class Vehicle {

	private String name;
	private int maxSpeed;
	private int seats;
	private int id;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Vehicle(String name, int maxSpeed, int seats, int id) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.seats = seats;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name: " + name + " ID: " + id;
	}
	
}
