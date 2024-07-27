package java_decision_statement2;

public class Class_003 {
	
	//static variable
	static short s=1000;
	
	//static method
	static public void verify()
	{
		if(s<200)//false
		{
			System.out.println("Condition is true");
		}
		else
		{
			System.out.println("condition is false");
		}
	}

	public static void main(String[] args) {

		verify();

		

	}

}
