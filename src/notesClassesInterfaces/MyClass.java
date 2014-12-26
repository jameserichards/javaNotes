package notesClassesInterfaces;

public class MyClass implements MyInterface {
	
	public static void printJamesStatic(){
		System.out.println("James");
	}
	
	public void printJames(){
		System.out.println("James");
	}
	
	public String returnJames() {
		return "James";
	}

}
