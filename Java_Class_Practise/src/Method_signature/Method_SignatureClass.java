package Method_signature;

public class Method_SignatureClass {
	
	//no parameter and no return statement
	public static void print()
	{
		System.out.println("This is print method");
	}
	
	//no return statement with parameter
	public static void display(int a)
	{
		System.out.println(a);
	}
	
	//no parameter with return statement
	public static void show()
	{
		System.out.println("This is show method");
		return;
	}
	
	//with parameter with return statemment
	public static String verify(String name)
	{
		System.out.println(name);
		return name;
	}
	
	//with parameter with return statement
	public static Object method1( Object i)
	{
		System.out.println("This is method1");
		return i;
	}
	

	public static void main(String[] args) {
		
		print();
		display(100);
		show();
		verify("Ankit");
		method1(200);
		

	}

}
