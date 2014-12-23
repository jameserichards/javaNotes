package oca3_scope_constructors;

public class Constructors {

	// Constructors
	//   Used to build out initial configuration when instance is created
	//   Default constructors are run by JVM if not constructor is defined
	//	 e.g. pass things in at instance creation but dont use them in constructor...?
	//   Allows arguments to be passed in when creating the instance
	String name;
	int number;
	Constructors(int input) {
		number = input;
		name = "James";
		System.out.println("Constructor has run");
	}
	
	// Overloaded constructors
	Constructors(String newName) {
		name = newName;
		number = 25;
	}
	Constructors(int newAge, String newName) {
		name = newName;
		number = newAge;
	}
	Constructors(String newName, int newAge) {
		name = newName;
		number = newAge;
	}

	// Invoke one constructor from another with 'this'
	// 'this' MUST be first line of code in constructor
	// Finds constructor compatible with these arguments
	Constructors() {
		this(10);
	}
	
	// initialise block is not a contstructor. Runs for every instance created
	//		used to initialise variables of anonymous classes
	{
		System.out.println("Class:initializer");
	}

	public static void main(String[] args) {
		int age = 10;
		Constructors con = new Constructors();
	}

}
/*


}
*/