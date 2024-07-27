package day8;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {


		//1. length() --> returns length of a string or no of character
		
		//we can declrae string in two types
		
		//1st way
		String s="welcome";
		
		//2nd way 
		String s1=new String("welcome");//creating the object of string class
		
		//to find the length of string
		int st=s.length();
		System.out.println(st);//7
		
		System.out.println(s.length());//7
		
		s1.length();
		System.out.println(s1.length());//7
		
		//suppose we have only string values not string variable then
		System.out.println("welcome".length());//7
		

		//2. concat -->joining the two strings 
		
		String s2="welcome";
		String s3="to java";
		
		System.out.println(s2.concat(s3));//
		
		//concat multiple string
		String s4="welcome";
		String s5="to java";
		String s6="and automation testing";
		
		System.out.println(s4.concat(s5).concat(s6));
		
		//or
		System.out.println(s4.concat(s5+s6));
		
		//if we have only values then
		System.out.println("welcome".concat("to java").concat("and automation testing"));
		
		//3. trim() -->it removes spaces from left side and right side
		
		String str="   welcome   ";
		System.out.println(str);
		
		//to find length after trimming
		System.out.println("before trimming:"+str.length());//13 -->bec length method can count space also
		
		//trim
		System.out.println(str.trim());//welcome
		System.out.println("After trimming:"+str.trim().length());//7
		
		//4. charAt() -->it returns single character from string based on index value
		
		String str1="Pineapple";
		System.out.println(str1.charAt(4));//a
		
		System.out.println(str1.charAt(7));//l
		
		/* 5. contains()---> 1.check string is a part of main string 
		 * 					 2.contains method can return boolean value either true or false
		 * 					 3.string values are case sensitive hence it is treated differently uppercase and lowercase
		 *					 4.it accepts string in a sequence only
		 */				
		
		String str2="Pineapple";
		System.out.println(str2.contains("apple"));//true
		System.out.println(str2.contains("pine"));//false
		System.out.println(str2.contains("Pine"));//true
		System.out.println(str2.contains("Pinele"));//false
		
		//6. equals() or equalsIgnoreCase() -->1.it is used to compare two strings
		//									   2.it returns boolean value either true or false
		
		//equals() -->it consider case sensitive it treated differently uppercase and lowercase
		//equalsIgnoreCase() --->it not consider case sensitive it treated same upeercase and lowercase
		
		String str3="Pineapple";
		System.out.println(str3.equals("pineapple"));//false
		System.out.println(str3.equalsIgnoreCase("pineapple"));//true
		
		//7. replace() --> it replace single character or multiple character(sequence) from string
		
		String strg="Pineapple is a yellow colour fruit and it is very testy fruit";
		System.out.println(strg.replace('e','x'));//replace single character
		
		System.out.println(strg.replace("fruit", "type"));
		
		/* 8. substring() -->1.checks substring is a part of main string based upon index value
							 2.Starting index starts from 0 and ending index start from 1
							 */
		
		String strg1="Pineapple";
		System.out.println(strg1.substring(0, 7));//Pinneapp
		System.out.println(strg1.substring(2, 5));//nea
		
		
		//9. toLowerCase() toUpperCase() -->it converts lowecase into uppercase and uppercase into lowercase
		
		String stg="john kendey";
		System.out.println(stg.toUpperCase());//uppercase
		System.out.println(stg.toCharArray());//lowercase
		
		//10. split -->it split into multiple string based on delimeter 
		
		//example 1
		String stgn="abc@gmail.com";//here @ and . are delimeter o/p -->abc
									//									gmail.com
		//split by using @
		String stgn1[]=stgn.split("@");
		System.out.println(Arrays.toString(stgn1));//[abc,gmail.com]
		
		System.out.println(stgn1[0]);//abc
		System.out.println(stgn1[1]);//gmail.com
		
		
		//split by using .
	    String stgn2[]=	stgn1[1].split(".");//stgn1[1]=gmail.com
	    System.out.println(Arrays.toString(stgn2));//[gmail,com]
	    
	    //example 2
	    String amount="$15,20,55";//o/p --?152055
	    
	    //by using replace method
	    amount.replace("$","");
	    System.out.println(amount.replace("$",""));//15,20,25
	    amount.replace(",", "");//152055
	    System.out.println(amount.replace("$","").replace(",",""));
	    
	    
	    //by using split
	   
	    //example 3
	   String sn="abc,123@xyz";
	   
	   String sn1[]=sn.split(",");
	   System.out.println(Arrays.toString(sn1));//[abc,123@xyz]
	   
	   String sn2[]=sn1[1].split("@");
	   System.out.println(Arrays.toString(sn2));//[123,xyz]
	   
	   System.out.println(sn1[0]);//abc
	   System.out.println(sn2[0]);//123
	   System.out.println(sn2[1]); //xyz		
	    
	    
		//example 4
	   String snt="abc 123";//o/p --> [abc,123]
	   
	   //using split
	   
	   String snt1[]=snt.split(" ");
	   System.out.println(Arrays.toString(snt1));//[abc,123]
		
	   
		//example 5
		String name="John Kenedy"; 
		
		//we want first o/p want John is a part of main string or not
		
		System.out.println(name.contains("john"));//false
		
		
		//we want to check John is a part of main string or not but consider case sensitive and not use of equalIgnoreCase and which will return true value
		
		//System.out.println(name.equalsIgnoreCase().contains("John"));
			
		
		//so use here replace method
		name.replace('J', 'j');//John
		System.out.println(name.replace('J', 'j').contains("john"));//true
		
		//or use toLowercase
		System.out.println(name.toLowerCase().contains("john"));//true
		
		
	}

}
