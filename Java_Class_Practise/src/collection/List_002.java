package collection;

import java.util.ArrayList;

public class List_002 {

	public static void main(String[] args) {

		ArrayList<String>al=new ArrayList<String>();
		
		//add element in list
		al.add("Ashvini");
		al.add("kasturi");
		al.add("Surekha");
		al.add("Vinod");
		al.add("Pranav");
		
		//print list 
		System.out.println(al);
		
		//add value with respect to index
		al.add(5, "Rucha");
		System.out.println(al);
		
		//remove particular value from list with respect to index
		//al.remove(2);
		//System.out.println(al);
		
		//remove value pranav from list
		//al.remove("Pranav");
		//System.out.println(al);
		
		//clear complete list
		//al.clear();
		//System.out.println(al);
		
		//to create duplicate copy of list
		al.clone();
		System.out.println(al);
		
		//to get value with respect to index
		System.out.println(al.get(1));
		
		//to get index with respect to value
		System.out.println(al.indexOf("kasturi"));
		
		//to get size of list
		System.out.println(al.size());
		
		//to check value is present in list or not
		System.out.println(al.contains("Vinod"));
		
		//check list is empty or not
		System.out.println(al.isEmpty());
		

	}

}
