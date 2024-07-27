package collection;

import java.util.ArrayList;

public class Collection_001 {

	public static void main(String[] args) {
		
		//create object of ArrayList class
		ArrayList<String>names=new ArrayList<String>();
		
		//add values 
		names.add("Ashvini");
		names.add("Priyanka");
		names.add("Aakansha");
		names.add("Prachi");
		names.add("Vinod");
		names.add("Ankit");
		names.add("Rani");
		names.add("Surekha");
		//we can add null values 
		names.add(null);
		
		
		//to print the values
		System.out.println(names);
		
		//to print values with respect to index
		//System.out.println(names.get(4));//vinod
		
		//add values with index
		//names.add(9, "vaibhav");
		
		//remove values 
		//names.remove(2);
		//System.out.println(names);
		
		//to remove all values
		//names.clear();
		//System.out.println(names);
		
		//to check specific values
		System.out.println(names.contains("Priyanka"));//true
		
		//to get index
		System.out.println(names.indexOf("Surekha"));//7
		
		//to get size
		System.out.println(names.size());//9
		
		//to create copy
		System.out.println(names.clone());
	
		
		
		
		
		

	}

}
