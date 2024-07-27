
public class Variables_001 {
	
	//instance variable
	int i=500;
	
	//static variable
	static byte by=124;
	
	//instance method
	public void print()
	{
		//local variable
		short s=3456;
		//to call local variable directly
		System.out.println("Local variabble in instance method:"+s);//3456
		
		//to access instance variable directly
		System.out.println("Instance variable in instance method:"+i);//500
		
		//to access static variable directly
		System.out.println("Static variable in instance method:"+by);//124
	}

	//static method
	static public void verify()
	{
		//local variable
		boolean b=true;
		
		//to access local variable directly
		System.out.println("loacl variable in static method:"+b);//true
		
		//to access static variable directly
		System.out.println("Static variable:"+by);//124
		
		//create object to access instance variable
		Variables_001 v=new Variables_001 ();
		//to access instance variable
		System.out.println("Instance variable in static method:"+v.i);//500
		
	}
	public static void main(String[] args) {

		//local variable 
		
		char c='p';
		System.out.println("Local variable call in main method:"+c);//p

		//create object
		Variables_001 v=new Variables_001();
		
		//to access instance variable in static method by using ref variable
		System.out.println("Instance variable in main method:"+v.i);//500
		
		//to access instance variable
		v.print();
		
		//to access instance variable by using ref variable
		//System.out.println(v.i);//500

		//to access static method directly
		 verify();
	}

}
