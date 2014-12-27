package oca7_exceptions_errors;

import java.util.ArrayList;
import java.lang.NumberFormatException;

public class Errors {
	
	// Errors
	// Serious problems
	// JVM should really be catching these
	// ExceptionInInitializerError		// when a static initialiser block {} has a error
										// when a static variable has an error in a class
										// caused by runtime exception only
	// StackOverflowError				// recursive call typically causes this
	// NoClassDefFoundError				// cannot find class file, either bad class path or
										// 	program is run before it is compiled
	// OutOfMemoryError					// run out of space on the heap, garbage collector 
										//	cannot free up more space for you
	
	void myMethod() {
		try {
			myMethod();
		}
		catch (StackOverflowError s) {
			System.out.println(s);
		}
	}

	// InntegalArgumentException can be used for validation
	public void login(String username, String pwd, int maxLoginAttempt) {
		if (username == null || username.length() < 6)
			throw new IllegalArgumentException
				("Login:username can’t be shorter than 6 chars");

		if (pwd == null || pwd.length() < 8)
			throw new IllegalArgumentException
				("Login: pwd cannot be shorter than 8 chars");

		if (maxLoginAttempt < 0)
			throw new IllegalArgumentException
				("Login: Invalid loginattempt val");

	}
	
	void numberFormatException(String val) {
		// NumberFormatException
		// useful for converting command line arguments (Strings) to numeric values
		try {
			System.out.println(Integer.parseInt(val));			// base 10, bad
			System.out.println(Integer.parseInt(val, 16));		// base 16, good
		}
		catch (NumberFormatException e) {
			throw new NumberFormatException(val+" cannot be converted to hexadecimal number");
		}
	}

	// Null pointer exception
	// validation
	static ArrayList<String> list;
	
	public static void main(String[] args) {
		
		Errors err = new Errors();
		// demonstrates catching recursive overflow
		err.myMethod();			
		
		// demonstrates number format exception
		err.numberFormatException("12ABCD");
		
		// demonstrates null pointer exception
		if (list!=null)			// this is ok because instance variables are 
			list.add("1");		// automatically initialised to null
		
		/* 
		ArrayList<String> list2;
		if (list2!=null)			// this is not ok - local variable has no initialisation
			list2.add("1");			//	will not respond to null
		*/
	}
	
}


