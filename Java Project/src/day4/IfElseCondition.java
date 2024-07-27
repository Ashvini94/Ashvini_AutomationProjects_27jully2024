package day4;

public class IfElseCondition {

	public static void main(String[] args) {
		
		/* syntax-->
		 * 
		 * if(true) //if condition is true then if block is executed 
		 * {
		 *  statements;
		 * }
		 * else  //if condition is false then else block is executed
		 * {
		 *  statements;
		 *  
		 * }
		 * 
		 */
		
		/* int person_age=30;
		if(person_age<18) //30<18-->false
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not elgible for voting"); //Not elgible for voting
		} */
		
		//if you have single statement under condition then no need to specify curly brackets
		
		int person_age=30;
		if(person_age<18) //30<18-->false
		
			System.out.println("Eligible for voting");
		
		else
		
			System.out.println("Not elgible for voting"); //Not elgible for voting
		
		
	}

}
