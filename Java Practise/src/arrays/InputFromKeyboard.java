package arrays;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {


		//taking input from keyboard 
		
		Scanner sc=new Scanner(System.in);//object of scanner class
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		System.out.println("Given number: "+num);
		
		System.out.println("Enter decimal number");
		
		double db=sc.nextDouble();
		
		System.out.println("Given number: "+db);
		
		System.out.println("Enter name");
		
		String str=sc.next();
		
		System.out.println("Your name is: "+str);
		
		System.out.println("Enter unkonwm value");
		
		Object obj=sc.next();
		
		System.out.println(obj);

	}

}
