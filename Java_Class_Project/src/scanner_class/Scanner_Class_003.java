package scanner_class;

import java.util.Scanner;

public class Scanner_Class_003 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any one number");
		int input=sc.nextInt();
		
		System.out.println("Table multiplication");
		
		for(int i=1;i<=10;i++)
		{
			//2*1=2,2*2=4
			System.out.println(+input +"*" +i +"="+input*i);
		}
		
		
	}

}
