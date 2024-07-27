package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingWrittingDataIntoArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//take one empty array and fill that array by taking input from keyborad and then writting that array
		int a[]=new int[5];//empty array size is 5
		
		//for taking input multiple time from keyboard use normal for loop
		for(int i=0;i<a.length;i++)//0,0>5-->true
		{
			System.out.println("Enter a value of position:"+i);
			a[i]=sc.nextInt();
			
		}
		
		//to print the element
		//System.out.println("Print array elemets...");
        //System.out.println(Arrays.toString(a));
		
		//or
		
		System.out.println("Print element of array ");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
