package Jump_Statement;

public class Continue_Statement {

	public static void main(String[] args) {


	/* Syntax -->
	 * 
	 * 			for(initialize variable;condition;inc/dec)
	 * 			{		
	 * 
	 * 				if(condition)
	 * 				{
	 * 
	 * 					continue;
	 * 				}
	 *             //block of code;
	 * 			}
	 */

		
		for(int i=1;i<=10;i++)
		{
			if(i==5)//in this whatever cond is mentioned compiler will skip that iteration
			{
				continue;
				
			}
			System.out.println(i);
		}
	}

}
