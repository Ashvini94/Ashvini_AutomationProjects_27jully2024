package java_decision_statement3;

public class IF_Else_Ladder {

	public static void main(String[] args) {
		
		/* syntax -->
		
		initialize variable;
		if(condition1)
		{
			//block of code   ..execute only  when con1 is true
		}
		else if(condition 2)
		{
			//block of code  ..execute only when con2 is true
		}
		else if(condition 3)
		{
			//block of code  ..execute only when con3 is true
		}
		else
		{
			//block of code  ..execute when above all cond are false
		}
		
		*/

		int i=90;
		
		//if else ladder
		
/*		if(i>100)//false
		{
			System.out.println("Number is less than 100");
		}
		else if(i<100)//true
		{
			System.out.println("Condition 2 is true");  //here both conditions are true but it will execute only first block of code
		}
		else if(i==90)//true
		{
			System.out.println("Condition 3 is true");
		}
		 
		 */
		
		
		if(i>100)//false
		{
			System.out.println("Number is less than 100");
		}
		else if(i<50)//false
		{
			System.out.println("Condition 2 is true");  //here both conditions are true but it will execute only first block of code
		}
		else if(i!=90)//false
		{
			System.out.println("Condition 3 is true");
		}
		
		//if above all the conditions are false then only else block of code will be excuted
		else
		{
			System.out.println("All conditions are false");
		}

	}

}
