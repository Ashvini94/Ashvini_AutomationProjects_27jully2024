package java_decision_statement1;

public class Class_002 {

	//instance variable
	int i=100;
	
	//instance method
	public void print()
	{
		if(i>50)//true
		{
			System.out.println("The value of i is 100");
		}
	}
	public static void main(String[] args) {

		//create object 
		Class_002 cs=new Class_002();
		
		//call instance method by using ref variable
		cs.print();


	}

}
