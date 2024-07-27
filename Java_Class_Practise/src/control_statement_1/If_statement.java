package control_statement_1;

public class If_statement {

	//instance variable
	int x=200;
	static int y=400;
	
	public void print()
	{
		if(x>100)
		{
			System.out.println("x is greater than 100");
		}
	}
	
	public static void show()
	{
		if(y>200)
		{
			System.out.println("y is greater than 400");
		}
	}
	
	
	public static void main(String[] args) {
		
		int a=100;
		
		if(a==100)
		{
			System.out.println("Condition is true");
		}
		
		If_statement is=new If_statement();
		is.print();
		show();
	}

}
