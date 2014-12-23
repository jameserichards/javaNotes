package oca1_main_modifiers;

// Non-access modifiers changes the default proporties of 
//		a class and its members

//Abstract Class class cannot be instantiated
abstract public class NonAccessModifiers_Abstract {
	
	//	variables cannot be abstract
	private String name;
	
	//	Abstract Methods have no body. Usually implemented by a derived class
	public void displayName() {}		// non abstract, hence {}
	public abstract void perform();		// abstract therefore no {}

}

// Interfaces are abstract by default, so an "abstract interface" redundant			