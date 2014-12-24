package oca4_strings_arrays;

public class Equality {
	
	// Comparing objects for equality

	// equals method contract
	//			null input shall output false
	//			should also not modify any variables/parameters

	String acctNumber;
	int acctType;
	public boolean equals(Object anObject) {			// note: type Object
		if (anObject instanceof Equality) {
			Equality b = (Equality)anObject;
			return (acctNumber.equals(b.acctNumber) &&
						acctType == b.acctType);
			}
			else
				return false;
		}

	public static void main(String args[]) {
		Equality b1 = new Equality();
		b1.acctNumber = "0023490";
		b1.acctType = 4;

		Equality b2 = new Equality();
		b2.acctNumber = "11223344";
		b2.acctType = 3;

		Equality b3 = new Equality();
		b3.acctNumber = "11223344";
		b3.acctType = 3;

		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b1.equals(new String("abc")));
	}


}
