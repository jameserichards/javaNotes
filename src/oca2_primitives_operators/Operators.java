package oca2_primitives_operators;

public class Operators {
	
	int a,b,c = 0;
	
	public void operators() {
		
		// Assignment operators
		a = 6;
		a += 6;
		a -= 6;
		a *= 6;
		a /= 6;
		
		// starts from right
		// b assigned value of c
		// a assigned values of b
		a = b = c;

		
		// Arithmetic Operators
		a = b + c;
		a = b - c;
		a = b * c;
		a = b / c;
		a = b %	c;  // remainder after division
		
		a++;
		++a;
		a--;
		--a;

		a = 20;
		b = 10;
		c = b - a++;
		System.out.println(c);	//  10 is applied after operation
		System.out.println(b);	//  11

		a = 20;
		b = 10;
		c = a - ++b;
		System.out.println(c);	//  9	is applied before operation
		System.out.println(b);	//  11

		a = 10;
		a = a++ + a  + a-- - a-- + ++a;  //  32
		b = 10 + 11 + 11 - 10 + 10;	 	 //  32

		// Relational operators
	    if (a > b) {}
	    if (a >= b) {}
   		if (a < b) {}
		if (a <= b) {}
		if (a == b) {}
		if (a != b) {}

		// logical operators
		boolean A = true;
		boolean B = false;
		if(A && B) {}	// AND
		if(A ||	B) {}	// OR
		if(!A) {}		// NOT

		// Operator Precedence
		// Postfix			A++  A--
		// Unary			++A  --A !
		// Multiplication	* / %
		// Addition			+ -
		// Relational		< > <= >=
		// Equality			== !=
		// AND				&&
		// OR				||
		// Assignment		= += -= %=

	}
	

}
