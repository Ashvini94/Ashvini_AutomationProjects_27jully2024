package control_statement;

public class If {

	int a=100;
	
	static long l=2000;
	
	//instance method
	public void print()
	{
		if(a>50)
		{
			System.out.println("No is greater than 50");
		}
	}
	
	//static method
	
	static public void verify()
	{
		if(l==2000)
		{
			System.out.println("No is 2000");
		}
	}
	
	
	public static void main(String[] args) {
	
		
		int i=10;
		
		//if statement
		if(i==10)
		{
			System.out.println(i);//true
		}
		
		//create object of class
		If demo=new If();
		demo.print();//call instance method
		
		//call static method
		verify();
	}
	
	
}
