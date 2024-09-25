package set;

import java.util.TreeSet;

// contains unique elements
// doesn't allow null element.
//TreeSet class maintains ascending order.
public class treeSet {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Sanjay");
		ts.add("fel");
		ts.add("jack");
		ts.add("jai");

		System.out.println(ts);

		for (String string : ts) {
			System.out.println(string);
		}

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(3);
		ts1.add(1);
		ts1.add(2);
		ts1.add(4);

		System.out.println(ts1);

		for (Integer integer : ts1) {
			System.out.println(integer);
		}
	}

}
