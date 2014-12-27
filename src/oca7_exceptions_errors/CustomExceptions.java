package oca7_exceptions_errors;

public class CustomExceptions {
	
	// Custom Exceptions
	// checked exceptions dont extend class RuntimeException
	// checked exceptions should be enclosed in a try block
	// the catch block handles the checked exceptions
	// they are foreseen by the method author but are outside immediate control of the code
	// you can nest try-catch-finally blocks

	void doSomething(int num) throws JamesException1 {
		num += num;
		System.out.println(num);
	}

	void saySomething(String words) throws JamesException2 {
		System.out.println(words);
	}
	
	public static void main(String args[]) {
		CustomExceptions ex = new CustomExceptions();
		try {
			ex.doSomething(11);					// if this throws the next two 
												// lines are not executed
												// control is first given to catch 
												// match exception, then finally
			ex.saySomething("Hello");
		}
		catch (JamesException1 e1) {
			System.out.println("Ooops, ex1");
		}
		catch (JamesException2 e2) {
			System.out.println("Ooops, ex2");
		}
		finally {
			System.out.println("Finally");
		}

		// Finally block will always execute (even if a return is present in the catch)
		//	apart from if System.exit is called or a fatal crash occurs
		
		// As such, if both the catch and finally define a return value, the finally
		//	return is always prioritised
		
		// The examples below show the differences between returning a literal value,
		// and returning an object. The finally block may or may not affect the returned
		// value as a result.
		
		System.out.println(ex.returnLiteral());
		System.out.println(ex.returnReference());
		
	}
	
	
	int returnLiteral() {
		int returnVal = 10;
		try {
			int[] array = {1,2,3};
			System.out.println(array[5]);
		}
		catch (Exception e) {
			return returnVal ;		// if the exception is caught, this
									// returns the number 10
		}
		finally {
			returnVal += 10; 		// this is a copy of the literal value 
		}							// passed to the try-catch block
		return returnVal;			// 10 has already been returned as the 
									// exception was caught
	}
	
	
	StringBuilder returnReference() {
		StringBuilder returnVal = new StringBuilder("10");
		try {
			int[] array = {1,2,3};
			System.out.println(array[5]);
		}
		catch (Exception e) {
			return returnVal;
		}
		finally {
			returnVal.append("10"); 	// this is an object reference so changes
										// are made to the actual object. When the 
		}								// finally blocks runs, the returned object 
		return returnVal;				// is 1010
	}

	// Order of catch statements is important, if the base class catch is first
	// it will always get caught even if a derived class more specific catch
	// is after it

}
