package oca7_exceptions_errors;

public class RuntimeExceptions {
	
	// runtime / unchecked exceptions
	// Programming errors
	// ArrayIndexOutOfBoundsException	// generally found and handled by JVM
	// IndexOutOfBoundsException 		// generally found and handled by JVM
	// ClassCastException 				// cast a derived class to another derived class
	// IllegalArgumentException			// input arguments are wrong
	// IllegalStateException			// not an appropriate time for this operation
										// can be used to validate code - i.e. edit text 
										//     during transmission
	// NullPointerException				// access array/list that is uninitialised
	// NumberFormatException			// convert string with inappropriate format to numeric type
	
	public static void main(String args[]) {
		int[] array = {1,2,3,4};
		try {
			System.out.println(array[5]);
		}
		catch (ArrayIndexOutOfBoundsException e){	// catch runtime exception
			System.out.println("Exception caught");
		}
	}


}
