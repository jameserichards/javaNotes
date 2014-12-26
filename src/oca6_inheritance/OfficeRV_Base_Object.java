package oca6_inheritance;


public class OfficeRV_Base_Object {
	
	// using reference object employee for HRExectuive does not allow access to HR executive variables/methods
	
	public static void main(String args[]) {
		AbstractEmployee emp = new HRExecutive();
		
		// Access HR Exec variable - this doesnt work
		emp.specialization = new String[] {"Staffing"};
		System.out.println(emp.specialization[0]);
		
		
		// Access Employee variable - this works fine
		emp.name = "Pavni Gupta";
		System.out.println(emp.name);
		
		// method defined in interface - this doesnt work
		emp.conductInterview(); 
	}

}
