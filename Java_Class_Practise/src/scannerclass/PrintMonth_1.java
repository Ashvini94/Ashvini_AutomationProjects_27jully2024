package scannerclass;

import java.util.Scanner;

public class PrintMonth_1 {

	public static void main(String[] args) {

		// to print months using scanner class and switch case
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any one number");
		int month = sc.nextInt();

		// using switch case5
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Februvary");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("Jully");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("Saptember");
			break;
		case 10:
			System.out.println("Octomber");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid");
			break;

		}

	}

}
