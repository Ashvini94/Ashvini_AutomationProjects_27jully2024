package string1;

import java.util.Arrays;

public class MutableAndImmutableObject {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,30,50};
		
		//before sorting
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);//bec of this line change is happen in original value of a hence array is a mutable object
		//after sorting
		System.out.println(Arrays.toString(a));
		
		
		//but in string
		String s="welcome";
		
		s.concat("to java");//bec of this line there is no change in original value of s hence string is a immutable object
		System.out.println(s);//welcome
		
		//in string buffer and string builder
		
		StringBuffer s1=new StringBuffer("Automation");
		s1.append(" to java");//bec.of this line change will be happen in existing value of s1 hence string buffer is a mutable object
		System.out.println(s1);//automation to java
		
		
		StringBuilder s2=new StringBuilder("Automation");
		s1.append(" to java");//bec.of this line change will be happen in existing value of s1 hence string builder is a mutable object
		System.out.println(s1);//automation to java

	}

}
