package set;

import java.util.LinkedHashSet;

public class LinkedHASHSET {
	// LinkedHashSet class contains unique elements 
	// permits null elements.,non-synchronized.
	//LinkedHashSet class maintains insertion order.
	public static void main(String[] args) {
		
		LinkedHashSet<String> LHS=new LinkedHashSet<String>();
	
			LHS.add("NANDHA");
			LHS.add("varun");
			LHS.add("sanjay");
			LHS.add("varun");
			LHS.add("varun");
			LHS.add(null);
			
			
			System.out.println(LHS);
			
			for (String string : LHS) {
				System.out.println(string);
			}
		
	}

}
