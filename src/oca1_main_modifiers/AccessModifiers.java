package oca1_main_modifiers;

public class AccessModifiers {
	
	//	Access modifiers
	//	  Affects how accessible methods/variables are outside the class/package
	//	  can be applied to classes, interfaces, and their members
	//	  local variables and method parameters are not defined with access modifiers
	//		
	//	  public --> protected --> default/package --> private
	//	
	//	  public 		= accessible from outside the class to other packages
	//	  protected 	= accessible to extended classes even if in separate package
	//    default		= only accessible to classes and interfaces within the same package
	//	  private		= only accessible to the members inside the class, even if other
	//							 class is in the same package
	//
	protected void printJava() {
		System.out.println("Java");
	}

}
