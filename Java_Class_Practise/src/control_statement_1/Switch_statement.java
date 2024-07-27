package control_statement_1;

public class Switch_statement {
	
	
	int var=50;
	
	public void print()
	{
		switch(var)
		{
		case 200:
			System.out.println("value is 200");
			break;
		case 300:
			System.out.println("value is 100");
			break;
		default:
			System.out.println("invalid");
			break;
		}
	}
	
	

	public static void main(String[] args) {
		
		int variable=100;
		
		switch(variable)
		{
		case 200:
			System.out.println("value is 200");
			break;
		case 300:
			System.out.println("value is 100");
			break;
		default:
			System.out.println("invalid");
			break;
		}

	}

}
