package oca4_strings_arrays;

import notesClassesInterfaces.MyClass;

public class Strings {
	
	public static void main(String[] args) {
	
		// String
		String str1 = new String("Paul");
		String str2 = new String("Paul");
		System.out.println(str1 == str2);		// false, comparing variable references not values

		String str3 = "Harry";
		String str4 = "Harry";
		System.out.println(str3 == str4);		// true, compares values
	
		// Strings are stored in a pool. str3 and str4 point to same value in pool memory
		// When a new String is created java checks if same value already exists and simply 
		// adds new reference
	
		System.out.println("Morning");			// adds new string to constant pool if	
												// it doesn't exist already. Different
												// from the String object pool
	
		// also valid:
		String girl = new String("Shreya");
		char[] name = new char[]{'P','a','u','l'};
		String boy = new String(name);
	
		StringBuilder sd1 = new StringBuilder("String Builder");
		String str5 = new String(sd1);
		StringBuffer sbuff2 = new StringBuffer("String Buffer");
		String str6 = new String(sbuff2);
	
		// Strings are immutable
		// Once created they are never changed, they are marked as final
		// Strings are stored in a char array. We can't reassign the char 
		// array, however we can alter individual characters. This is what
		// happens when various string methods are called
	
		// charAt()
		String myName = new String("Paul");
		System.out.println(myName.charAt(0));				// P
		System.out.println(myName.charAt(2));				// u
	
		// indexOf()
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B'));		// 1
		System.out.println(letters.indexOf("S"));		// -1
		System.out.println(letters.indexOf("CA"));		// 2
		System.out.println(letters.indexOf('B', 2));	// set search index to 2
														// returns 4
	
		// substring()
		String exam = "Oracle";
		String sub = exam.substring(2);
		System.out.println(sub);						// acle
	
		String word = "Oracle";
		String result = exam.substring(2, 4);
		System.out.println(result);						// ac
	
		// trim()
		String varWithSpaces = " AB CB   ";
		System.out.print(":");
		System.out.print(varWithSpaces);
		System.out.print(":");							// : AB CB  :
	
		System.out.print(":");
		System.out.print(varWithSpaces.trim());
		System.out.print(":");							// :AB CB:
	
		// replace()
		letters = "ABCAB";
		System.out.println(letters.replace('B', 'b'));		// AbCAb		
		System.out.println(letters.replace("CA", "12"));	// AB12B
		// can use either " or ' but as long as it's consistent. Cant mix " and '
		//		in same call
	
		// length()
		System.out.println("Shreya".length());				// 6
	
		// startsWith() and endsWith()
		letters = "ABCAB";
		System.out.println(letters.startsWith("AB"));		// true
		System.out.println(letters.startsWith("a"));		// false
		System.out.println(letters.startsWith("A", 3));		// true
	
		System.out.println(letters.endsWith("CAB"));		// true
		System.out.println(letters.endsWith("B"));			// true
		System.out.println(letters.endsWith("b"));			// false
	
		// String Method Chaining
		String day = "Sunday  ".replace(' ', 'Z').trim().concat("M n");
		System.out.println(result);							// SundayZZM n
	
		day = "SunDday";
		day.replace('D', 'Z').substring(3);
		System.out.println(day);							// SunDday because
															// day is immutable
		
		day = day.replace('D', 'Z').substring(3);
		System.out.println(day);							// Zday
	
		// String objects and operators
		int num = 10;
		int val = 12;
		String aStr = "OCJA";
		String anotherStr = num + val + aStr;
		System.out.println(anotherStr);						// 22OCJA
		anotherStr = "" + num + val + aStr;					// 1012OCJA
	
		String lang = "James";
		lang += " is a person";								// James is a person
	
		String initializedToNull = null;
		initializedToNull += "James";
		System.out.println(initializedToNull);				// nullJames
	
		// String equality
		String var1 = new String("Java");
		String var2 = new String("Java");
		System.out.println(var1.equals(var2));				// true
		System.out.println(var1 == var2);					// false
		System.out.println(var1 != var2);					// true
	
		String var3 = "code";
		String var4 = "code";			
		System.out.println(var3.equals(var4));				// true
		System.out.println(var3 == var4);					// true
		System.out.println(var3 != var4);					// false
	
		// Mutable Strings: StringBuilder
		// Used with larger strings, or strings you intend to modify often
		// Non-final
		// Char array
		StringBuilder sb1 = new StringBuilder();			// initial capacity 16
		StringBuilder sb2 = new StringBuilder(sb1);
		StringBuilder sb3 = new StringBuilder(50);
		StringBuilder sb4 = new StringBuilder("James");		// length is str.length + 16
	
		// StringBuilder methods
		// append()
		StringBuilder sb5 = new StringBuilder();
		sb5.append(true);
		sb5.append(10);										// true10
	
		StringBuilder sb6 = new StringBuilder();
		char[] string = {'J', 'a', 'v', 'a', '7'};
		sb6.append(string, 1, 3);
		System.out.println(sb6);							// ava
	
		StringBuilder sb7 = new StringBuilder();
		sb7.append("Java");
		sb7.append(new MyClass());
		System.out.println(sb7);
		// JavahandWrittenNotes.PrintJames@1c869e8f
		// if PrintJames had a toString method it would append the return value
	
		// insert()
		// like append but allows you to add data at specific position
		StringBuilder sb8 = new StringBuilder("Jams");
		sb8.insert(3, 'e');
		System.out.println(sb8);							// James
	
		// insert subset of char array
		StringBuilder sb9 = new StringBuilder("123");
		char[] stringTwo = {'J', 'a', 'v', 'a'};
		sb9.insert(1, stringTwo, 1, 3);
		System.out.println(sb9);							// 1ava23	adds 1,2,3
	
		// delete() and deleteCharAt()
		StringBuilder sb10 = new StringBuilder("0123456");
		sb10.delete(2, 4);
		System.out.println(sb10);							// 01456	doesnt delete 4
	
		StringBuilder sb11 = new StringBuilder("0123456");
		sb11.deleteCharAt(2);
		System.out.println(sb11);							// 013456
	
		// reverse()
		StringBuilder sb12 = new StringBuilder("0123456");
		sb12.reverse();
		System.out.println(sb12);							// 6543210
	
		// replace()
		StringBuilder sb13 = new StringBuilder("0123456");
		sb13.replace(2, 4, "ABCD");
		System.out.println(sb13);							// 01ABCD456	
															// chars 2 and 3 replaced
	
		// subSequence()
		StringBuilder sb14 = new StringBuilder("0123456");
		System.out.println(sb14.subSequence(2, 4));			// 23
		System.out.println(sb14);							// 0123456

	}

}
