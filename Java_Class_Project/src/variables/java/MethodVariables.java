package variables.java;

public class MethodVariables {

	//instance variable
	int i=20;
	
	static byte b=123;
	
	//instance method
	public void print()
	{
		
		//call instance variable in instance method
		System.out.println(i);//20
		
		//call static variable
		System.out.println(b);//123
		
		//local variable
		
		char c='x';
		System.out.println(c);//x
	}
	
	static public void verify()
	{
		//call static variable directly
		System.out.println(b);//123
		
		//call instance variable in static method
		
		MethodVariables m=new MethodVariables();
		System.out.println(m.i);//20
		
		//loacl variable
		int a=300;
		//call local variable
		System.out.println(a);//300
	}
	
	public static void main(String[] args) {
		
		short s= 23456;
		
		//call local variable 
		System.out.println(s);//23456

		MethodVariables m=new MethodVariables();
		
		//call instance variable
		System.out.println(m.i);//20
		
		//call static variable//123
		System.out.println(b);
		
		//to call instance method
		m.print();
		
		//to call static method directly
		verify();
	}

}
