package oca6_inheritance;

public abstract class AbstractEmployee implements Interviewer {
	
	String name;
	String address;
	String phoneNumber;
	float experience;
	
	@Override
	public void conductInterview() {}

	@Override
	public void doWork() {}
	
}
