package collection;

import java.util.ArrayList;

public class List_001 {

	public static void main(String[] args) {
		
		//create object of arraylist class
		ArrayList<String>al=new ArrayList<String>();
		
		//to add values in list
		al.add("Ashvini");
		al.add("Ankit");
		al.add("Surekha");
		al.add("Vinod");
		al.add("Anjali");
		al.add("vaibhav");
		al.add(null);
		al.add(null);
		
		//to add value with respect to index in list
		al.add(8,"Rani");
		al.add(9,"Pofare");
		
		//To print all the values from list
		System.out.println(al);
		
		//to get values with respect to index from list
		System.out.println(al.get(4));
		
		//to remove value from list
		//al.remove("Pofare"); //or
		//al.remove(9);
		//System.out.println(al);
		
		//to remove all values from list
		//al.clear();
		//System.out.println(al);
		
		//to create duplicate copy of list
		al.clone();
		System.out.println(al);
		
		//to search value is present or not in list
		System.out.println(al.contains("Surekha"));
		
		//to get index with respect to value from list
		System.out.println(al.indexOf("Ankit"));
		
		//to get size of list
		System.out.println(al.size());//9
		
		//to check list is empty or not
		System.out.println(al.isEmpty());
		
		
		
		
		
		

	}

}
