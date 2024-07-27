package control_statement;

public class Class_001 {

	//instance variable
	int a=200;
	
	//instance method 
	public void print()
	{
		if(a>100)
		{
			System.out.println("The value of a is: "+a);
		}
	}
	
	//static variable
	static int j=500;
	
	//static method 
	static public void verify()
	{
		if(j>100)
		{
			System.out.println("The value of j is: "+j);
		}
	}
	
	
	public static void main(String[] args) {


		int i=100;
		
		//if statement
		if(i==100)
		{
			System.out.println("The value of i is: "+i);
		}
	
		//call instance method
		Class_001 cs=new Class_001();
		cs.print();
		
		//call static method
		verify();

	}

}
