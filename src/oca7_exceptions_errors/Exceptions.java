package oca7_exceptions_errors;

import java.io.IOException;

public class Exceptions {
	
	// Exception handling

	class RiverRafting {

		void exceptionExample(int degree) throws IOException {
			System.out.println("Cross Rapid");
			if (degree > 10) throw new IOException();
		}

	}
	

}
