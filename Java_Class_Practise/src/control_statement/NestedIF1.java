package control_statement;

public class NestedIF1 {

	//instance variable
	int i=100;
	
	//instance method
	public void print()
	{
		if(i!=100)
		{
			System.out.println("value of i is equal to 100");
			if(i<200)
			{
				System.out.println("Vlaue of i is less than 200");
			}
		}
		else
		{
			System.out.println("All the conditions are false");
		}
	}
	
	//static variable
	static int a=500;
	
	//static method
	static public void verify()
	{
		if(a!=500)
		{
			System.out.println("Value of a is 500");
			if(a>100)
			{
				System.out.println("Value of a is greater than 100");
			}
		}
		else
		{
			System.out.println("All the condition are false");
		}
	}
	
	
	
	public static void main(String[] args) {

		NestedIF1 main=new NestedIF1();
		main.print();//call instance method
		
		//call static method
		verify();

		

	}

}
