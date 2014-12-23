package oca1_main_modifiers;

// Static class/interfaces  = Not in the OCA associate.
//							= It is a type of nested class
//							= The top level class/interface cannot be static

public class NonAccessModifiers_Static {
	
	//	Static Variables	= common amongst all instances of a class
	//						= can be accessed even if no instances are created
	//						= non-static methods can use static variables
	//						= typically define constants as static members to 
	//								allow use across objects and classes
	//						= used by static methods
	int number;
	static int numberStatic;

	//  Static methods		= not associated with objects
	//						= cannot use instance variables of a class
	//						= are used to access/manipulate static variables
	static int useStaticVarible() {
		return numberStatic;
	}
		
}

