package operators;

public class Class_004 {
	
	//we can use operator in static and instance method also
	
	int a=10;
	int b=20;
	
	
	
	public void m1()
	{
		System.out.println(a+b);
	}
	
	public static void m2()
	{
		Class_004 c4=new Class_004();
		System.out.println(c4.a+c4.b);
	}
	
	public static void main(String[] args) {
		
		Class_004 c4=new Class_004();
		c4.m1();
		
		m2();
		

	}

}
