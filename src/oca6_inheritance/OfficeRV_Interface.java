package oca6_inheritance;


public class OfficeRV_Interface {

	// using reference object of type interface only allows access to interface methods/variables
	
	public static void main(String args[]) {
		Interviewer interviewer = new HRExecutive();
		
		// Access HR Exec variable - this doesnt work
		interviewer.specialization = new String[] {"Staffing"};
		System.out.println(interviewer.specialization[0]);
		
		
		// Access Employee variable - this doesnt work
		interviewer.name = "Pavni Gupta";
		System.out.println(interviewer.name);
		
		// method defined in interface - this works fine
		interviewer.conductInterview(); 
	}

}
