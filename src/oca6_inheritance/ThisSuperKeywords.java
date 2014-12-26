package oca6_inheritance;

public class ThisSuperKeywords extends Super {
	
	// this.name refers to the instance variable
	// super.name used to access base class during conflict
	
	String name = "THIS";
	
	ThisSuperKeywords(String name) {
		super();											// can be used to call base 
															// class constructor
		
		System.out.println("This is the local constructor");
		
		System.out.println("Method variable - "+name);
		System.out.println("Instance variable - "+this.name);
		System.out.println("Base class variable - "+super.name);
	}

	public static void main(String args[]) {
		ThisSuperKeywords keyword = new ThisSuperKeywords("METHOD");
		
		// cannot use super or this in static methods, as the static is not related
		//		to a specific instance
		
	}
	
}
