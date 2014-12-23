package oca3_scope_constructors;

public class Encapsulation {
	
	// read/write variables
	//		using methods
	//		using constructors
	//		directly access variable
	public static void main(String[] args){
		Encapsulation o1 = new Encapsulation();
		Encapsulation o2 = new Encapsulation();
		
		o1.name = "Selvan";
		
		// Call methods on objects
		o2.setName("Harry");
	}

	private String name;
	public void setName(String val) {
		name = val;
	}

	// Encapsulation
	//    Correctly encapsulated objects dont allow access to variables/methods
	//    that is not warranted. Use access modifiers to control this.
	//    Input validation is easier with setter methods because you can use if statements
	//    to validate values
	private double weight;
	public void setWeight(double val) {
		if (val > 0 && val < 1000) {
			weight =val;
		}
	}
	
}
