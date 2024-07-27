package Methods;

public class Class_005 {
	
	int x=200;//instance varaible
	
	static int y=400;//static variable
	
	
	//instance method
	public void demo1()
	{
		System.out.println("This is instance method");
		System.out.println(x);
		System.out.println(y);
	}
	
	//static method
	public static void demo2()
	{
		System.out.println("This is static method");
		System.out.println(y);
		
		Class_005 c5=new Class_005();
		System.out.println(c5.x);
	}

	public static void main(String[] args) {
		
		
		Class_005 c5=new Class_005();
		
		c5.demo1();//call instance method
		
		demo2();//call static method directly
		Class_005.demo2();//call static method with the help of classname
		c5.demo2();//call static method with reference variable
		
		
	}

}
