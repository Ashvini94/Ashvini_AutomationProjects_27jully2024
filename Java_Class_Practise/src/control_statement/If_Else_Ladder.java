package control_statement;

public class If_Else_Ladder {
	
	

	public static void main(String[] args) {


		int a=200;
		
		//if else ladder
		if(a!=200)//true
		{
			System.out.println("a is 200");
		}
		else if(a<100)//true
		{
			System.out.println("a is greater than 100");
		}
		else if(a>300)//true
		{
			System.out.println("a is less than 300");
		}
	
		else
		{
			System.out.println("All the conditions are false");
		}

	}

}
