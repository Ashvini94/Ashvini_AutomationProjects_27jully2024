package day4;

public class NestedIfElseCondition {

	public static void main(String[] args) {
		
		/* syntax -->
			 * 		if(true)
			 * 		{
			 * 			if(true)
			 * 			{
			 * 				statements;
			 *			}
			 *			else
			 *			{
			 *				statements;
			 *			}
			 * 
			 * 		}
			 * 		else
			 *		{
			 * 			Statements;
			 * 		}
			 */
		
		//dispaly week name based on week no
		
		int week_no=1;
		
		if(week_no==1)//1==1 -->true
		{
			System.out.println("Monday");//monday
		}
		else if(week_no==2)
		{
			System.out.println("Tuesday");
		}
		else if(week_no==3)
		{
			System.out.println("Wensday");
		}
		else if(week_no==4)
		{
			System.out.println("Thursday");
		}
		else if(week_no==5)
		{
			System.out.println("Friday");
		}
		else if(week_no==6)
		{
			System.out.println("Saturday");
		}
		else if(week_no==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}
