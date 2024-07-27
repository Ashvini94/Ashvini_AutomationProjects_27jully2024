package control_statement;

public class Class_002 {

	//instance variable
	int a=200;
	
	//instance method
	public void print()
	{
		if(a>300)//false
		{
			System.out.println("First condition is true");
		}
		else
		{
			System.out.println("Second condition is false");
		}
	}
	
	//static variable 
	static int x=500;
	
	//static method
	static public void verify()
	{
		if(x>1000)
		{
			System.out.println("The first condition is true");
		}
		else
		{
			System.out.println("The second condition is false");
		}
	}
	
	
	public static void main(String[] args) {

		int a=100;
		
		//if else
		if(a>500)//false
		{
			System.out.println("Condition is true");
		}
		else
		{
			System.out.println("Condition is false");
		}
		
		//call instance method
		Class_002 cs=new Class_002();
		cs.print();
		
		//call static method
		verify();
		
	}

}
