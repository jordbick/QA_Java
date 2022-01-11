package com.qa.challenges.person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

	public List<Person> listOfPeople = new ArrayList<>();
	// array list of type Person called listOfPeople

	public void printList() {
		for (Person p : listOfPeople) {
			System.out.println(p);
// for each varible (p) of type Person in listOfPeople print out the variable p, where p is an object of class Person
		}

	}
	
	public void addPerson(Person p) {
		this.listOfPeople.add(p);
		//listOfPeople is an attribute within class PersonList. The this is not strictly necessary
	}
	
	// above is equivalent to:
	// public void addPerson(String name, int age, String jobTitle) {
	// 		this.listOfPeople.add(new Person(name, age, jobTitle));
	// }

	public void findName(String name) {
		for (Person p : this.listOfPeople) {
			if (p.getName().equalsIgnoreCase(name)) {
				System.out.println(p);
			}
			// loop through and if the name of the person of the list matches the inputted name print the object

		}
	}

}
