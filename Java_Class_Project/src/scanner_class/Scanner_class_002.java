package scanner_class;

import java.util.Scanner;

public class Scanner_class_002 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstname=sc.nextLine();
		
		System.out.println("Enter your last name");
		String lastname=sc.nextLine();
		
		System.out.println("Your full name is: "+firstname +" " +lastname);

	}

}
