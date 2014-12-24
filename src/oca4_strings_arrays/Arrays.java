package oca4_strings_arrays;

import notesClassesInterfaces.MyClass;
import notesClassesInterfaces.MyInterface;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arrays {
	
	public void myMethod() {

		// Arrays
		// Stores references to primitives data types, interfaces, abstract class, concrete class
		
		// primitive data array
		int intArray[] = new int[] {4, 8, 107};
		
		// string array
		String strArray[] = new String[] {"James", "Ben","Iain", "Becky"};	

		// multidimentional
		int[] multiArray[];		// all
		int[][] multiArr;		// the
		int mArray[][];			// same

		// arrays are a fixed size once created
		intArray = new int[2];
		strArray = new String[4];
		multiArr = new int[2][3];
		multiArr = new int[2][];		// must be first number

		// array initialisation
		int array[];					// declare
		array = new int[2];				// allocate

		for (int i=0; i<intArray.length; i++) {
			intArray[i] = i + 5;		// initialise array with loop
		}
		intArray[0] = 10;				// initialise each variable
		intArray[1] = 1870;

		// combined into one
		int intArray2[] = {0, 1};
		String[] strArray2 = {"Summer", "Winter"};
		int multiArray2[][] = { {0, 1}, {3, 4, 5} };

		// can use "new" if you want, but you dont have to
		int intArray3[] = new int[]{0, 1};
		String[] strArray3 = new String[]{"Summer", "Winter"};
		int multiArray3[][] = new int[][]{ {0, 1}, {3, 4, 5}};
		
		// need to use 'new' when breaking it across multiple lines
		int intArray4[];
		intArray4 = new int[]{0, 1};
		
		// interface array
		MyInterface[] interfaceArray = new MyInterface[]
				{
					new MyClass(),
					null,
					new MyClass()
				};
		
		MyClass[] classArray = { 
				new MyClass(),
				new MyClass(),
				null
				};

		// object array
		Object[] objArray = new Object[]
				{
					new MyClass(),
					null,
					new MyClass(),
					new java.util.Date(),
					new String("name"),
					new Integer [7]
				};

		// members of an array
		int str = objArray.length;
		Object objArrayClone = objArray.clone();
		
		// ArrayList
		// automatically adjusts to what you put in it.
		// Dont need to define its size
		// Initial length 10
		ArrayList<String> myArrList1 = new ArrayList<String>();
		ArrayList<String> myArrList2 = new ArrayList<>();		// Java 7 and above
		
		// add elements
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");				// add it onto the end
		list.add("four");
		list.add(2, "three");			// add it at position 2

		// accessing elements
		// with enhanced for loop
		for (String element : list) {
			System.out.println(element);
		}

		// with list iterator
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// modify values in an ArrayList
		list.set(1, "One and Half");

		// modify by accessing individual elements - i.e. StringBuilder
		ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
		myArrList.add(new StringBuilder("One"));
		myArrList.add(new StringBuilder("Two"));
		myArrList.add(new StringBuilder("Three"));

		for (StringBuilder element : myArrList) {
			element.append(element.length());	// adds a number onto the end of each 
		}										// element (one3, etc)
												
		// removing element from arraylist
		myArrList.remove("One");				// removes One
		myArrList.remove(1);					// removes element 1

		myArrList.remove(new MyClass());		// will not remove object James unless
												// you override the equals method in object
												// 'James' with the code below:	
											/*
											public boolean equals(Object obj) {
												if (obj instanceof MyPerson) {
													MyPerson p = (MyPerson)obj;
													boolean isEqual = p.name.equals(this.name);
													return isEqual;
												}
												else
													return false;
											}
											*/

		// adding multiple values to array list
		ArrayList<StringBuilder> yourArrList = new ArrayList<StringBuilder>();
		myArrList.addAll(1, yourArrList);		// add new values at position 1
		myArrList.addAll(yourArrList);

		// clear array list
		myArrList.clear();

		// get element from array list
		StringBuilder valFromList = myArrList.get(1);

		// number of elements in array list
		myArrList.size();

		// check if list contans element
		myArrList.contains("One");				// true or false

		// find index of element
		myArrList.indexOf("One");					// print 2

		// last index of element
		myArrList.lastIndexOf("One");				// prints 2

		// clone an array list
		// New array list object is created
		// In a shallow copy the reference variables inside the array list are same
		//	and refer to same object
		ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>) myArrList.clone();

		// can also create array from an array list with toArray
		Object[] objArray2 = myArrList.toArray();

	}
}
