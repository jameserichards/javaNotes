package oca6_inheritance;

public class Inheritance {
	
	// inheritance
	//	- derived class accesses non-private members
	//	- derived class cannot access base constructors. Can call, but not inherit
	//  - derived class variables override base class

	// abstract class
	// - is not instantiated. It exists to be inherited
	// - abstract methods must be implemented in the derived class.
	// - If it doesnt implement, it too is abstract

	// Interfaces
	// - implicitly public
	// - only define constants (public static final, etc) that require initialisation
	// - all methods defined in an interface must be implemented as public
	
	// Interfaces do not define the method body so it's possible to implement
	// multiple interfaces because you cannot cause a contradiction.
	// An interface can inherit only other interfaces, but it can inherit multiple

	// class extends class
	// class implements interface
	// interface extends interface
	// abstract class can extend concrete class
	// concrete class can extend abstract class

	// you can use a reference variable of a base class to refer to a derived class
	// you can use a reference variable of a interface to refer to a derived class
	// however you will only be able to access the methods/variables in the base class/interface

}

