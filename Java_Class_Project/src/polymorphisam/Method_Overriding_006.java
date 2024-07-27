package polymorphisam;

public class Method_Overriding_006 extends Method_Overriding_005{
	
	
	//static method cannot override here triangle symbol is not come
	public static void m1()
	{
		System.out.println("This is m1 method of child class Method_Overriding_005");
	}
	
/*	public final void m2()//error -->we cannot override final method
	{
		System.out.println("This is final  m2 method of parent class Method_Overriding_005");
	}
	
	*/
	
	//instance method
		public void m3()
		{
			System.out.println("this is instance method of child class Method_Overriding_005");
		}
		
	
	public static void main(String[] args) {
		
		//child class object
		Method_Overriding_006 m6=new Method_Overriding_006();
		//m6.m3();
		
		//parent class ref variable hold child class object
		Method_Overriding_005 m5=new Method_Overriding_006();
		m5.m3();

	}

}
