package oca6_inheritance;

public class Manager extends AbstractEmployee implements Interviewer {
	
	int teamSize;
	void reportProjectStatus() {}

	public void conductInterview() {
		System.out.println("Manager - conducting interview");
	}
	
	public void doWork() {
		System.out.println("Doing Managing");
	}
	
}
