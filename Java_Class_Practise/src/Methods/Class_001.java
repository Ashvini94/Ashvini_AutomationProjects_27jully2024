package Methods;

public class Class_001 {

	//instance method
	
	public void method1()
	{
		int x=10;
		int y=20;
		System.out.println(x);
		System.out.println(y);
	}
	
	//static method
	static public void method2()
	{
		int a=100;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {

		//create object
		Class_001 cs=new Class_001();
		cs.method1();//call instance method
		
		//call static method
		method2();//call directly
		
		Class_001.method2();//call by using class name
		
		cs.method2();//call by using reference variable
		
		

	}

}
