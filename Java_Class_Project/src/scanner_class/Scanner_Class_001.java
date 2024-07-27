package scanner_class;

import java.util.Scanner;

public class Scanner_Class_001 {

	public static void main(String[] args) {
		
		//create object of scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int input1=sc.nextInt();
		
		
		System.out.println("Enter 2nd number");
		int input2=sc.nextInt();
		
		int total_input=input1+input2;
		System.out.println("Addition of two number is: "+total_input);
		
		
		
	}
	
	
	
	
}
