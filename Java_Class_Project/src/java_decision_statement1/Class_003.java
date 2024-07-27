package java_decision_statement1;

public class Class_003 {

	//static variable
	static long l=200456;
	
	//static method
	static public void verify()
	{
		if(l>20000)//true
		{
			System.out.println("Condition is true");
		}
	}
	
	public static void main(String[] args) {

		//call static method directly
		verify();
		
		//call static method by using classname
		Class_003.verify();
		
		//create object
		Class_003 cs=new Class_003();
		cs.verify();
		
		

	}

}
