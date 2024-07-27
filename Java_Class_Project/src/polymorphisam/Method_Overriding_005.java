package polymorphisam;

public class Method_Overriding_005 {

	/*rule 2 -->non-access modifier-->1.we can not override static method
	 * 								  2.we can override instance method
	 * 								  3.we can override abstarct method
	 * 								  4.we can not override final method
	 */
	
	public static void m1()
	{
		System.out.println("This is m1 method of parent class Method_Overriding_005");
	}
	
	
	/*final method cannot override bec it is constant or fix
	 * 
	 * 
	 */
	
	public final void m2()
	{
		System.out.println("This is final  m2 method of parent class Method_Overriding_005");
	}
	
	//instance method
	public void m3()
	{
		System.out.println("this is instance method of parent class Method_Overriding_005");
	}
	
	public static void main(String[] args) {
		

	}

}
