package set;

import java.util.HashSet;
//stores the elements by using a mechanism called hashing.
//insertion order is not maintained
//inserted on the basis of their hashcode.
//used to store unique data no duplicate data allowed
//allows null value,non-synchronized.
public class Hashset {
	public static void main(String[] args) {
		
		HashSet<String> as=new HashSet<String>();
		as.add("sanjay");
		as.add("varun");
		as.add("nandha");
		//duplicate value will be ignored
		as.add("sanjay");
		
		System.out.println(as);
		
		for (String string : as) {
			System.out.println(string);
		}
		
	}
}
