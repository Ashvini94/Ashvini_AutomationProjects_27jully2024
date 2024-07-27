package non_access_modifier;

public class Static_block {

	//we can not override static method
	//static block-->static block will be always execute first before method and constructor
	static
	{
		System.out.println("This is a static block");//first execute
	}
	
	//instance method
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	//constructor
	public Static_block()
	{
		System.out.println("this is constructor");
	}
	
	
	public static void main(String[] args) {
		
		Static_block sb=new Static_block();
		sb.m1();

	}

}
