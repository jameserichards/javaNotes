package oca2_primitives_operators;

import handWrittenNotes.PrintJames;

public class Primitives {
	
	// Primitive data types
	// boolean, char, numeric (float and int)

	// A literal is a fixed value that does not need further
	//		calculation to be assigned to any variable
	
	
	// char   	= 	\u0000 to \uffff
	// 			=	cannot assign negative numbers
	char c1 = 'Z';
	char c2 = 122; 			// this is a z
	char c3 = '\u0122';		// this is a z
	char c4 = (char)-122;	// this is allowed but the minus gets added into 
							//    the bitstream and gives weird values

	// byte		=	integer
	//			=	8 bits
	//			=	-128 to 127
	byte bits = 50;
	
	// short	=	integer
	//			= 	16 bits
	//			=	-32768 to 32767
	short sh = 14000;	
	
	// int		=	integer
	//			=	32 bits
	//			=	-2 billion to +2 billion
	int number = 502924340;
	int baseDecimal = 267;
	int octVal = 0413;
	int hexVal = 0x10B;
	int binVal = 0b100001011;
	
	// long		=	integer
	//			=	64 bits
	// 			= 	default format is int. To make it long add L / l
	long bigNumber = 290238954239540L;
	
	// Floating points numbers / Decimal literals
	//	 Decimal literal default type is double
	//	 Add F to force it to become a float.
	//	 Add D to force it to become a double.
	//	 Add e scientific notation for literal double
	//	 Can use underscore notation, however not next to a decimal point or a F/D
	//	 Float uses less memory than double
	float myFloat = 10.0F;
	double myDouble1 = 20.0;
	double myDouble2 = 20.0D;
	
	// boolean	= True or false
	boolean lightSwitch = true;
	
	// Underscores
	//	 Can be added mid-number to help readability 0b1_10010_01.
	//	 Does not change the number
	//   Cannot start or end literal values with underscore
	//	 Cannot place underscore right after prefix 0x_, 0b_
	//	 Can place underscore after 0_
	//	 Cannot place underscore before L
	//	 Cannot use underscore in string of digits
	int i = Integer.parseInt("45_98");   // does not work


	// Identifiers
	//		Names of things
	//		Can use normal letters
	//		Can use numbers, but not at starting position
	//		Can use currency sign
	//		Cannot use special characters
	//		Cannot use Java key words

	// Primitive variables
	// 		Stores actual value
	// 		7 is actually stored in the stack
	int a = 7;

	// Reference variables
	// 		Stores address of object it refers to in the stack, not the actual object.
	// 		jamesRV = reference variable for object in memory
	// 		PrintJames() = object
	PrintJames jamesRV = new PrintJames();

}
