package com.qa.data_types;

public class Results {

	//fields have a class scope
	// - they can be accessed anywhere inside this class
	
	// exam scores
	int physics;
	int chemistry;
	int biology;

	double total;
	double percent;

	public void displayResults() {
		total = physics + chemistry + biology;
		System.out.println("Physics score: " + physics + "\n" + "Chemistry score: " + chemistry + "\n"
				+ "Biology score: " + biology + "\n" + "Total score: " + total);
	}

	public void displayPercentage() {
		displayResults();
		percent = total / 450 * 100;
		System.out.println("Percent: " + percent + "%");
		
		if (percent <60) {
			System.out.println("Fail!");
		}
		if (physics < 90) {
				System.out.println("Fail in Physics!");
			}
		if (chemistry < 90) {
				System.out.println("Fail in Chemistry!");
			}
		if (biology < 90) {
				System.out.println("Fail in Physics!");
			} 
		
		if ((percent >= 60) && (physics >= 90) && (chemistry >= 90) && (biology >= 90)) {
			System.out.println("Pass!");
		}
		
	}
	}
