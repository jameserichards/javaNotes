package oca6_inheritance;

public class OfficeRV_Own_Object {
	
	// using a variable of the derived class to access its own object
	
	// reference variable of HRExecutive for HRExecutive object. Allows access to all variables/methods

	public static void main(String args[]) {
		HRExecutive hr = new HRExecutive();
		
		// Access HR Exec variable - this works fine
		hr.specialization = new String[] {"Skills"};
		System.out.println(hr.specialization[0]);
		
		
		// Access Employee variable - this works fine
		hr.name = "James";
		System.out.println(hr.name);
		
		// method defined in interface - this works fine
		hr.conductInterview(); 
		
	}

}
