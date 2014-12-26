package oca5_if_switch_loops;

public class IfSwitch {
	
	public void IfStatement() {
		
		int score,result;
		boolean test1 = true;
		boolean test2 = false;
		
		// if and if-else
		if (test1 == true)
			score = 200;
		else
			score = 300;

		// if-else-if-else
		if (test1 == true)
			result = 50;
		else if (test1 == false)
			result = 20;
		else if (test2 == true)
			result = 10;
		else {
			result = 0;
			test1 = true;
			test2 = false;
		}
		// must use {} if writing multiple line if statements

	}
	
	public void switchStatement() {

		int marks = 20;
		switch (marks) {
			case 10: 
				System.out.println(10); 
				break;
			case 20: 
				System.out.println(20);
				break;
			case 30: 
				System.out.println(30);
				break;
			default: 
				System.out.println("default");
				break;
		}
	
		// switch without breaks
		String day = "SUN";
		switch (day) {
			case "MON":					// goes
			case "TUE":					// to
			case "WED":					// THU
			case "THU":
				System.out.println("Time to work");
				break;
			case "FRI":
				System.out.println("Nearing weekend");
				break;
			case "SAT":					// goes to SUN
			case "SUN":
				System.out.println("Weekend!");
				break;
			default:
				System.out.println("Invalid day?");
		}
	
		// switch statement accepts char, byte, short, int, String
		// They do NOT accept double, float, long
		// They only accept arguments available at compile time
		
		int a=10, b=20, c=30;
		final int d=40, e=50;
		switch (a+b) {											// Good
			case b+c:  System.out.println(b+c); break;			// Bad
			case 10*7: System.out.println(10*7512+10); break;	// Good
			case d+e:  System.out.println("Hi"); break;			// Good - 'final' variables
																//	cannot be changed
			case null: System.out.println("Null"); break;		// Bad - null isn't 
																// allowed as a label
		}

	}

}
