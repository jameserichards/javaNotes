package oca6_inheritance;

public class HRExecutive extends AbstractEmployee implements Interviewer {
	
	String[] specialization;
	
	public void conductInterview() {
		System.out.println("HRExecutive - conducting interview");
		
	}
	
}