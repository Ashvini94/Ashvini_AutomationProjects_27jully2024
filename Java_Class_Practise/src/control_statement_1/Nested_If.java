package control_statement_1;

public class Nested_If {
	
	int y=10;
	
	public void print()
	{
		if(y==10)
		{
			System.out.println("x is equal to 200");
			if(y<50)
			{
				System.out.println("x is less than 500");
			}
			if(y<30)
			{
				System.out.println("x is less than 300");
			}
			else
			{
				System.out.println("condition is false");
			}
		}
		else
		{
			System.out.println("All conditions are false");
		}
		

	}

	public static void main(String[] args) {

		int x=200;
		
		if(x==200)
		{
			System.out.println("x is equal to 200");
			if(x<500)
			{
				System.out.println("x is less than 500");
			}
			if(x<300)
			{
				System.out.println("x is less than 300");
			}
			else
			{
				System.out.println("condition is false");
			}
		}
		else
		{
			System.out.println("All conditions are false");
		}
		

	}

}
