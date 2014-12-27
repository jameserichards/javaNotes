package oca7_exceptions_errors;

import java.io.*;

public class ReThrow {
	
	FileInputStream soccer;
	
	// rethrow exception
	// allows you to catch an exception that will be thrown by the code
	// you can then decide what to do with it - i.e. rethrow it
	public void myMethod1() throws FileNotFoundException {	// need this throws reference here
		try {
			soccer = new FileInputStream("soccer.txt");
		}
		catch (FileNotFoundException fnfe) {
			// i can put my own code here
			throw fnfe;							// here I am rethrowing file not found
			
		}	
	}

	// if you dont want your code to handle the exception just make it throw it
	// this throws the exception to the stack
	// methods calling myMethod2 need to catch or declare IOException as rethrown
	public void myMethod2() throws IOException {	
		FileInputStream soccer = new FileInputStream("soccer.txt");
		soccer.close();
	}

}
