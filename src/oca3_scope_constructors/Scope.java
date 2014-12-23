package oca3_scope_constructors;

// Scope of variables

public class Scope {

	// Local variables
	//   defined within a method
	//   can have overlapping names with class or instance variables
	double number = 10;
	public double myMethodA() {
		double number = 20;
		return number;
	}

	// Method variables/parameters
	// val is a method variable
	// It's ok to define method parameters with same name as instance variables
	// because the method parameter takes precedence
	public boolean myMethodB(boolean val) { 	
		return val;
	}

	// Instance Variables
	// Available to all non-static methods
	private boolean tested;
	public void setTested(boolean val) { 	
		tested = val;
	}

	// Class Variables
	//	  defined using keyword static
	//	  shared between all instances
	//	  accessible even if object doesn't exist
	static boolean softKeyboard = true;
	
}