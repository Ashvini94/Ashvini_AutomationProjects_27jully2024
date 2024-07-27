package control_statement_1;

public class If_else_If_ladder {

	public static void main(String[] args) {


		int x=200;
		
		if(x!=200)
		{
			System.out.println("x is equal to 200");
		}
		else if(x<100)
		{
			System.out.println("x is greater than 200");
		}
		else if(x>500)
		{
			System.out.println("x is less than 500");
		}
		else
		{
			System.out.println("All conditions are false");
		}

	}

}
