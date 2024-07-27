package day5;

public class DiffBetnWhileAndDoWhile {

	public static void main(String[] args) {
		
		
		// while loop -->
		
		int i=10; //10
		while(i<=5) //10<5 -->false here not execute any statement
		{
			System.out.println(i); 
			i++; 
		}
		
		// do while loop -->
		
		int num =10;
		do
		{
			System.out.println(num); //10
			num++; //11
		}while(num<=5); //11<5 -->false
	}

}
