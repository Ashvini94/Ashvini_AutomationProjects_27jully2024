package Methods;

public class Class_004 {
	
	//instance variable
	int i=100;
	
	//static variable
	static long l=2000;
	
	//instance method
	public void method1()
	{
		System.out.println(i);//instance variable
		System.out.println(l);//static variable
	}
	
	//static method
	public static void method2()
	{
		System.out.println(l);//static variable
		
		//to call instance variable
		Class_004 c4 = new Class_004();
		
		System.out.println(c4.i);//instance variable
	}

	public static void main(String[] args) {

		//to call instance method create object of class
		Class_004 c4 = new Class_004();
		c4.method1();
		
		//call static method 
		method2();
		

	}

}
