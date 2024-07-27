package scannerclass;

import java.util.Scanner;

public class Scanner_class_002 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
/*		System.out.println("Enter your first name");
		String str1=sc.nextLine();
		
		System.out.println("Enter your last name");
		String str2=sc.nextLine();
		
		System.out.println("Your full name is: "+str1 +" " +str2);
		
		*/
		
		//table print
		System.out.println("Enter any one number");
		int input=sc.nextInt();
		
		//for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println(+input +"*" +i +"="+input*i);
		}
		

	}

}
