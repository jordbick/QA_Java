package com.qa.data_types;

// New calculator class Calculator
public class Calculator {
	
	public int addition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public int multiply(int n1, int n2) {
		int product = n1 * n2;
		return product;
	}
	public int subtract(int n1, int n2) {
		int difference = n1 - n2;
		return difference;
	}
	
	
	
	public String divide(double n1, double n2) {
		if (n2 > n1) {
			return "Division cannot be performed";
		} else {
		double quotient = n1 / n2;
		return String.valueOf(quotient);
		}
	}
	
}
