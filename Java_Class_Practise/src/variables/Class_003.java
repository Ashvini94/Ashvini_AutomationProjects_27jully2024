package variables;

public class Class_003 {

	//instance variable
	int i=100;
	
	//static variable
	static int j=200;
	
	//instance method
	public void print()
	{
		//instnace variable
		System.out.println("value of instance variable i is: "+i);
		
		//static variable
		System.out.println("value of static variable j is: "+j);
		
	
	}
	
	//static method
	static public void verify()
	{
		//Static variable
		System.out.println("Value of static variable j is: "+j);
		
		//instance variable 
		Class_003 cs2=new Class_003();
		System.out.println("Value of instance variable i is: "+cs2.i);
		
	}
	
	public static void main(String[] args) {

		Class_003 cs=new Class_003();
		
		//call instance method
		cs.print();
	
		//System.out.println(cs.i);//call instance variable

		System.out.println(cs.j);//call static variable
	
		System.out.println(Class_003.j);//call static variable with the help of classname

		System.out.println(j);//call static variable directly
		
		//call static method
		verify();
	}

}
