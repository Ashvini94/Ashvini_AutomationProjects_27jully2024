package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Class_003 {

	public static void main(String[] args) {

		HashMap<Integer, String>map=new HashMap<Integer, String>();
		
		//put value in map
		map.put(1, "John");
		map.put(2, "Alex");
		map.put(3, "Celena");
		map.put(4, "Eva");
		map.put(5, "Julie");
		
		//to print all element from set
		System.out.println(map);
		
		//to remove element with respect to key
		//map.remove(3);
		//System.out.println(map);
		
		//to remove element with respect to value
		//map.remove(4,"Eva");
		//System.out.println(map);
		
		//to clear all values from map
		//map.clear();
		//System.out.println(map);
		
		//to get value w r to key
		System.out.println(map.get(2));
		
		//replace value w r to key
		map.replace(5, "Jack");
		System.out.println(map);
		
		//to check value is present in map or not w r to key
		System.out.println(map.containsKey(3));
		
		//to check value is present in map or not w r to value
		System.out.println(map.containsValue("Eva"));
		
		//to check size of map
		System.out.println(map.size());
		
		//to checek map is empty or not
		System.out.println(map.isEmpty());
		
		//to seperate key and value
		//convert map to set
		
		Set<Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> it = set.iterator();
		
		while(it.hasNext())
		{
			Entry<Integer, String> s =(Entry<Integer, String>)it.next();
			
			//to print key 
			System.out.println(s.getValue());
			System.out.println(s.getKey());
		}
		
		

	}

}
