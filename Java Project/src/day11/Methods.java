package day11;

public class Methods {

	
	//1.no parameter no return value
	void m1()
	{
		System.out.println("Hello");
	}
	
	//no parameter return value
	String m2()
	{
		return ("How are you?");//here returns string type data hence use string data type to method
	}

	
	//with parameter and no return value
	void m3(String name)
	{
		System.out.println("name is "+name);//John
	}
	
	//with parameter return value
	String m4(String name)
	{
		return ("I am ok "+name);
	}

}
