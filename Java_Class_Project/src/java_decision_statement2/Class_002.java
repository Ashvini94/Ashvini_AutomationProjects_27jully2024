package java_decision_statement2;

public class Class_002 {
	
	//instance variable
	byte b=120;
	
	//instance method
	public void print()
	{
		if(b>200)//false
		{
			System.out.println("condition is true");
		}
		else
		{
			System.out.println("Condition is false");
		}
	}

	public static void main(String[] args) {

		Class_002 cs=new Class_002();
		
		cs.print();
		

	}

}
