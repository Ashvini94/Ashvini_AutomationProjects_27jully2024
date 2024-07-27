package this_keyword;

//c.This keyword is used to invoke current class constructor
//example 1-->Access two constructor at once

public class This_005 {

	public This_005()
	{
		System.out.println("This is user defined constructor with no argument");
	}
	
	public This_005(int x)
	{
		this();
		System.out.println("This is parameterized constructor with argument");
	}
	
	public static void main(String[] args) {
		
		This_005 t5=new This_005(300);
		

	}

}
