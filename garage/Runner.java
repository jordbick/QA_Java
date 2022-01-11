package com.qa.challenges.garage;

public class Runner {

	public static void main(String[] args) {


		Car cary = new Car("cary", 1);
		Motorbike bikey = new Motorbike("bikey", 2);
		Plane planey = new Plane("planey", 3);
		Plane planey1 = new Plane("planey1", 4);
		
		Garage garage1 = new Garage();
		
		garage1.addVehicle(planey);
		garage1.addVehicle(bikey);
		garage1.addVehicle(cary);
		garage1.addVehicle(planey1);
		
		garage1.returnBill();
		
		garage1.displayGarge();
		
		garage1.removeVehicleById(1);
		
		garage1.displayGarge();
		
		garage1.removeVehicleByType("plane");
		
		garage1.displayGarge();

	}

}
