package control_statement;

public class SwitchStatement_1 {

	
	//instance variable
	int i=700;
	
	//instance method
	public void print()
	{
		switch(i)
		{
		case 10:
			System.out.println("The value is 10");
			break;
		case 20:
			System.out.println("The value is 20");
			break;
		case 100:
			System.out.println("The value is 100");
			break;
		default:
			System.out.println("Invalid value");
		}
	}
	
	//static variable
	static int j=500;
	
	//static method
	static public void verify()
	{
		switch(j)
		{
		case 100:
			System.out.println("The value is 100");
			break;
		case 200:
			System.out.println("The value is 200");
			break;
		case 300:
			System.out.println("The value is 300");
			break;
		default:
			System.out.println("All values are invalid");
			break;
		}
	}
	public static void main(String[] args) {

		SwitchStatement_1 st=new SwitchStatement_1();
		st.print();//call instance method
		
		//call static method
		verify();

		

	}

}
