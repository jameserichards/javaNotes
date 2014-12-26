package oca5_if_switch_loops;

// while and do-while loops

import notesClassesInterfaces.MyClass;

public class WhileLoops {
	
	public static void main(String args[]) {
		WhileLoops wL = new WhileLoops();
		wL.whileLoop();
	}
	
	public void whileLoop() {
		
		// while
		boolean bunsAvailable = true;		// evaluates at start
		while (bunsAvailable) {
			// to do - prepare burger
			if (true)
				bunsAvailable = false;
		}

		// do-while
		// always executes the code at least once
		boolean exitSelected = false;
		MyClass myClass = new MyClass();
		do {
			String selectedOption = myClass.returnJames();
			if (selectedOption.equals("James"))
				exitSelected = true;
			else
				// execute other commands
				myClass.printJames();
		}
		while (exitSelected == false);			// evaluates at end


		// to break out of a loop use 
		// break;

		// stop current iteration and continue with next one use
		// continue;

		// labelling
		// A labelled loop is shown below
		// outer is the loop label
		String[] programmers = {"Outer", "Inner"};
		outer:
		for (int i = 0; i < programmers.length; i++) {
			// statements
			myClass.printJames();
		}

		// using labels to break outer loops
		String[] loops = {"Outer", "Inner"};
		outer:
		for (String outer : loops) {
			for (String inner : loops) {
				if (inner.equals("Inner"))
					break outer;
				System.out.println(inner + ":");
			}
		}
		
		// or continue
		String[] names = {"Paul", "Shreya", "Selvan", "Harry"};
		outer:
		for (String name1 : names) {
			for (String name : names) {
				if (name.equals("Shreya"))
					continue outer;
				System.out.println(name);
			}
		}

	}

}
