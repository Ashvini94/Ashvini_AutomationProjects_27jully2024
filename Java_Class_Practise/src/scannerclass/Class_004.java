package scannerclass;

import java.util.Scanner;

public class Class_004 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any one number");
		int input =sc.nextInt();
		
		//to print table
		for(int i=1;i<=10;i++)
		{
			System.out.println(+input +"*"+ i+ "=" +i*input);
		}

	}

}
