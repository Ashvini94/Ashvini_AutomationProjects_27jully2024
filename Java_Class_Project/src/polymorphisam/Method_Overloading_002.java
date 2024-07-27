package polymorphisam;

//possible promotion in method overloading -->byte-->short-->int-->long-->float-->double

public class Method_Overloading_002 {
	
/*	public static void  m1(int a)
	{
		System.out.println("This is m1 method with int type argument");
	}
	
	*/
	/*public static void  m1(float f)
	{
		System.out.println("This is m1 method with float type argument");
	}
	*/
	
	
	/*public static void  m1(long l)
	{
		System.out.println("This is m1 method with long type argument");
	}
	*/
	
	
	public static void  m1(double d)
	{
		System.out.println("This is m1 method with double type argument");
	}
	public static void m1()
	{
		System.out.println("This is m1 method with no argument");
	}

	public static void main(String[] args) {
		
		//call static method directly
		
		m1();//call static method m1 with no parameter
		m1(100);//call static method m1 with int type parameter
		//m1(10.25f);//call static method m1 with float type parameter
		//m1(1000l);//call static method m1 with long type parameter
		//m1(1000.25);//call static method m1 with double type parameter
		

	}

}
