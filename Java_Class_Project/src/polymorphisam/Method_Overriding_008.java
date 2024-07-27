package polymorphisam;

public class Method_Overriding_008 extends Method_Overriding_007{

	
	public long get(long l)
	{
		System.out.println("This is get method from class Method_Overriding_008");
		return l;
	}
	
	
	public Number get_data(int a)
	{
		System.out.println("This is get_data method from class Method_Overriding_008");
		return a;
	}
	
	
	//here Integer can hold value of primitive data type int and Integer is sub class of Number class
	public Integer print(int b)
	{
		System.out.println("This is print method from class Method_Overriding_008");
		return b;
	}
	
/*	public Number verify(int x) //error bec return type should be same or sub class of parent class method
	{
		System.out.println("This is verify method from class Method_Overriding_008");
		return x;
	}
	
	*/
	
	
	public static void main(String[] args) {
		
		

	}

}
