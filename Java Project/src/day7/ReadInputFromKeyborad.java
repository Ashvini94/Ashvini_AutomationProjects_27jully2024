package day7;

import java.util.Scanner;

public class ReadInputFromKeyborad {

	public static void main(String[] args) {
		//how to take input from keyboard in runtime or how to take input in console in runtime

		//to take input in runtime we have to create object of scanner class
		Scanner sc=new Scanner(System.in);
		
	/*	System.out.println("Enter a number:");
	 * 
	 	to print integer number 
		int num=sc.nextInt();
		System.out.println("Given number:"+num);   */
		
		//to print decimal number
		System.out.println("Enter a decimal number:");
		double d=sc.nextDouble();//for decimal number
		System.out.println("Given number:"+d);
		
		//to print string
		System.out.println("Enter a name:");
		String s=sc.next();//for string
		System.out.println("Your name is:"+s);
		
		//to print float value
		System.out.println("Enter a decimal number");
		float f=sc.nextFloat();
		System.out.println("Given number:"+f);
		
		//to print character
		System.out.println("Enter a character");
		//for character also we used next() it converts character to string
		String  c=sc.next();
		System.out.println("Given character:"+c);
		
		System.out.println("Enter a data");
		//to print unknown value
		Object o=sc.next();
		System.out.println(o);

	}

}
