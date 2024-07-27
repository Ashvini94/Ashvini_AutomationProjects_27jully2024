package control_statement;

public class If_Else_Ladder1 {

	//instance variable
	int a=100;
	
	//instance method
	public void print()
	{
		if(a==100)//true
		{
			System.out.println("Value of a is 100");
		}
		else if(a>50)
		{
			System.out.println("value of a is greater than 50");
		}
		else if(a<300)
		{
			System.out.println("Value of a is less than 300");
		}
		else
		{
			System.out.println("All the conditons are false");
		}
	}
	
	
	//static method
	static int j=200;
	
	//static method
	static public void verify()
	{
		if(j!=200)//false
		{
			System.out.println("Value of j is 200");
		}
		else if(j<100)//flase
		{
			System.out.println("Value of j is greater than 100");
		}
		else if(j>500)//false
		{
			System.out.println("value of j is less than 500");
		}
		else
		{
			System.out.println("All the conditions are false");
		}
	}
	
	public static void main(String[] args) {

		If_Else_Ladder1 main=new If_Else_Ladder1();
		
		//call instance method
		main.print();
		
		//call static method
		verify();
		

	}

}
