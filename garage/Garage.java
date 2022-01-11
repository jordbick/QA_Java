package com.qa.challenges.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vehicle> vehiclesInGarage = new ArrayList<>();

	public void addVehicle(Vehicle v) {
		this.vehiclesInGarage.add(v);
	}

	public double returnBill() {
		double bill = 0;
		double carBill = 0;
		double motorbikeBill = 0;
		double planeBill = 0;
		for (Vehicle v : vehiclesInGarage) {
			if (v instanceof Car) {
				bill += 10.00d;
				carBill += 10d;
			} else if (v instanceof Motorbike) {
				bill += 5.00d;
				motorbikeBill += 5d;
			} else if (v instanceof Plane) {
				bill += 100.00d;
				planeBill += 100.00d;
			}
		}
		System.out.println(
				"Car bill: £" + carBill + ". Motorbike bill: £" + motorbikeBill + ". Plane bill: £" + planeBill);
		System.out.println("Total bill: £" + bill);
		return bill;

	}

	public void displayGarge() {
		System.out.println("Vehicles in garge:");
		for (Vehicle v : vehiclesInGarage) {
			System.out.println(v);
		}
	}

	public void removeVehicleById(int i) {
		for (int j = 0; j < vehiclesInGarage.size(); j++)
			if (vehiclesInGarage.get(j).getId() == i) {
				vehiclesInGarage.remove(j);
				System.out.println("Vehicle: " + vehiclesInGarage.get(j).getName() + " removed from garage");
			}
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

	public void clearGarage() {
		vehiclesInGarage.clear();
		System.out.println("All vehicles cleared from garage");
	}

	public void removeVehicleByType(String type) {
		for (int i = 0; i < vehiclesInGarage.size(); i ++) {
			if (type.equalsIgnoreCase("car")) {
				if (vehiclesInGarage.get(i) instanceof Car) {
					vehiclesInGarage.remove(i);
				}
			}
			if (type.equalsIgnoreCase("motorbike")) {
				if (vehiclesInGarage.get(i) instanceof Motorbike) {
					vehiclesInGarage.remove(i);
				}
			}
			if (type.equalsIgnoreCase("plane")) {
				if (vehiclesInGarage.get(i) instanceof Plane) {
					vehiclesInGarage.remove(i);
				}
			}
		}
	}
}