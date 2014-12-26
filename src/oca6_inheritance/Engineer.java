package oca6_inheritance;

public class Engineer extends AbstractEmployee {
	
	String[] programmingLanguages;
	void writeCode() {}
	
	public void accessBaseClassMembers() {
		name = "Engineer";			// access base class parameters
		}
	
	public void doWork() {
		System.out.println("Doing Engineering");
	}

}
