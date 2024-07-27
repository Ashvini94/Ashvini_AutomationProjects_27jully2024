package control_statement;

public class NestedIF {

	public static void main(String[] args) {


		int i=100;
		
		//nested if
		if(i==100)//true
		{
			System.out.println("Value of i is 100");
			if(i<200)
			{
				System.out.println("Value of i is less than 200");
			}
			if(i<500)
			{
				System.out.println("Value of i is greater than 500");
			}
		}
		else
		{
			System.out.println("All the condition are false");
		}

	}

}
