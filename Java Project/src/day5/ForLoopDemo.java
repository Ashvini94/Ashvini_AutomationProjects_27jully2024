package day5;

public class ForLoopDemo {

	public static void main(String[] args) {

		//for loop -->
		
		/* syntax -->
		 * 
		 * 		for(initialization;condition;increment/decrement)
		 * 		{
		 * 
		 * 			Statements;
		 * 		}
		 */
		
		// example 1: print 1 to 10 number using for loop
		 
	/*	for(int i=1;i<=10;i++) //i=1,1<10 -->true ..11<10 -->false here stop execution
		{
			System.out.println(i); // 1,...10
		}  
		 
		 */
		
		// example 2: print even number in between 1 to 10 number
		
		//approach 1:
		
	/*	for (int i=2;i<=10;i+=2) //i=2,2<10 -->true ,4..10,12<10 -->false
		{
			System.out.println(i); //2
		}
		
		*/
		
		// approach 2:
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i);
			}
		}
		
		
		//example 3: print 1 to 10 number along with even and odd
		
/*		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i +" "+"Even");
			}
			else
			{
				System.out.println(i +" "+"Odd");
			}
		}    
		
		*/
		
		//example 4: print 10 to 1 number in descending order
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		

	}

}
