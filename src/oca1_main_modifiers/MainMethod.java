
// Directory structure should match the package structure
package oca1_main_modifiers;

// Importing a class does not import recursively the  classes below it
// com.oracle.javacert.*;  does not import  com.oracle.javacert.associate.*;
import notesClassesInterfaces.MyClass;

// import static  -  imports static members of a class
// Allows access to variable printJamesStatic without prefixing class name
// this is because it is public
import static notesClassesInterfaces.MyClass.printJamesStatic;

// public class or interfaces should match the name of the Java sourcecode file
// source code file can only define 1 public class or interface
public class MainMethod {
	
	
	// Executable java class will start its execution at a specific point when
	// handed to JVM - this is the main method
	// Needs to be public static (order interchangeable)
	// Needs to return void
	// Needs to be called main
	// Needs to accept args:  singular (String args...)
	//						  array    (String args[])	
	public static void main(String args[]) {
		System.out.println("James");	
		
	}
	
}