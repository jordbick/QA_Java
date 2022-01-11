package com.qa.challenges.person;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Jordan", 28, "Student");
		Person person2 = new Person("Daniel", 16, "Student");
		
		
		PersonList newPeople = new PersonList();
		//this is instatiating the object newPeople to PersonList, i.e. it is creating a new list called newPeople
		
		newPeople.addPerson(person1);
		newPeople.addPerson(person2);
		
		newPeople.printList();
		
		newPeople.findName("Daniel");
		// can set this to a variable if desired
		
	}

}
