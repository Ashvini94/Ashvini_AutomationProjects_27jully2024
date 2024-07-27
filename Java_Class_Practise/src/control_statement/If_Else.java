package control_statement;

public class If_Else {
	
	//instance variable
	int a=50;
	
	//instance method
	public void print()
	{
		if(a!=50)
		{
			System.out.println("No is equal to 50");
		}
		else
		{
			System.out.println("No is 50");
		}
	}
	
	//static variable
	static long l=2000;
	
	//static method 
	static public void verify()
	{
		if(l!=2000)
		{
			System.out.println("No is equal to 2000");
		}
		else
		{
			System.out.println("Nomis 2000");
		}
	}

	public static void main(String[] args) {

		int i=10;
		
		if(i<5)
		{
			System.out.println("No is greater than 5");
		}
		else
		{
			System.out.println("No is 10");
		}

		//create object
		If_Else demo=new If_Else();
		
		demo.print();//call instance method
		
		verify();//call static method
	}

}
