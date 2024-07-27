package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface {

	

	public static void main(String[] args) {
		
		//create object of Hashmap class
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		//add values in HashMap
		hm.put(1,"Ashvini");
		hm.put(2,"Ankit");
		hm.put(3, "Surekha");
		hm.put(4, "Vinod");
		hm.put(5, null);
		
		
		//if we add duplicate value then it will replace with corresponding value
		hm.put(3, "Surekha Pofare");
		
		//to print value
		System.out.println(hm);
		
		//to remove value with respect to key
		//hm.remove(3);
		//System.out.println(hm);
		
		//to remove value with respect to value
		hm.remove(3, "Surekha Pofare");
		System.out.println(hm);
		
		//to create duplicate copy
		hm.clone();
		System.out.println(hm);
		
		//replace specific value
		//hm.replace(5, "Rani");
		//System.out.println(hm);
		
		hm.replace(5, null, "Rani");
		System.out.println(hm);
		
		//to remove all values
		//hm.clear();
		//System.out.println(hm);
		
		//to get values with key
		System.out.println(hm.get(4));
		
		//to check any value present or not
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("Ankit"));
		
		//to print value using iterator
		//convert map into set
		Set<Entry<Integer, String>> set = hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Entry Map = (Map.Entry)i.next();
			System.out.println(Map.getKey());
			System.out.println(Map.getValue());
		}
		
		
		
	}

}
