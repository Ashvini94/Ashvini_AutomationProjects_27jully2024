package scannerclass;

import java.util.Scanner;

public class Class_003 {

	public static void main(String[] args) {
		
		//create object of scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int input1=sc.nextInt();
		
		System.out.println("Enter second number");
		int input2=sc.nextInt();
		
		//multiplication of two numbers
		int multiplication=input1*input2;
		
		System.out.println("Multiplication is: "+multiplication);

	}

}
