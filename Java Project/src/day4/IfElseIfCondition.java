
package day4;

public class IfElseIfCondition {

	public static void main(String[] args) {
		
		/* syntax -->
		 * if(condition1)
		 * {
		 * Statements;
		 * }
		 * else if(condition2)
		 * {
		 * Statements;
		 * }
		 * else if(condition3)
		 * {
		 * Statements;
		 * }
		 * else
		 * {
		 * 
		 * }
		 * 
		 */
		
		
		/*check no is positive,negative or zero
		 * 
		 * if no > 0 -->positive no
		 *    no < 0 -->negative no
		 *    no = 0 -->zero
		 */
		int num=100; // num=-50 //num =0
		if(num>0) //100>0 -->true
		{
			System.out.println("No is positive"); // no is positive
		}
		else if(num<0) //-50<0 -->true
		{
			System.out.println("No is negative"); // no is negative
		}
		else
		{
			System.out.println("No is zero"); //no is zero
		}

	}

}
