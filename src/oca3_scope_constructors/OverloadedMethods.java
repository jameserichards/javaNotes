package oca3_scope_constructors;

public class OverloadedMethods {
	
	/// Overloaded method
	//	  Allows creation of multiple same named methods to allow different calls
	//	  Must all have different input parameters
	//	  May/not define different return type
	//	  May/not define different access modifiers
	//	  Cant be defined by just changing modifiers/return type

	double myMethod(double one, int two) {
		return (one + two)/2.0;
	}
	double myMethod(int one, double two) {
		return (one + two)/2.0;
	}
	
	public static void main(String args[]) {
		OverloadedMethods overload = new OverloadedMethods();		 
		
		// problems may arise if data is passed that can go in either 
		// overloaded method compile error, it doesn't know which one 
		// is which, e.g.
		overload.myMethod(2, 3);	 // does not work
		
		// these are fine
		overload.myMethod(2.0, 3);		
		overload.myMethod(2, 3.0);		
	}

}
