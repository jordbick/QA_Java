package com.qa.challenges.garage;

public class Runner {

	public static void main(String[] args) {


		Car cary = new Car("Mini");
		Motorbike bikey = new Motorbike("Suzuki");
		Plane planey = new Plane("Boeing");
		Plane planey1 = new Plane("RyanAir plane");
		
		Garage garage1 = new Garage();
		
		garage1.addVehicle(planey);
		garage1.addVehicle(bikey);
		garage1.addVehicle(cary);
		garage1.addVehicle(planey1);
		
		
		garage1.returnBill();
		
		garage1.displayGarge();
		
		garage1.removeVehicleById(3);
		
		garage1.displayGarge();
		
		garage1.removeVehicleByType("Plane");
		
		garage1.displayGarge();

	}

}
