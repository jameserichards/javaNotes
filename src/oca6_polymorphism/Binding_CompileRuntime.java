package oca6_polymorphism;

public class Binding_CompileRuntime {
	
	// binding methods and varaibles at compile / runtime
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee coder = new Coder();
		System.out.println(emp.name);			// Employee - because at compile time base class
								// variables are bound. Not 'fresheshed' until runtime
		System.out.println(coder.name);			// Employee
		emp.printName();				// Employee
		coder.printName();				// Programmer - runtime
	}

	// Interfaces can also be used to define abstract methods which are then each implemented
	// differently by derived classes due to polymorphism.
	
	// Be careful not to define object reference variable as base class type if the derived 
	// class implements interfaces which the base class cannot see

}
