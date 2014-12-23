package oca1_main_modifiers;
	
// Final class cannot be extended
// interfaces cannot be marked as final
final class NonAccessModifiers_Final {

	//		Final variables	= 	Final variables cannot be reassigned a value, it can  
	//							only be assigned once
	//					  		A final variable can still have it's methods called
	final int integer = 10;
	
	//	Final method		= defines base class that cannot be overrriden by derived class
	//							for example a class extending FinalClassExample cannot override
	//							doSomething()
	final void doSomething() {}
	
}