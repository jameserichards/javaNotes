package oca5_if_switch_loops;

import java.util.ArrayList;
import java.util.Iterator;

import notesClassesInterfaces.MyClass;

public class ForLoop {
	
	public void forLoop() {
	
		// for loop
		// for (initialization; condition; update) {
		// 		Statements;
		// }
		
		MyClass myClass = new MyClass();
		
		for (int ctr = 1; ctr <= 5; ctr++, myClass.printJames()) {	// can list multiple update statements
			System.out.println(ctr);
		}
	
		int[][] multiArr = new int[10][10];
		//nested loop
		for (int i=0; i<multiArr.length; i++) {
			for (int j=0; j<multiArr[i].length; j++) {
				multiArr[i][j] = i + j;
			}
		}
	
		// for-each loop (enhanced for loop)
		ArrayList<String> myList= new ArrayList<String>();
		myList.add("Java");
		myList.add("Loop");
	
		for(Iterator<String> i = myList.iterator(); i.hasNext();)	// regular loop
			System.out.println(i.next());
	
		for (String val : myList)									// enhanced loop
			System.out.println(val);
	
		// nested array list
		ArrayList<ArrayList<String>> nestedArrayList = new ArrayList< ArrayList<String>>();
		ArrayList<String> exams= new ArrayList<String>();
		ArrayList<String> levels= new ArrayList<String>();
		ArrayList<String> grades= new ArrayList<String>();
		nestedArrayList.add(exams);									//
		nestedArrayList.add(levels);								// these are array lists
		nestedArrayList.add(grades);								//
	
		for (ArrayList<String> nestedListElement : nestedArrayList)
			for (String element : nestedListElement)
				System.out.println(element);
	
		
		// assigning new values vs not
		ArrayList<StringBuilder> myArr = new ArrayList<StringBuilder>();
		
		for (StringBuilder val : myArr)
			val = new StringBuilder("Oracle");				// does NOT change myArr
	
		for (StringBuilder val : myArr)						// does change my myArr
			val.append("Oracle");
		
		// enhanced for loop limitations
		// It cannot be used to initialise array or modify elements. Just use for loop.
		// It cannot be used to delete or remove the elements of a collection
		
		for (StringBuilder val : myArr)
			val = null;					// val is the loop variable, not myList.
										// Cannot iterate over multiple collections 
										// in same loop. Only 1 loop variable/iterator.
	
		// nested enhanced for loop
		ArrayList<String> arrOne = new ArrayList<String>();
		arrOne.add("Java");
		arrOne.add("Oracle");
		ArrayList<String> arrTwo = new ArrayList<String>();
		arrTwo.add("Basic");
		arrTwo.add("Advanced");
		ArrayList<String> arrThree = new ArrayList<String>();
		arrThree.add("Pass");
		arrThree.add("Fail");
	
		for (String one : arrOne)
			for (String two : arrTwo)
				for (String three : arrThree)
					System.out.println(one+":"+two+":"+three);
	}

}
