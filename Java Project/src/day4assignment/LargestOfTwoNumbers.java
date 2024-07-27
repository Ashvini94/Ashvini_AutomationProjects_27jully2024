package day4assignment;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		//find largest of two numbers using if else and ternary operator
		
				//by using if else condition
				int a=500,b=100;
				if(a>b) //100>50 -->true
				{
					System.out.println("a is largest"); //a is largest
				}
				else
				{
					System.out.println("b is largest"); //b is largest
				}

				
				// by using ternary operator
				//var=exp? result 1: result2;
				
				int result=(a>b)? a : b; //500>100 -->true
				System.out.println("a is largest:"+result); //500

	}

}
