package Methods;

public class Class_003 {

	//instance variable
	
	int a;
	
	//instnace method with parameter
	
	public void print(int j)
	{
		a=j;
		System.out.println("Value of a is: "+a);
	}
	
	static int b;
	static long l;
	
	//static method with parameter
	
	static public void verify(int m,long ln)
	{
		b=m;
		l=ln;
		System.out.println("Thae value of b is: "+b);
		System.out.println("The value of l is: "+l);
				
	}
	
	
	public static void main(String[] args) {
		Class_003 cs=new Class_003();
		
		cs.print(100);//call instance method
		
		verify(500,1000);//call static method
	
	}

}
