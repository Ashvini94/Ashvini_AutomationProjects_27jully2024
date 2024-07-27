package java_decision_statement3;

public class Nested_IF {

	public static void main(String[] args) {

		/* syntax: 
		 * 
		 * 	initialize variable;
		 * 		if(condition1)
		 * 		{
		 * 			//block of code   ..execute when con1 is true
		 * 			
		 * 			if(condition2)
		 * 			{
		 * 				//block of code   ...execute when con2 is true
		 * 			}
		 * 			else
		 * 			{
		 * 				//block of code ..execute only when inner if condition is fasle
		 * 			}
		 * 		}
		 * 	else
		 * {
		 * 		//block of code ..execute only when outer if cond is false
		 * }
		 * 
		 */
		
		
		long l=2000;
		
		if(l>1000)//true
		{
			System.out.println("No is greater than 1000");
			
			if(l>3000)//false
			{
				System.out.println("No is less than 3000");
			}
			else
			{
				System.out.println("Condition 2 is false");
			}
			
			if(l==2000)
			{
				System.out.println("No is equal to 2000");
			}
		}
		
		//here else block will be executed if above if outer if condition is false
		else
		{
			System.out.println("All conditions are false");
		}

	}

}
