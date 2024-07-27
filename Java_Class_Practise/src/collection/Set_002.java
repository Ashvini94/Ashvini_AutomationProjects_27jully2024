package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_002 {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<Integer>();

		// add data in set
		h.add(10);
		h.add(20);
		h.add(300);
		h.add(50);
		h.add(500);

		// to print all element of set
		 System.out.println(h);

		// to add value in set by using for loop
		/*
		 * for(int i=10;i<=20;i++) { h.add(i); } System.out.println(h);
		 * 
		 */

		 //to remove particular element from set
		// h.remove(300);
		 System.out.println(h);
		 
		 //to remove all data from set
		// h.clear();
		// System.out.println(h);
		 
		 //to get size of set
		 System.out.println(h.size());
		 
		 //to create duplicate copy of set
		 System.out.println(h.clone());
		 
		 //to check value is present in set or not
		 System.out.println(h.contains(50));
		 
		 //to check set is empty or not
		 System.out.println(h.isEmpty());
		 
		 //to iterate all values of set
		Iterator<Integer> in = h.iterator();
		while(in.hasNext())
		{
			System.out.println(in.next());
		}
	}

}
