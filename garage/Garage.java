package com.qa.challenges.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehiclesInGarage = new ArrayList<>();

	private int currentID;

	public void addVehicle(Vehicle v) {
		v.setId(++currentID);
		this.vehiclesInGarage.add(v);
	}

	public void displayGarge() {
		System.out.println("Vehicles in garge: \n");
		for (Vehicle v : vehiclesInGarage) {
			System.out.println("Vehicle details:");
			System.out.println(" " + v);
		}
	}

	public void clearGarage() {
		vehiclesInGarage.clear();
		System.out.println("All vehicles cleared from garage");
	}

	public void removeVehicleById(int id) {
		for (Vehicle v : vehiclesInGarage)
			if (v.getId() == id) {
				System.out.println("Vehicle: " + v.getName() + " removed from garage");
				vehiclesInGarage.remove(v);
				return;
			}
	}

	public void removeVehicleByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : this.vehiclesInGarage) {
			if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(v);
			}
		}
		this.vehiclesInGarage.removeAll(toRemove);
		System.out.println("All " + type + "s have been removed from the garage");
	}

	public double fixVehicle(String name) {
		double bill = 0;
		for (Vehicle v : vehiclesInGarage) {
			if (v.getName().equalsIgnoreCase(name)) {
				if (v instanceof Car) {
					bill = 10.00d;
				} else if (v instanceof Motorbike) {
					bill = 5.00d;
				} else if (v instanceof Plane) {
					bill = 100.00d;
				}
			}
		}
		System.out.println("Vehicle " + name + " fixed. The cost is: " + bill);
		return bill;
	}

	public double returnBill() {
		double bill = 0d;
		for (Vehicle v : this.vehiclesInGarage) {
			bill += v.cost();
		}
		if (vehiclesInGarage.size() > 0) {
			System.out.println("Total bill: £" + bill);
		} else {
			System.out.println("No vehicles in garage");
		}
		return bill;
	}
	/*
	 * public double returnBill() { double bill = 0; double carBill = 0; double
	 * motorbikeBill = 0; double planeBill = 0; for (Vehicle v : vehiclesInGarage) {
	 * if (v instanceof Car) { bill += v.cost(); carBill += v.cost();
	 * System.out.println(v.getName() + " will cost " + v.cost() + " to fix"); }
	 * else if (v instanceof Motorbike) { bill += v.cost(); motorbikeBill +=
	 * v.cost(); System.out.println(v.getName() + " will cost " + v.cost() +
	 * " to fix"); } else if (v instanceof Plane) { bill += v.cost(); planeBill +=
	 * v.cost(); System.out.println(v.getName() + " will cost " + v.cost() +
	 * " to fix"); } } if (vehiclesInGarage.size() > 0) { System.out.println(
	 * "Car bill: £" + carBill + ". Motorbike bill: £" + motorbikeBill +
	 * ". Plane bill: £" + planeBill); System.out.println("Total bill: £" + bill); }
	 * else { System.out.println("No vehicles in garage"); } return bill;
	 * 
	 * }
	 */
}