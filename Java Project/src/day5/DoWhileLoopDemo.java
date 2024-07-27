package day5;

public class DoWhileLoopDemo {

	public static void main(String[] args) {

		// do while loop --> 
		/* syntax --> 
		 * 
		 * 		initialization;
		 * 		do
		 * 		{
		 * 			statements;
		 * 			increment/decrement;
		 * 
		 * 		}while(condition);
		 * 
		 * 
		 */

		//example 1: print 1 to 10 number 
	/*	int i= 1; //1
		do
		{
			System.out.println(i); //1 2...10
			i++; //2 3 4..10..11
		}while(i<=10); //2<10-->true ,11<10-->false
		
		*/
	
	// example 2: print 10 to 1 number in descending order
		
		int i= 10; //10
		do
		{
			System.out.println(i); //10 9...1
			i--; //9 ..1
		}while(i>=1); //9>1 -->true ,0>=1 -->false here stop execution
	
	
	
	
	}

}
