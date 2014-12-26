package oca6_inheritance;

public class Casting {
	
	public static void main(String ars[]) {
		
		Interviewer interviewer = new HRExecutive();
		((HRExecutive)interviewer).specialization = new String[] {"Staffing"};
		((HRExecutive)interviewer).conductInterview();		// works fine
		
		// ((Manager)interviewer).conductInterview();		// doesnt work because object 
															// that is being cast is not of 
															// type Manager
		
		Interviewer interviewerTwo = new Manager();
		((Manager)interviewerTwo).conductInterview();		// works fine because variable 
															// that is being cast is a Manager 
															// object
		
	}

}
