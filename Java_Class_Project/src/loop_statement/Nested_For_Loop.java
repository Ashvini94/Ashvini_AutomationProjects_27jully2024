package loop_statement;

public class Nested_For_Loop {

	public static void main(String[] args) {
		
		/* syntax -->
		 * 
		 * 		for(variable name;condition;inc/dec)
		 * 		{
		 * 			for(variable name;condition;inc/dec)
		 * 			{
		 * 				//block of code
		 * 				
		 * 			}
		 * 			
		 * 		}
		 * 
		 */

		for(int i=0;i<3;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.print(" "+i+ " "+j);
			}
			System.out.println();
		}
		

	}

}
