package oca6_polymorphism;

import oca6_inheritance.*;

public class Polymorphism {
	
	public static void main(String args[]) {

		// Polymorphism
		// A method with the same name may do different things in different derived classes
		
		AbstractEmployee emp1 = new Engineer();
		AbstractEmployee emp2 = new Manager();
		emp1.doWork();
		emp2.doWork();

		// doWork() must be defined in the employee class
		//	so that objects can use the .doWork method
		//	however each method is different because each reference variable
		//	supports a different type of object (engineer and manager).
		//	In this case Employee is an abstract class to allow this definition
		//	Each method must use same return type, input parameters for it to 
		//  override properly
		//	Access modifiers cannot be more restrictive, but can be less restrictive

		// overloaded methods do not participate in polymorphism, only overridden methods


	}

}
