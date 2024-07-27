package variables;

public class Class_002 {

	//instance variable
	int a=200;
	
	//static variable
	static int b=500;
	
	//instance method
	public void print()
	{
		//local variable 
		int x=150;
		
		System.out.println(x);//150
		
		//instance variable
		System.out.println(a);//200
		
		//static variable
		System.out.println(b);//500
	}
	
	static public void verify()
	{
		//static variable
		System.out.println(b);//500
		
		Class_002 cs=new Class_002();
		
		//instance variable
		System.out.println(cs.a);//200
	}
	
	public static void main(String[] args) {
		
		Class_002 cs=new Class_002();
		cs.print();//call instance method
		
		verify();//call static method

		
		

	}

}
