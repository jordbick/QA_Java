package com.qa.challenges.singleton;

// Singleton is used when you want to eliminate the option of instatiating more than one object to a class
public class Singleton {

	private static Singleton firstInstance = null;
	// The one and only instance for this class
	public String value;
	
	private Singleton(String value) {
		// private constructor to ensure there is only one instance of class Singleton
		// Private prevents other objects from using the new operator with the Singleton class
		this.value = value;
	}
	
	
	public static Singleton getInstance(String value) {
	// method used for the singleton pattern
	// static method that acts as a constructor
	// it calls the private constructor to create an object and saves it in a static field
		if(firstInstance == null) { 
			// checks if an object has been created
			firstInstance = new Singleton(value); 
			// only way that someone can create a new instance is if one does not already exist 
		} 
		return firstInstance;
		// method that checks if instance already exists, if exists it returns the instance
		// if instance does not exist it create a new instance
	}
}
// so now you can use this method to try and instatiate a new object to Singleton which contains String value
// if the firstInstance is null it will instatiate a new object. 
// Otherwise it will return the object already instatiated