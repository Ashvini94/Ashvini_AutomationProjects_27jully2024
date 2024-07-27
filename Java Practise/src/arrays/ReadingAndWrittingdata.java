package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWrittingdata {

	public static void main(String[] args) {

//take one empty array and fill that array from taking input from keyboards and writting that array elements
		
		int a[]=new int[4];
		
		Scanner sc=new Scanner(System.in);
		
		//fill the array from taking input from keyboard
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter the element from position: "+i);
		a[i]=sc.nextInt();
			
		}
		
		//print the element
		System.out.println(Arrays.toString(a));

	}

}
