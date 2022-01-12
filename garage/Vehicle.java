package com.qa.challenges.garage;

public abstract class Vehicle {

	/***Vehicle attributes:
	 - name
	 - seats
	 - 
	***/
	private String name;
	private int maxSpeed;
	private int seats;
	private int id;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(String name) {
		this.name = name;
	}

	public Vehicle(String name, int maxSpeed, int seats) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.seats = seats;
	}
	
	public abstract double cost();

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
