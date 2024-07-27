package scannerclass;

import java.util.Scanner;

public class Scanner_class_001 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Print 1st number");
		int input1=sc.nextInt();
		
		System.out.println("Print 2nd value");
		int input2=sc.nextInt();
		
		int input=input1+input2;
		
		System.out.println("Addition of two values is: "+input);
	}

}
