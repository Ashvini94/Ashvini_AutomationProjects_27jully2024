package operators;

public class Class_002 {

	int x=100;
	int y=200;
	
	//instance method
	public void print()
	{
		System.out.println("Addition of x and y is: "+(x+y));//300
	}
	
	//static variable
	
	static long ln1=2000;
	static long ln2=5000;
	
	//static method
	static public void verify()
	{
		System.out.println("Addition of ln1 and ln2 is: "+(ln1+ln2));//7000
	}
	
	public static void main(String[] args) {

		//arithmatic operator
		
		int a=20;
		int b=10;
		
		System.out.println("Addition of a nd b is: "+(a+b));//30
		
		//call instance method
		
		Class_002 cs=new Class_002();
		cs.print();//call instance method
		
		//call static method
		verify();

	}

}
