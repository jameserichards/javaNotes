package oca3_scope_constructors;

import handWrittenNotes.PrintJames;

// Scope of variables

public class CreatingObjects {
	
	public void myMethod() {
		
		PrintJames print;				// create new reference variable
		print = new PrintJames();		// new object initialised
	
		// both are valid for String variables
		String obj1 = new String("eJava");
		String obj2 = "Guru";
	
		// Object creation below valid but not accessible via any 
		// reference variable; relevant constructors for the class 
		// are executed
		new PrintJames();
	
		// variables exist until they go out of scope or are set to null
	}
	
	// return types
	public boolean Return() {
		boolean localVariable = true;
		return localVariable;	
	}
	// or
	double instanceVariable;
	double returnWeight() {
		return instanceVariable;
	}
	
	// return can be used to quit a method early
	// return is not required if return type is void
	public void quitEarly(double val) {
		if (val < -1) return;
		instanceVariable = val;
	}

	// variable method parameters
	public void daysOffWork(int... days) {}
	// days can be:	an array
	//				multiple comma separated values
	
	// Allows you to define multiple input parameters, but the variable
	// length list needs to be last in the arguments
	// Varaible length parameters can only occur once in a method parameter list
	public void daysOffWork(String year, int... days) {}

}
