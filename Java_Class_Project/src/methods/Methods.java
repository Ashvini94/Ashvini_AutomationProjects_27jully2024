package methods;

public class Methods {

	//instance method 
	public void print()
	{
		int i = 200;
		System.out.println(i);//200
	}
	
	
	//static method 
	public static void verify()
	{
		byte b=125;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		//to call instance method 
		Methods m=new Methods();
		m.print();
		
		//directly call static method 
		verify();
		
		//call static method with the help of classname
		Methods.verify();
		
		//call static method by ref variable 
		m.verify();

	}

}
