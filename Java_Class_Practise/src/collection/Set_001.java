package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_001 {

	public static void main(String[] args) {
		
		//create object of HashSet class
		HashSet<Integer>hs=new HashSet<Integer>();
		
		//to add values in set
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		//hs.add(null);//it does not accept duplicate value
		
		
	
		//to add values by using for loop
	/*	for(int i=10;i<=20;i++)
		{
			hs.add(i);
		}
		
		*/
		
		//to print all values from set
		System.out.println(hs);
		
		//to print all the values by using iterator interface
		//Iterator<Integer>it=hs.iterator();
		
	/*	while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		*/
		//to remove value from set
		//hs.remove(10);
		
		
		//to clear element from set
		//hs.clear();
		//System.out.println(hs);
		
		//to create duplicate copy of set
		hs.clone();
		System.out.println(hs);
		
		//to print size of set
		System.out.println(hs.size());
		
		//to check value is present or not in set
		System.out.println(hs.contains(20));//true
		
		
		
	}

}
